package net.javaguides.sms.Persistence.Mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.javaguides.sms.Domain.City;
import net.javaguides.sms.Persistence.Entity.Ciudad;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-19T19:23:38-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
@Component
public class CityMapperImpl implements CityMapper {

    @Override
    public City toCity(Ciudad ciudad) {
        if ( ciudad == null ) {
            return null;
        }

        City city = new City();

        city.setNameCity( ciudad.getNombreCiudad() );
        if ( ciudad.getId() != null ) {
            city.setId( ciudad.getId() );
        }

        return city;
    }

    @Override
    public List<City> toListCity(List<Ciudad> ciudads) {
        if ( ciudads == null ) {
            return null;
        }

        List<City> list = new ArrayList<City>( ciudads.size() );
        for ( Ciudad ciudad : ciudads ) {
            list.add( toCity( ciudad ) );
        }

        return list;
    }

    @Override
    public Ciudad toCiudad(City city) {
        if ( city == null ) {
            return null;
        }

        Ciudad ciudad = new Ciudad();

        ciudad.setNombreCiudad( city.getNameCity() );
        ciudad.setId( city.getId() );

        return ciudad;
    }
}
