package com.project.carrental.module.menu;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

	public List<MenuDto> getMenu() {
		return List.of(
				new MenuDto("Cars"),
				new MenuDto("Carrentals"),
				new MenuDto("City"),
				new MenuDto("Business"),
				new MenuDto("Contact")
		);
	}
	public List<MenuDto> getSubMenu() {
		return List.of(
				new MenuDto("Sub 1"),
				new MenuDto("Sub 2"),
				new MenuDto("Sub 3"),
				new MenuDto("Sub 4"),
				new MenuDto("Sub 5"),
				new MenuDto("Sub 6"),
				new MenuDto("Sub 7")
		);
	}

}
