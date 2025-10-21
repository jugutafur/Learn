package net.javaguides.sms.Persistence;

import net.javaguides.sms.Domain.Position;
import net.javaguides.sms.Domain.Repository.PositionRepository;
import net.javaguides.sms.Persistence.Entity.Cargo;

import net.javaguides.sms.Persistence.CRUD.CargoCRUDRepository;
import net.javaguides.sms.Persistence.Mapper.PositionMapper;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Repository
public class CargoRepository implements PositionRepository{
	
	@Autowired
	private CargoCRUDRepository cargoCRUDRepository;

	@Autowired
	private PositionMapper positionMapper;

	@Override
	public List<Position> getAllPosition() {
		List<Cargo> cargos = (List<Cargo>) cargoCRUDRepository.findAll();
		return positionMapper.toListPosition(cargos);
	}

	@Override
	public Optional<Position> getPosition(int id) {
		return cargoCRUDRepository.findById(id).map(Position-> positionMapper.toPosition(Position));
	}

	@Override
	public Position savePosition(Position position) {
		Cargo cargo = positionMapper.toCargo(position);
		return positionMapper.toPosition(cargoCRUDRepository.save(cargo));
	}

	@Override
	public void deletePosition(int positionId) {
		cargoCRUDRepository.deleteById(positionId);
	}
}