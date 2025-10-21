package Web.Entity.UI.MitoCode;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import Domain.dto.MitoCode.Person;

import java.util.ArrayList;

@ManagedBean
@RequestScoped
public class PersonUI {
	
	private Person _person = new Person();
	private static List<Person> _listPersons = new ArrayList<>();
	
	public PersonUI() {}

	public Person get_person() {return _person;}
	public void set_person(Person _person) {this._person = _person;}

	public List<Person> get_listPersons() {return _listPersons;}
	public void setListPersons(List<Person> _listPersons) {this._listPersons = _listPersons;}
	
	public void addPerson() {
		this._listPersons.add(this._person);
	}
	
	public void deletePerson(Person person) {
		this._listPersons.remove(person);
	}
}
