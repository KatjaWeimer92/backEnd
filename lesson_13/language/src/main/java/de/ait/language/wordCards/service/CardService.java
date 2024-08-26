package de.ait.language.wordCards.service;

import de.ait.language.wordCards.dto.RequestCard;
import de.ait.language.wordCards.dto.ResponseCard;

import java.util.List;

public interface CardService {
    List<ResponseCard> findAll();
    ResponseCard save(RequestCard requestCard);
    List<ResponseCard> getCards
            (String language,String word,String example,String translateLanguage,String translation,String groups);
}
