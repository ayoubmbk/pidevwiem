package com.PiDev.Entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Forum {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idForum;
	private String Sujet;
	private Long Likes;
	private Long Dislikes;
	private String Description;
	private String Commentaires;	
	private String Recommendation;
	public Long getIdForum() {
		return idForum;
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
	public String getCommentaires() {
		return Commentaires;
	}
	public void setCommentaires(String commentaires) {
		Commentaires = commentaires;
	}
	public String getRecommendation() {
		return Recommendation;
	}
	public void setRecommendation(String recommendation) {
		Recommendation = recommendation;
	}
	public Forum() {
		super();
	}
	public Forum(String sujet, String description, String commentaires, String recommendation) {
		super();
		Sujet = sujet;
		Description = description;
		Commentaires = commentaires;
		Recommendation = recommendation;
	}


}
