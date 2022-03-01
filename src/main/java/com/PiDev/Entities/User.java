package com.PiDev.Entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.boot.context.properties.ConstructorBinding;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idUser;
	private String email;
	private String pwd;
	private String Name;
	private String Prename;
	private Long Points;
	private String Poste;
	private Role Role;
	@OneToMany(mappedBy ="createdBy",fetch = FetchType.LAZY)

	private List <Commentaire> commentaires;
	public User() {
		super();
	}

	

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", email=" + email + ", pwd=" + pwd + ", Name=" + Name + ", Prename="
				+ Prename + ", Points=" + Points + ", Poste=" + Poste + ", Role=" + Role + ", events=" + events
				+ ", forums=" + forums + "]";
	}



	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPrename() {
		return Prename;
	}

	public void setPrename(String prename) {
		Prename = prename;
	}

	public Long getPoints() {
		return Points;
	}

	public void setPoints(Long points) {
		Points = points;
	}

	public String getPoste() {
		return Poste;
	}

	public void setPoste(String poste) {
		Poste = poste;
	}

	public Role getRole() {
		return Role;
	}

	public void setRole(Role role) {
		Role = role;
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	
	
	public User(Long idUser, String email, String pwd, String name, String prename, Long points, String poste,
			com.PiDev.Entities.Role role, Set<Event> events) {
		super();
		this.idUser = idUser;
		this.email = email;
		this.pwd = pwd;
		Name = name;
		Prename = prename;
		Points = points;
		Poste = poste;
		Role = role;
		this.events = events;
	}



	@ManyToMany
	@JsonIgnore
	@JoinTable(
	  name = "event_like", 
	  joinColumns = @JoinColumn(name = "user_id"), 
	  inverseJoinColumns = @JoinColumn(name = "event_id"))
	Set<Event> events;
	
	@ManyToMany
	@JsonIgnore
	@JoinTable(
	  name = "forum_user", 
	  joinColumns = @JoinColumn(name = "user_id"), 
	  inverseJoinColumns = @JoinColumn(name = "forum_id"))
	Set<Forum> forums;


	public User(Long idUser, String email, String pwd, String name, String prename, Long points, String poste,
			com.PiDev.Entities.Role role, Set<Event> events, Set<Forum> forums) {
		super();
		this.idUser = idUser;
		this.email = email;
		this.pwd = pwd;
		Name = name;
		Prename = prename;
		Points = points;
		Poste = poste;
		Role = role;
		this.events = events;
		this.forums = forums;
	}

	public Set<Forum> getForums() {
		return forums;
	}

	public void setForums(Set<Forum> forums) {
		this.forums = forums;
	}

	/*@ManyToMany
	@JsonIgnore
	private Set<Event> events;*/
	
	
	
	//private List<String> Badges;
	//private List<Event> FavEvents;
	
	
	
	/*@ManyToMany
	@JsonIgnore
	private Set<Event> events;*/
	
	/*@OneToMany (mappedBy = "Idea")
	@JsonIgnore
	private List<Idea> Idea;*/

	

}
