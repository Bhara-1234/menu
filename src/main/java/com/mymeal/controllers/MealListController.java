package com.mymeal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mymeal.services.MealListService;

@Controller
public class MealListController {
	@Autowired
	MealListService meallistservice;

	@GetMapping("/menuList/listofitems")
	public String menuList(Model model) {
		model.addAttribute("menulist", meallistservice.getMenuItems());
		return "start";
	}
}
