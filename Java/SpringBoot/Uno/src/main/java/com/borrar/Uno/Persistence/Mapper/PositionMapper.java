package com.borrar.Uno.Persistence.Mapper;

import com.borrar.Uno.Domain.Position;
import com.borrar.Uno.Persistence.Entity.Cargo;
import org.mapstruct.Mapping;
import org.mapstruct.Mapper;
import org.mapstruct.InheritInverseConfiguration;

import java.util.List;

@Mapper(componentModel = "spring" )
public interface PositionMapper {

	@Mapping(source="nombreCargo", target="namePosition")

	Position toPosition(Cargo cargo);
	List<Position> toListPosition(List<Cargo> cargos);

	@InheritInverseConfiguration
	Cargo toCargo(Position position);
}
