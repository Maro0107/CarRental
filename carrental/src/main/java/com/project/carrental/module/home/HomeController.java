package com.project.carrental.module.home;

import com.project.carrental.module.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@Autowired
	private MenuService menuService;
	@GetMapping({"/", "/home"})
	public String getHome(Model model) {
		model.addAttribute("menuItems", menuService.getMenu());
		model.addAttribute("menuSubItems", menuService.getSubMenu());
		return "home/index.html";
	}

}
