package com.mymeal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymeal.daos.MenuItemsDao;
import com.mymeal.models.MenuItems;

@Service
public class MealListService {

	private MenuItemsDao menuItemsDao;

	@Autowired
	public MealListService(MenuItemsDao menuItemsDao) {
		this.menuItemsDao = menuItemsDao;
	}

	public List<MenuItems> getMenuItems() {
		return menuItemsDao.getAllItems();

	}

}
