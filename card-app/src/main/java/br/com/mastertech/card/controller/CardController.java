package br.com.mastertech.card.controller;

import br.com.mastertech.card.dto.CardActivationRequest;
import br.com.mastertech.card.dto.CardRequest;
import br.com.mastertech.card.entity.Card;
import br.com.mastertech.card.exception.CardAlreadyExistsException;
import br.com.mastertech.card.exception.CardNotFoundException;
import br.com.mastertech.card.mapper.DataMapper;
import br.com.mastertech.card.service.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.List;

@RestController
@Validated
@RequestMapping("/cartao")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public ResponseEntity getAllCards() {
        List<CardRequest> cardRequestList = DataMapper.INSTANCE.cardToCardRequest(cardService.findAll());
        return ResponseEntity.ok(cardRequestList);
    }

    @PostMapping
    public ResponseEntity saveCard(@RequestBody @Valid CardRequest cardRequest) throws CardAlreadyExistsException {
        Card card = DataMapper.INSTANCE.cardRequestToCard(cardRequest);
        CardRequest savedCard = DataMapper.INSTANCE.cardToCardRequest(cardService.save(cardRequest.getCustomerId(), card));
        return ResponseEntity.created(URI.create("")).body(savedCard);
    }

    @PatchMapping("/{numero}")
    public ResponseEntity activateCard(
            @Valid
            @NotNull(message = "O numero do cartão deve ser informado.")
            @NotEmpty(message = "O numero do cartão deve ser informado.")
            @PathVariable("numero") String number, @RequestBody @Valid CardActivationRequest cardActivationRequest) throws CardNotFoundException {
        Card patchedCard = cardService.activateCard(number, cardActivationRequest.isAtivo());
        return ResponseEntity.ok().body(DataMapper.INSTANCE.cardToCardRequest(patchedCard));
    }

    @GetMapping("/{numero}")
    public ResponseEntity getCard(
            @Valid
            @NotNull(message = "O numero do cartão deve ser informado.")
            @NotEmpty(message = "O numero do cartão deve ser informado.")
            @PathVariable("numero") String number) throws CardNotFoundException {
        Card card = cardService.findByNumber(number);
        return ResponseEntity.ok().body(DataMapper.INSTANCE.cardToCardResponse(card));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity getCardById(
            @Valid
            @NotNull(message = "O id do cartão não pode ser nulo.")
            @Min(value = 1, message = "O id do cartão deve ser um número positivo.")
            @PathVariable("id") Long cardId) throws CardNotFoundException {
        Card card = cardService.findById(cardId);
        return ResponseEntity.ok().body(DataMapper.INSTANCE.cardToCardInfoResponse(card));
    }

    @GetMapping("/id/{id}/customer/{customer-id}")
    public ResponseEntity getCardByIdAndCustomerId(
            @Valid
            @NotNull(message = "O id do cartão não pode ser nulo.")
            @Min(value = 1, message = "O id do cartão deve ser um número positivo.")
            @PathVariable("id") Long cardId,
            @Valid
            @NotNull(message = "O id do cliente não pode ser nulo.")
            @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
            @PathVariable("customer-id") Long customerId) throws CardNotFoundException {
        Card card = cardService.findByIdAndCostumerId(cardId, customerId);
        return ResponseEntity.ok().body(DataMapper.INSTANCE.cardToCardInfoResponse(card));
    }

    @PostMapping("/{cliente-id}/{cartao-id}/expirar")
    public ResponseEntity expireCard(@Valid
                              @NotNull(message = "O id do cliente não pode ser nulo.")
                              @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
                              @PathVariable("cliente-id") Long customerId,
                              @Valid
                              @NotNull(message = "O id do cartão não pode ser nulo.")
                              @Min(value = 1, message = "O id do cartão deve ser um número positivo.")
                              @PathVariable("cartao-id") Long cardId) throws CardNotFoundException {
        Card card = cardService.expireCard(customerId, cardId);
        return ResponseEntity.ok().body(DataMapper.INSTANCE.cardToCardInfoResponse(card));
    }
}
