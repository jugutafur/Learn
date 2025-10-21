package Domain.dto.Potfolio;

import java.time.LocalDate;
import java.io.Serializable;

public class Project implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int _id;
	private String _name;
	private String _description; 
	private String _category;
	private String _imagenSrc;
	private LocalDate _dateUpdate;

	public Project() {}

	public Project(int id, String name, String description, String category, String imagenSrc, LocalDate dateUpdate) {
		this._id = id;
		this._name = name;
		this._description = description;
		this._category = category;
		this._imagenSrc= imagenSrc;
		this._dateUpdate = dateUpdate;
	}

	public int get_id() {return _id;}
	public void set_id(int _id) {this._id = _id;}

	public String get_name() {return _name;}
	public void set_name(String _name) {this._name = _name;}

	public String get_description() {return _description;}
	public void set_description(String _description) {this._description = _description;}

	public String get_category() {return _category;}
	public void set_category(String _category) {this._category = _category;}
	
	public String get_imagenSrc() {return _imagenSrc;}
	public void set_imagenSrc(String _imagenSrc) {this._imagenSrc = _imagenSrc;}

	public LocalDate get_dateUpdate() {return _dateUpdate;}
	public void set_dateUpdate(LocalDate _dateUpdate) {this._dateUpdate = _dateUpdate;}

	@Override
	public String toString() {
		var stringBuilder = new StringBuilder();
		stringBuilder.append("Project = {id= "+this._id)
		.append(", name= "+ this._name)
		.append(", description= "+this._description)
		.append(", category= "+ this._category)
		.append(", imagenSrc= "+ this._imagenSrc)
		.append(", dateUpdate= "+ this._dateUpdate)
		.append("}");
		return stringBuilder.toString();
	}	
}
