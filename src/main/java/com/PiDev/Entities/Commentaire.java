package com.PiDev.Entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@Entity
public class Commentaire {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long idCommentaire;
		private String Commentaire;
		private Long Likes ;
		private Long Dislikes;
		@ManyToOne(fetch = FetchType.LAZY)
	
		private Commentaire commentaireParent;
		@OneToMany(mappedBy ="commentaireParent", fetch = FetchType.LAZY)
		private List<Commentaire> reponseCommentaire;
		
 		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "idForum", referencedColumnName = "idForum")
		private Forum forum;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="idUser",referencedColumnName = "idUser")
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
		@Override
		public String toString() {
			return "Commentaire [idCommentaire=" + idCommentaire + ", Commentaire=" + Commentaire + ", Likes=" + Likes
					+ ", Dislikes=" + Dislikes + ", commentaireParent=" + commentaireParent + ", reponseCommentaire="
					+ reponseCommentaire + ", forum=" + forum + ", createdBy=" + createdBy + "]";
		}
	
}