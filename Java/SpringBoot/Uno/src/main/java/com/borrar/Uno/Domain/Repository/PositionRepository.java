package com.borrar.Uno.Domain.Repository;

import com.borrar.Uno.Domain.Position;

import java.util.List;
import java.util.Optional;

public interface PositionRepository {
	List<Position> getAllPosition();
	Optional<Position> getPosition(int id);
	Position savePosition(Position position);
	void deletePosition (int positionId);
}
