package com.PiDev.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.PiDev.Entities.enumeration.TypeReaction;

@Entity
public class Reaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private TypeReaction typeReaction;
	
	@ManyToOne()
	@JoinColumn(name ="forum")
	private Forum forum;
	
	@ManyToOne
	@JoinColumn(name="commentaire")
	private Commentaire commentaire;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TypeReaction getTypeReaction() {
		return typeReaction;
	}

	public void setTypeReaction(TypeReaction typeReaction) {
		this.typeReaction = typeReaction;
	}

	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public Commentaire getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}

	public Reaction(Long id, TypeReaction typeReaction, Forum forum, Commentaire commentaire) {
		super();
		this.id = id;
		this.typeReaction = typeReaction;
		this.forum = forum;
		this.commentaire = commentaire;
	}

	public Reaction() {
		super();
	}

	@Override
	public String toString() {
		return "Reaction [id=" + id + ", typeReaction=" + typeReaction + ", forum=" + forum + ", commentaire="
				+ commentaire + "]";
	}
	
}
