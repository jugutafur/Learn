package net.javaguides.sms.Domain.Repository;

import net.javaguides.sms.Domain.City;
import java.util.List;
import java.util.Optional;

public interface CityRepository {
    List<City> getAllCity();
    Optional<City> getCity(int id);
    City saveCity(City city);
    void deleteCity(int cityId);
}
