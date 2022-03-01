package com.PiDev.Entities.DTO;

import java.util.List;


import com.PiDev.Entities.Commentaire;

public class ForumDto {
	private Long idForum;
	private String Sujet;
	private Long Likes;
	private Long Dislikes;
	private String Description;
	private List<Commentaire> Commentaires;
	
		
	
	
	public ForumDto() {
		super();
	}
	public ForumDto(Long idForum, String sujet, Long likes, Long dislikes, String description,
			List<Commentaire> commentaires) {
		super();
		this.idForum = idForum;
		Sujet = sujet;
		Likes = likes;
		Dislikes = dislikes;
		Description = description;
		Commentaires = commentaires;
	}
	public Long getIdForum() {
		return idForum;
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
