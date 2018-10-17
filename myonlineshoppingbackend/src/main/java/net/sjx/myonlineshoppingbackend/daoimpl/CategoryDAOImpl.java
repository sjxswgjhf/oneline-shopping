package net.sjx.myonlineshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.sjx.myonlineshoppingbackend.dao.CategoryDAO;
import net.sjx.myonlineshoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	
	private static List<Category> categories=new ArrayList<>();
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television!");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Mobile");
		category2.setDescription("This is some description for mobile!");
		category2.setImageURL("CAT_2.png");
		categories.add(category2);
		
		Category category3 = new Category();
		category3.setId(3);
		category3.setName("laptop");
		category3.setDescription("This is some description for laptop!");
		category3.setImageURL("CAT_3.png");
		categories.add(category3);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category: categories) {
			if(id==category.getId()) {
				return category;
			}
		}
		
		return null;
	}
	

}
