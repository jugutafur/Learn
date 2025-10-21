package net.javaguides.sms.Domain.Service;

import net.javaguides.sms.Domain.City;
import net.javaguides.sms.Domain.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getAllCity() {
        return cityRepository.getAllCity();
    }

    public Optional<City> getCity(int id) {
        return cityRepository.getCity(id);}

    public City saveCity(City city) {
        return cityRepository.saveCity(city);}

    public boolean deleteCity(int cityId) {
        return getCity(cityId).map(city ->{
            cityRepository.deleteCity(cityId);
            return true;
        }).orElse(false);
    }
}
