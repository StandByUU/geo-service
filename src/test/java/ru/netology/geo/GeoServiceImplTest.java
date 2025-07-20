package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    @Test
    void byIpRussianSegment() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location location = geoService.byIp("172.0.32.11");
        
        assertEquals("Moscow", location.getCity());
        assertEquals(Country.RUSSIA, location.getCountry());
    }

    @Test
    void byIpAmericanSegment() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location location = geoService.byIp("96.44.183.149");
        
        assertEquals("New York", location.getCity());
        assertEquals(Country.USA, location.getCountry());
    }

    @Test
    void byIpLocalhost() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location location = geoService.byIp("127.0.0.1");
        
        assertNull(location.getCountry());
    }

    @Test
    void byIpOtherIp() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location location = geoService.byIp("10.0.0.1");
        
        assertNull(location);
    }
}
