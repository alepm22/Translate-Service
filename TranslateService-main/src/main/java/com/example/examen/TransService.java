package com.example.examen;

public class TransService {

    ApiTranslate apiTranslate;
    TransService(ApiTranslate apiTranslate){
        this.apiTranslate = apiTranslate;
    }

    public String translate(TransRequestDto translateRequestDto){
        return apiTranslate.translate(translateRequestDto.message(),
                translateRequestDto.source().toString(),
                translateRequestDto.target().toString());
    }
}
