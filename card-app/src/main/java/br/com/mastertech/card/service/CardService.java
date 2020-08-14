package br.com.mastertech.card.service;

import br.com.mastertech.card.client.Customer;
import br.com.mastertech.card.client.CustomerClient;
import br.com.mastertech.card.entity.Card;
import br.com.mastertech.card.exception.CardAlreadyExistsException;
import br.com.mastertech.card.exception.CardNotFoundException;
import br.com.mastertech.card.repository.CardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CardService {
    private final CardRepository cardRepository;
    private final CustomerClient customerClient;
    private final Logger log = LoggerFactory.getLogger(CardService.class);

    public CardService(CardRepository cardRepository, CustomerClient customerClient) {
        this.cardRepository = cardRepository;
        this.customerClient = customerClient;
    }

    public List<Card> findAll() {
        Iterable<Card> all = cardRepository.findAll();
        return StreamSupport.stream(all.spliterator(), false).collect(Collectors.toList());
    }

    public Card save(Long customerId, Card card) throws CardAlreadyExistsException {
        if(cardRepository.findByNumber(card.getNumber()).isPresent()){
            throw new CardAlreadyExistsException(MessageFormat.format("O cartão {0} já foi cadastrado.", card.getNumber()));
        }
        Customer customer = customerClient.getCustomer(customerId);
        card.setCustomerId(customer.getId());
        return cardRepository.save(card);
    }

    public Card activateCard(String number, boolean active) throws CardNotFoundException {
        Card card = getCardByNumber(number);
        card.setActive(active);
        return cardRepository.save(card);
    }

    public Card expireCard(Long customerId, Long cardId) throws CardNotFoundException {
        //Chama antes para validar somente o cliente
        Customer customer = customerClient.getCustomer(customerId);
        Card card = cardRepository.findByIdAndCustomerId(cardId, customerId).orElseThrow(() ->
                new CardNotFoundException(MessageFormat.format("O cartão {0} não foi encontrado para o cliente {1}.",
                        cardId, customer.getName())));
        card.setExpired(Boolean.TRUE);
        return cardRepository.save(card);
    }

    public Card findByNumber(String number) throws CardNotFoundException {
        return getCardByNumber(number);
    }

    private Card getCardByNumber(String number) throws CardNotFoundException {
        return cardRepository.findByNumber(number).orElseThrow(() ->
                new CardNotFoundException(MessageFormat.format("O cartão com o número {0} não foi encontrado.", number)));
    }

    public Card findById(Long cardId) throws CardNotFoundException {
        return cardRepository.findById(cardId).orElseThrow(() -> new CardNotFoundException("O cartão não foi encontrado"));
    }

    public Card findByIdAndCustomerId(Long cardId, Long customerId) throws CardNotFoundException {
        log.info(MessageFormat.format("Vai buscar o cartão com o id {0} do cliente id {1}",
                cardId, customerId));
        //Chama antes para validar somente o cliente
        Customer customer = customerClient.getCustomer(customerId);
        return cardRepository.findByIdAndCustomerId(cardId, customerId).orElseThrow(() ->
                new CardNotFoundException(MessageFormat.format("O cartão {0} não foi encontrado para o cliente {1}.",
                        cardId, customer.getName())));
    }
}
