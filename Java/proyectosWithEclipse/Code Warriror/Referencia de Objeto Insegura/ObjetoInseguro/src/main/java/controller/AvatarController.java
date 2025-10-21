package controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.http.ResponseEntity;
import org.springframework.core.io.InputStreamResource;
import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;

import app.service.api.AvatarService;
import constant.ViewNames;

@Controller
@RequiredArgsConstructor
@RequestMapping(name =  ViewNames.AVATAR_URL)
public class AvatarController {
	
	private final AvatarService avatarService;

	@GetMapping
	public ResponseEntity<InputStreamResource> get (@RequestParam String id)throws IOException{
		return avatarService.loadAvatar(id);
	}
}
