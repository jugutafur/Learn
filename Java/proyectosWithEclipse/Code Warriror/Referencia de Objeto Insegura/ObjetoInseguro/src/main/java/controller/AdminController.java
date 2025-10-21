package controller;

import java.util.List;
import model.entity.User;
import app.service.api.UserService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.access.prepost.PreAuthorize;

import constant.ViewNames;

@RequestMapping
public class AdminController {

	private final UserService userservice;
	
	@GetMapping
	@PreAuthorize("hasRole(ADMIN)")
	public String adminView(Model model) {
		List<User> userList = userservice.gelAllUser();
		model.addAttribute("user", userList);
		
		return ViewNames.ADMIN_VIEW_NAME;
	}
}
