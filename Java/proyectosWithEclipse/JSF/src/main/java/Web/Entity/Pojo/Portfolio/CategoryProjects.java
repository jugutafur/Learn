package Web.Entity.Pojo.Portfolio;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import Web.Entity.Enumerados.Category;
import Web.Entity.Enumerados.InventoryStatus;

public class CategoryProjects implements Serializable{
	
	private String name;
	private String description;
	private String image;
	private int rating;
	
	public CategoryProjects() {}

	public CategoryProjects(String name, String description, String image, int rating) {
		this.name = name;
		this.description = description;
		this.image = image;
		this.rating = rating;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}

	public String getImage() {return image;}
	public void setImage(String image) {this.image = image;}

	public int getRating() {return rating;}
	public void setRating(int rating) {this.rating = rating;}

	
    @Override
    public CategoryProjects clone() {
        return new CategoryProjects(getName(), getDescription(), getImage(), getRating());
    }
	
	@Override
	public String toString() {
		return "CategoryProjects [name=" + name + ", description=" + description + ", image=" + image + ", rating="
				+ rating + "]";
	}
}