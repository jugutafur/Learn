package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class ControladorHola {
	
	  @RequestMapping("/hola")
	  public String hola(Model modelo) {
	    
	    
	    modelo.addAttribute("mensaje","hola desde thymeleaf");
	    return "hola";
	  }

}
