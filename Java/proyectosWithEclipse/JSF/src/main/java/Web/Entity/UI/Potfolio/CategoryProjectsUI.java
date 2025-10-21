package Web.Entity.UI.Potfolio;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import Domain.dto.Potfolio.Project;
import Web.Entity.Enumerados.Category;
import Web.Entity.Enumerados.InventoryStatus;
import Web.Entity.Pojo.Portfolio.CategoryProjects;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

@ManagedBean
@ApplicationScoped
public class CategoryProjectsUI {

    private List<CategoryProjects> listCategoryProjects;
    private static int countLikes = 0;

    public CategoryProjectsUI() {
    	listCategoryProjects = new ArrayList<>();
    	listCategoryProjects.add(new CategoryProjects("Bamboo Watch","Product Description Bamboo Watch","bamboo-watch.jpg",65));
    	listCategoryProjects.add(new CategoryProjects("Black Watch","Product Description Black Watch", "black-watch.jpg", 72));
    	listCategoryProjects.add(new CategoryProjects("Blue Band","Product Description Blue Band","blue-band.jpg", 79));
    	listCategoryProjects.add(new CategoryProjects("Blue T-Shirt","Product Description Blue T-Shirt","blue-t-shirt.jpg", 29));
    	listCategoryProjects.add(new CategoryProjects("Bracelet", "Product Description Bracelet", "bracelet.jpg", 15));
    }

	public List<CategoryProjects> getListCategoryProjects() {
		return listCategoryProjects;
	}

	public void setListCategoryProjects(List<CategoryProjects> listCategoryProjects) {
		this.listCategoryProjects = listCategoryProjects;
	}
	
    public int getCountLikes() {return countLikes;}
	public void setCountLikes(int countLikes) {this.countLikes = countLikes;}
	
	public int increase() {
		return this.countLikes++;
	}

//	public CategoryProjects getOneCategoryProjects(int item) {
//            Random selectCategoriaProjectos = new Random();
//            CategoryProjects randomItemCategoryProjects = new CategoryProjects();
//            for (int i = 0; i < listCategoryProjects.size(); i++) {
//                int randomIndex = selectCategoriaProjectos.nextInt(listCategoryProjects.size());
//                selectCategoriaProjectos.add(listCategoryProjects.get(randomIndex));
//            return selectCategoriaProjectos;
//        }
//        else {
//            return new ArrayList<>(listCategoryProjects.subList(0, size));
//        }
//    }

//    public List<CategoryProjects> getClonedProducts(int size) {
//        List<CategoryProjects> results = new ArrayList<>();
//        List<CategoryProjects> originals = getOneCategoryProjects(size);
//        for (CategoryProjects original : originals) {
//            results.add(original.clone());
//        }
//        return results;
//    }
}