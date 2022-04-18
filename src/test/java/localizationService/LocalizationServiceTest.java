package localizationService;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceTest {

    @Test
    public void ruLocalizationService() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        String expected = "Добро пожаловать";

        String result = localizationService.locale(Country.RUSSIA);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void engLocalizationService() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        String expected = "Welcome";

        String result = localizationService.locale(Country.USA);

        Assertions.assertEquals(expected, result);
    }


}
