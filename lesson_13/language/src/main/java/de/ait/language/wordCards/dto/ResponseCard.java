package de.ait.language.wordCards.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseCard {
    private Long id;
    private String  language;
    private String  word;
    private String example;
    private String translateLanguage;
    private String translation;
    private String groups;

}
