package com.PiDev.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PiDev.Entities.Commentaire;

@Repository
public interface CommentaireRepository  extends JpaRepository<Commentaire,Long> {
	List<Commentaire> findByForumId(Long idForum);
	List<Commentaire> findByCommentaireParentId(Long id);
}