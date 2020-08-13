package br.com.mastertech.card.mapper;

import br.com.mastertech.card.dto.CardInfoResponse;
import br.com.mastertech.card.dto.CardRequest;
import br.com.mastertech.card.dto.CardResponse;
import br.com.mastertech.card.entity.Card;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DataMapper {
    DataMapper INSTANCE = Mappers.getMapper(DataMapper.class);

    Card cardRequestToCard(CardRequest cardRequest);
    CardRequest cardToCardRequest(Card card);
    CardResponse cardToCardResponse(Card card);
    CardInfoResponse cardToCardInfoResponse(Card card);
    List<CardRequest> cardToCardRequest(List<Card> card);
}
