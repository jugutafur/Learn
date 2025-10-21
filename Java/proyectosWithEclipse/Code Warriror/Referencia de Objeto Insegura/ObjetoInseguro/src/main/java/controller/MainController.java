package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import app.service.api.HomeworkService;

import org.springframework.ui.Model;

import org.owasp.encoder.Encode;
import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
import constant.ViewNames;

@Controller
@RequiredArgsConstructor
@RequestMapping(name = ViewNames.MAIN_PAGE_URL)
public class MainController {
	
	private final HomeworkService homeworkService;
	
	@GetMapping
	public String getMainPage() {
		return ViewNames.MAIN_PAGE_VIEW_NAME;
	}

	@PostMapping
	public String getHomework(Model model, @RequestParam String subject) {
		String sanitizedSubject = Encode.forHtml(subject);
		model.addAttribute("task", homeworkService.getTask(sanitizedSubject));
		model.addAttribute("subject", sanitizedSubject);
		return ViewNames.MAIN_PAGE_VIEW_NAME;
	}
}
