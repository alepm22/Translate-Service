package com.example.examen;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TransServiceTest {

    @Mock
    ApiTranslate apiTranslate;

    @InjectMocks
    TransService translateService;
    @Test
    void translate() {

        when(apiTranslate.translate("Hola", Language.ES.toString(),Language.EN.toString())).thenReturn("Hello");
        TransRequestDto requestDto=new TransRequestDto("Hola",Language.ES,Language.EN);
        assertEquals("Hello",translateService.translate(requestDto));
    }

}