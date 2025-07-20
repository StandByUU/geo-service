package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    void localeRussia() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String result = localizationService.locale(Country.RUSSIA);
        
        assertEquals("Добро пожаловать", result);
    }

    @Test
    void localeNonRussia() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String result = localizationService.locale(Country.USA);
        
        assertEquals("Welcome", result);
    }
}
