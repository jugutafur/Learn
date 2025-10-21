package com.MitoCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;


@Named
@ViewScoped
@Getter
@Setter
public class Humano implements Serializable {

	private List<String> list;
	private String name;

	@PostConstruct
	public void init() {
		list = new ArrayList<>();
	}
	public void agregar() {
		this.list.add(name);
	}
}
