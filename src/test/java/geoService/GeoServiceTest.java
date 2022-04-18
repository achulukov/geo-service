package geoService;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceTest {

    @Test
    public void ruTestByIp() {

        GeoServiceImpl geoService = new GeoServiceImpl();

        Location expected = geoService.byIp("172.0.32.11");

        Location result = new Location("Moscow", Country.RUSSIA, "Lenina", 15);

        Assertions.assertEquals(expected, result);

    }
    @Test
    public void engTestByIp() {

        GeoServiceImpl geoService = new GeoServiceImpl();

        Location expected = geoService.byIp("96.44.183.149");

        Location result = new Location("New York", Country.USA, " 10th Avenue", 32);

        Assertions.assertEquals(expected, result);

    }
}
