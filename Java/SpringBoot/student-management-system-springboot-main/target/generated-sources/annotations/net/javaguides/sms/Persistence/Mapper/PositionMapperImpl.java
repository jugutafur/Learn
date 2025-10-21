package net.javaguides.sms.Persistence.Mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.javaguides.sms.Domain.Position;
import net.javaguides.sms.Persistence.Entity.Cargo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-19T19:23:38-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
@Component
public class PositionMapperImpl implements PositionMapper {

    @Override
    public Position toPosition(Cargo cargo) {
        if ( cargo == null ) {
            return null;
        }

        Position position = new Position();

        position.setNamePosition( cargo.getNombreCargo() );
        if ( cargo.getId() != null ) {
            position.setId( cargo.getId() );
        }

        return position;
    }

    @Override
    public List<Position> toListPosition(List<Cargo> cargos) {
        if ( cargos == null ) {
            return null;
        }

        List<Position> list = new ArrayList<Position>( cargos.size() );
        for ( Cargo cargo : cargos ) {
            list.add( toPosition( cargo ) );
        }

        return list;
    }

    @Override
    public Cargo toCargo(Position position) {
        if ( position == null ) {
            return null;
        }

        Cargo cargo = new Cargo();

        cargo.setNombreCargo( position.getNamePosition() );
        cargo.setId( position.getId() );

        return cargo;
    }
}
