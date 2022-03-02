package com.PiDev.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PiDev.Entities.Commentaire;
import com.PiDev.Entities.Forum;
import com.PiDev.Repos.CommentaireRepository;
import com.PiDev.Services.CommentaireService;
import com.PiDev.Services.ForumServices;

@Service
public class ICommentaireService implements CommentaireService{

	@Autowired
	private CommentaireRepository commentaireRepository;
	
	@Autowired
	private ForumServices forumServices;
	
	@Override
	public List<Commentaire> getAllCommentaires() {
		return commentaireRepository.findAll();
	}

	@Override
	public List<Commentaire> getCommentairesByForum(Long idForum) {
		return commentaireRepository.findByForumId(idForum);
	}

	@Override
	public Commentaire getCommentaire(Long id) {
		return commentaireRepository.findById(id).get();
	}

	@Override
	public Commentaire saveCommentaire(Commentaire commentaire) {
		return commentaireRepository.save(commentaire);
	}

	@Override
	public Commentaire saveCommentaireByForum(Long idForum, Commentaire commentaire) {
		Forum forum = forumServices.getForum(idForum);
		if(forum != null) {
			commentaire.setForum(forum);
		}
		return commentaireRepository.save(commentaire);
	}

	@Override
	public Commentaire editCommentaire(Long id, Commentaire commentaire) {
		commentaire.setId(id);
		return commentaireRepository.save(commentaire);
	}

	@Override
	public Commentaire editCommentaireByForum(Long idForum, Long id, Commentaire commentaire) {
		commentaire.setId(id);
		Forum forum = forumServices.getForum(idForum);
		if(forum != null) {
			commentaire.setForum(forum);
		}
		return commentaireRepository.save(commentaire);
	}

	@Override
	public void deleteCommentaire(Long id) {
		commentaireRepository.deleteById(id);
	}

	@Override
	public List<Commentaire> getCommentairesByCommentaireParent(Long idCommentaireParent) {
		return commentaireRepository.findByCommentaireParentId(idCommentaireParent);
	}

}
