package edu.esprit.lundi.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Song
 *
 */
@Entity

public class Song implements Serializable {

	   
	@Id @GeneratedValue 
	private Integer id;
	private String title;

	public Song() {
	}   
	
	
	public Song(Integer id, String title) {
		this.id = id;
		this.title = "One Love";
	}


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
   
}
