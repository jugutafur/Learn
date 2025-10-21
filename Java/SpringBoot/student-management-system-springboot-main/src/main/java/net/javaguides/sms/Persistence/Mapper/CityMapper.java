package net.javaguides.sms.Persistence.Mapper;

import net.javaguides.sms.Domain.City;
import net.javaguides.sms.Persistence.Entity.Ciudad;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {

    @Mapping(source = "nombreCiudad", target = "nameCity")

    City toCity(Ciudad ciudad);
    List<City> toListCity(List<Ciudad> ciudads);

    @InheritInverseConfiguration
    Ciudad toCiudad(City city);
}
