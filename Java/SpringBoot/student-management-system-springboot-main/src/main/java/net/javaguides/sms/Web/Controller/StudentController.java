package net.javaguides.sms.Web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import net.javaguides.sms.Persistence.Entity.Student;
import net.javaguides.sms.Domain.Repository.StudentRepository;

@Controller
@RequestMapping("/Student")
public class StudentController {
	
	private StudentRepository studentRepository;

	public StudentController(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentRepository.getAllStudents());
		return "students";
	}

	@GetMapping("/students/home")
	public String getPageHome(Model model) {
		String var = "Variable!!";
		model.addAttribute("home", var);
		return "home/home";
	}

	@GetMapping("/students/home88")
	public String getPageHome22(Model model) {
		String var = "Variable!!";
		model.addAttribute("home", var);
		return "home/home";
	}
/*
	@PostMapping("/students/home55")
	public String saveStudent55(@ModelAttribute("student") Student student) {
		studentRepository.saveStudent(student);
		return "redirect:/home55";
	}
 */

	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentRepository.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentRepository.getStudentById(id));
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		
		// get student from database by id
		Student existingStudent = studentRepository.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		// save updated student object
		studentRepository.updateStudent(existingStudent);
		return "redirect:/students";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentRepository.deleteStudentById(id);
		return "redirect:/students";
	}
	
}
