package com.PiDev.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.PiDev.Entities.Event;
import com.PiDev.Entities.Forum;
@Repository
public interface ForumRepository extends JpaRepository<Forum,Long>{
	@Query("select p from Forum p order by p.Likes ASC")
	List<Forum> trierForumsNomsPrix ();
}

