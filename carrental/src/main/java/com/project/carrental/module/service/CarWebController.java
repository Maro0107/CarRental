package com.project.carrental.module.service;

import com.project.carrental.module.dto.CarDto;
import com.project.carrental.module.entity.CarEntity;
import com.project.carrental.module.menu.MenuDto;
import com.project.carrental.module.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


@Controller
public class CarWebController {


    @Autowired
    private MenuService menuService;
    @Autowired
    private CarService carService;

    @GetMapping({
//            "/home/{id}",
//            "/home/{id}.html",
//            "/home/{id}.php"
            "/home/car/{id}.html"
    })
//    public String getBlogPost(@PathVariable("id") Long id,
//                              Model model) {

        public String getCar(@PathVariable("id") Long id,
                Model model) {
//        CarEntity car = carService.getOneById(id);
        CarEntity car = carService.getOneById(id);
        List<MenuDto> menuItems = menuService.getMenu();

        model.addAttribute("car", car);
        model.addAttribute("menuItems", menuItems);

//        return "home/car.html";
        return "/home/car.html";
    }



}
