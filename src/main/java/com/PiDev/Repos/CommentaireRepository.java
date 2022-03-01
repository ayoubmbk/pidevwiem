package com.PiDev.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PiDev.Entities.Commentaire;
import com.PiDev.Entities.Forum;
@Repository
public interface CommentaireRepository  extends JpaRepository<Commentaire,Long> {

}
