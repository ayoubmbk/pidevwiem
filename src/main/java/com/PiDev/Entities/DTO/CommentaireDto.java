package com.PiDev.Entities.DTO;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.PiDev.Entities.Commentaire;
import com.PiDev.Entities.Forum;
import com.PiDev.Entities.User;

public class CommentaireDto {
	private Long idCommentaire;
	private String Commentaire;
	private Long Likes ;
	private Long Dislikes;
	private Commentaire commentaireParent;
	private List<Commentaire> reponseCommentaire;
	private Forum forum;
	private User createdBy;
	
	public Long getIdCommentaire() {
		return idCommentaire;
	}
	public void setIdCommentaire(Long idCommentaire) {
		this.idCommentaire = idCommentaire;
	}
	public String getCommentaire() {
		return Commentaire;
	}
	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
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
	public Commentaire getCommentaireParent() {
		return commentaireParent;
	}
	public void setCommentaireParent(Commentaire commentaireParent) {
		this.commentaireParent = commentaireParent;
	}
	public List<Commentaire> getReponseCommentaire() {
		return reponseCommentaire;
	}
	public void setReponseCommentaire(List<Commentaire> reponseCommentaire) {
		this.reponseCommentaire = reponseCommentaire;
	}
	public Forum getForum() {
		return forum;
	}
	public void setForum(Forum forum) {
		this.forum = forum;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	
}
