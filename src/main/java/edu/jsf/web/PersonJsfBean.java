package edu.jsf.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import edu.jsf.model.Person;

@ManagedBean
@ViewScoped
public class PersonJsfBean  extends BaseCrudJsfBean<Person>{

	public Person getPerson(){
		return getCrudObj();
	}
	
	public void setPerson(Person person) {
		setCrudObj(person);
	}
	
	public List<Person> getPeople(){
		return getCrudList();
	}
	
	public void setPeople(List<Person> people) {
		setCrudList(people);
	}
}
