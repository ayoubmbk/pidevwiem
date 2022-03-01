package com.PiDev.Entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Forum {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idForum;
	private String Sujet;
	private Long Likes;
	private Long Dislikes;
	private String Description;
	@OneToMany(mappedBy ="forum",fetch = FetchType.LAZY )
	private List<Commentaire> Commentaires;	
	
	private Long Status;
	
	public Long getStatus() {
		return Status;
	}
	public void setStatus(Long status) {
		Status = status;
	}
	public Long getIdForum() {
		return idForum;
	}


	public Forum() {
		super();
	}


	@ManyToMany(mappedBy="forums")
	private Set<User> users;
	
	
	public Long getLikes() {
		return Likes;
	}
	public void setLikes(Long likes) {
		Likes = likes;
	}
	public Long getDislikes() {
		return Dislikes;
	}
	public void setDislikes(Long dislikes) {
		Dislikes = dislikes;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public void setIdForum(Long idForum) {
		this.idForum = idForum;
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
	public void setCommentaires(List<Commentaire> commentaires) {
		Commentaires = commentaires;
	}
	


}
