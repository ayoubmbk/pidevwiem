package com.PiDev.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PiDev.Entities.Reaction;
import com.PiDev.Entities.enumeration.TypeReaction;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction, Long>{
	List<Reaction> findByForumIdAndTypeReaction(Long idForum, TypeReaction typeReaction);
	List<Reaction> findByCommentaireIdAndTypeReaction(Long idCommentaire, TypeReaction typeReaction);
}