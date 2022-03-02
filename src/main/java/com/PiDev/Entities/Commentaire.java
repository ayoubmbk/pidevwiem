package com.PiDev.Entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commentaire implements Serializable{
	
	private static final long serialVersionUID = -684388468350405594L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long id;
		private String commentaire;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="commentaireParent")
		private Commentaire commentaireParent;
		
		@OneToMany(mappedBy ="commentaireParent", fetch = FetchType.LAZY)
		private List<Commentaire> reponseCommentaire;
		
 		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "idForum")
		private Forum forum;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="idUser")
		private User createdBy;
		
		@OneToMany(mappedBy = "commentaire")
		private List<Reaction> reactions;
		
		public List<Reaction> getReactions() {
			return reactions;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long idCommentaire) {
			this.id = idCommentaire;
		}

		public String getCommentaire() {
			return commentaire;
		}

		public void setCommentaire(String commentaire) {
			this.commentaire = commentaire;
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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public void setReactions(List<Reaction> reactions) {
			this.reactions = reactions;
		}

		public Commentaire(Long idCommentaire, String commentaire, Commentaire commentaireParent,
				List<Commentaire> reponseCommentaire, Forum forum, User createdBy, List<Reaction> reactions) {
			super();
			this.id = idCommentaire;
			this.commentaire = commentaire;
			this.commentaireParent = commentaireParent;
			this.reponseCommentaire = reponseCommentaire;
			this.forum = forum;
			this.createdBy = createdBy;
			this.reactions = reactions;
		}

		public Commentaire() {
			super();
		}

		@Override
		public String toString() {
			return "Commentaire [idCommentaire=" + id + ", commentaire=" + commentaire
					+ ", commentaireParent=" + commentaireParent + ", reponseCommentaire=" + reponseCommentaire
					+ ", forum=" + forum + ", createdBy=" + createdBy + ", reactions=" + reactions + "]";
		}
	
}
