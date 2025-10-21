package com.borrar.Uno.Web.Controller;

import com.borrar.Uno.Domain.Service.UserService;
import com.borrar.Uno.Persistence.Entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/Usuario")
public class Students25Controller {

    @Autowired
    private UserService userService;

    @GetMapping("todos")
    public ArrayList<Usuario> getUser(){
        return userService.obtenerUsauarios();
    }

    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return this.userService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<Usuario> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.userService.obtenerUsuarioPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<Usuario> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.userService.obtenerUsuarioPorPrioridad(prioridad);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.userService.eliminarUsuario(id);
        if(ok){
            return "Se elimino el usuario con id "+ id;
        }else{
            return "No se pudo eliminar el usuario con id "+ id;
        }
    }

}
