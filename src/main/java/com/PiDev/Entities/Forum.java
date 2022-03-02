package com.PiDev.Entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.PiDev.Entities.enumeration.TypeStatus;

@Entity
public class Forum implements Serializable{
	
	private static final long serialVersionUID = -2863962781516995909L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String Sujet;
	private String Description;
	
	@OneToMany(mappedBy ="forum",fetch = FetchType.LAZY )
	private List<Commentaire> Commentaires;	
	
	@OneToMany(mappedBy = "forum")
	private List<Reaction> reactions;
	
	@ManyToMany(mappedBy="forums")
	private Set<User> users;
	
	private TypeStatus status;

	public Long getId() {
		return id;
	}

	public void setId(Long idForum) {
		this.id = idForum;
	}

	public String getSujet() {
		return Sujet;
	}

	public void setSujet(String sujet) {
		Sujet = sujet;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public List<Commentaire> getCommentaires() {
		return Commentaires;
	}

	public List<Reaction> getReactions() {
		return reactions;
	}

	public void setReactions(List<Reaction> reactions) {
		this.reactions = reactions;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public TypeStatus getStatus() {
		return status;
	}

	public void setStatus(TypeStatus status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		Commentaires = commentaires;
	}

	public Forum(Long idForum, String sujet, String description, List<Commentaire> commentaires,
			List<Reaction> reactions, Set<User> users, TypeStatus status) {
		super();
		this.id = idForum;
		Sujet = sujet;
		Description = description;
		Commentaires = commentaires;
		this.reactions = reactions;
		this.users = users;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Forum [idForum=" + id + ", Sujet=" + Sujet + ", Description=" + Description + ", Commentaires="
				+ Commentaires + ", reactions=" + reactions + ", users=" + users + ", status=" + status + "]";
	}

	public Forum() {
		super();
	}
	
}