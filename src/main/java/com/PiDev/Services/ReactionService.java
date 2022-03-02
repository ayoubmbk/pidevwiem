package com.PiDev.Services;

import java.util.List;

import com.PiDev.Entities.Reaction;
import com.PiDev.Entities.enumeration.TypeReaction;

public interface ReactionService {
	List<Reaction> getAllReactions();
	List<Reaction> getAllReactionsByForumAndTypeReaction(Long idForum, TypeReaction typeReaction);
	List<Reaction> getAllReactionsByCommentaireAndTypeReaction(Long idCommentaire, TypeReaction typeReaction);
	Reaction getReaction(Long id);
	Reaction saveReaction(Reaction reaction);
	Reaction saveReactionByForum(Long idForum, Reaction reaction);
	Reaction saveReactionByCommentaire(Long idCommentaire, Reaction reaction);
	Reaction editReaction(Long id, Reaction reaction);
	Reaction editReactionByForum(Long idForum, Long id, Reaction reaction);
	Reaction editReactionByCommentaire(Long idCommentaire, Long id, Reaction reaction);
	void deleteReaction(Long id);
}