package edu.jsf.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *  @author Brahian Velazquez
 *   Clase que se usara como entidad para la tabla Person
 * */

@Entity
public class Person  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	
	 public Person() {}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	 @Override
	    public int hashCode() {
	        int hash = 3;
	        hash = 89 * hash + Objects.hashCode(this.email);
	        return hash;
	    }
	 
	 @Override
	 public boolean equals(Object obj) {
		 if(this == obj) {
			 return true;
		 }
		 if(this == null) {
			 return false;
		 }
		 if(getClass() != obj.getClass()) {
			 return false;
		 }
		 
		 final Person other = (Person) obj;
		 if(!Objects.equals(this.email, other.email)) {
			 return false;
		 }
		 return true;
	 }
	 
}
