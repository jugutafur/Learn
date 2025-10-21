package com.borrar.Uno.Domain.Service;

import com.borrar.Uno.Persistence.CRUD.UsuarioCRUDRepository;
import com.borrar.Uno.Persistence.Entity.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

	@Autowired
	private UsuarioCRUDRepository usuarioCRUDRepository;

	public ArrayList<Usuario> obtenerUsauarios(){
		return (ArrayList<Usuario>) usuarioCRUDRepository.findAll();
	}

	public Usuario guardarUsuario (Usuario usuario){
		return usuarioCRUDRepository.save(usuario);
	}

	public Optional<Usuario> obtenerUsuarioPorId(Long id){
		return usuarioCRUDRepository.findById(id);
	}

	public ArrayList<Usuario> obtenerUsuarioPorPrioridad(Integer prioridad){
		return usuarioCRUDRepository.findByPrioridad(prioridad);
	}

	public boolean eliminarUsuario(Long id){
		try {
			usuarioCRUDRepository.deleteById(id);
			return true;
		}catch (Exception er){
			return false;
		}
	}
}
