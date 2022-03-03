package com.PiDev.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PiDev.Entities.Commentaire;
import com.PiDev.Entities.Forum;
import com.PiDev.Entities.Reaction;
import com.PiDev.Entities.enumeration.TypeReaction;
import com.PiDev.Repos.ReactionRepository;
import com.PiDev.Services.CommentaireService;
import com.PiDev.Services.ForumServices;
import com.PiDev.Services.ReactionService;

@Service
public class IReactionService implements ReactionService{
	
	@Autowired
	private ForumServices forumServices;
	
	@Autowired
	private CommentaireService commentaireService;
	
	@Autowired
	private ReactionRepository reactionRepository;
	
	@Override
	public List<Reaction> getAllReactions() {
		return reactionRepository.findAll();
	}

	@Override
	public List<Reaction> getAllReactionsByForumAndTypeReaction(Long idForum, TypeReaction typeReaction) {
		return reactionRepository.findByForumIdAndTypeReaction(idForum, typeReaction);
	}

	@Override
	public List<Reaction> getAllReactionsByCommentaireAndTypeReaction(Long idCommentaire, TypeReaction typeReaction) {
		return reactionRepository.findByCommentaireIdAndTypeReaction(idCommentaire, typeReaction);
	}

	@Override
	public Reaction getReaction(Long id) {
		return reactionRepository.findById(id).get();
	}
	
	@Override
	public Reaction saveReaction(Reaction reaction) {
		return reactionRepository.save(reaction);
	}

	@Override
	public Reaction saveReactionByForum(Long idForum, Reaction reaction) {
		Forum forum = forumServices.getForum(idForum);
		if(forum != null) {
			reaction.setForum(forum);
		}
		return reactionRepository.save(reaction);
		
	}

	@Override
	public Reaction saveReactionByCommentaire(Long idCommentaire, Reaction reaction) {
		Commentaire commentaire = commentaireService.getCommentaire(idCommentaire);
		if(commentaire != null) {
			reaction.setCommentaire(commentaire);
		}
		return reactionRepository.save(reaction);
	}

	@Override
	public Reaction editReaction(Long id, Reaction reaction) {
		reaction.setId(id);
		return reactionRepository.save(reaction);
	}

	@Override
	public Reaction editReactionByForum(Long idForum, Long id, Reaction reaction) {
		reaction.setId(id);
		Forum forum = forumServices.getForum(idForum);
		if(forum != null) {
			reaction.setForum(forum);
		}
		return reactionRepository.save(reaction);
	}

	@Override
	public Reaction editReactionByCommentaire(Long idCommentaire, Long id, Reaction reaction) {
		reaction.setId(id);
		Commentaire commentaire = commentaireService.getCommentaire(idCommentaire);
		if(commentaire != null) {
			reaction.setCommentaire(commentaire);
		}
		return reactionRepository.save(reaction);
	}

	@Override
	public void deleteReaction(Long id) {
		reactionRepository.deleteById(id);
	}

}
