package br.com.mastertech.payment.client;

import br.com.mastertech.payment.exception.CardServiceDownException;

public class CardFallback implements CardClient {

    @Override
    public Card getCardById(Long cardId) {
        throw new CardServiceDownException();
    }
}
