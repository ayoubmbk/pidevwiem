package com.PiDev.Services;

import java.util.List;

import com.PiDev.Entities.Commentaire;

public interface CommentaireService {
	
	List<Commentaire> getAllCommentaires();
	List<Commentaire> getCommentairesByForum(Long idForum);
	List<Commentaire> getCommentairesByCommentaireParent(Long idCommentaireParent);
	Commentaire getCommentaire(Long id);
	Commentaire saveCommentaire(Commentaire commentaire);
	Commentaire saveCommentaireByForum(Long Forum, Commentaire commentaire);
	Commentaire editCommentaire(Long id, Commentaire commentaire);
	Commentaire editCommentaireByForum(Long idForum, Long id, Commentaire commentaire);
	void deleteCommentaire(Long id);
}
