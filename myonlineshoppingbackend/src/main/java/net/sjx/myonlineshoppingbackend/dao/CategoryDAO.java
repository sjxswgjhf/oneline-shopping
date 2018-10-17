package net.sjx.myonlineshoppingbackend.dao;

import java.util.List;

import net.sjx.myonlineshoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
	
}
