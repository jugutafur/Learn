package net.javaguides.sms.Persistence.Mapper;

import net.javaguides.sms.Domain.Position;
import net.javaguides.sms.Persistence.Entity.Cargo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PositionMapper {

	@Mapping(source="nombreCargo", target="namePosition")

	Position toPosition(Cargo cargo);
	List<Position> toListPosition(List<Cargo> cargos);

	@InheritInverseConfiguration
	Cargo toCargo(Position position);
}
