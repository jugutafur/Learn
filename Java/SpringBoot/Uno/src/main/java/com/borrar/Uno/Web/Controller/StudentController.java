package com.borrar.Uno.Web.Controller;

import com.borrar.Uno.App.Model.Post;
import com.borrar.Uno.Domain.Service.StudentService;
import com.borrar.Uno.Domain.Service.UserService;
import com.borrar.Uno.Domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Esta clase va a redireccionar a mis archivos html
@Controller
@RequestMapping("/redirect")
public class StudentController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private StudentService studentService;

	@GetMapping("/banner")
	public String saludar23() {
		return "banner";
	}

	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}

	@GetMapping("/students/home")
	public String getPageHome(Model model) {
		String var = "Variable!!";
		model.addAttribute("home", var);
		return "home";
	}
}

//esta clase me va a mostrar JSON
@RestController
@RequestMapping("/data")
class StudentControllerData {
	@Autowired
	private UserService userService;

	@Autowired
	private StudentService studentService;

	@GetMapping("/mensaje")
	public String saludar() {
		return "Hola Juan Guillermo Tafur";
	}

	@GetMapping("/")
	public String saludar2() {
		return "saludar Sara";
	}

	@GetMapping("/estudiantes")
	public List<Student> getAllStudent() {
		return studentService.getAllStudents();
	}
}
