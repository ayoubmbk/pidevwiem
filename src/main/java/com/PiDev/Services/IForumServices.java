package com.PiDev.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PiDev.Entities.Commentaire;
import com.PiDev.Entities.Forum;
import com.PiDev.Repos.EventRepository;
import com.PiDev.Repos.ForumRepository;

@Service
public class IForumServices implements ForumServices{

	@Autowired
	ForumRepository forumRepository;
	
	@Override
	public Forum saveForum(Forum p) {
		return forumRepository.save(p);
	}

	@Override
	public Forum updateForum(Forum p) {
		return forumRepository.save(p);
	}

	@Override
	public void deleteForum(Forum p) {
		forumRepository.delete(p);
		
	}

	@Override
	public void deleteForumById(Long id) {
		forumRepository.deleteById(id);
		
	}

	@Override
	public Forum getForum(Long id) {
		return forumRepository.findById(id).get();
	}

	@Override
	public List<Forum> getAllForums() {
		List<Forum> forums = new ArrayList<>();
		List<Forum> lista =forumRepository.findAll();
		for(Forum item:lista)
		{
			List<Commentaire> listeCommentaire = new ArrayList <Commentaire>(item.getCommentaires());
			for(Commentaire commentaire1: listeCommentaire)
			{
				List<Commentaire> listeResponse = new ArrayList <Commentaire>(commentaire1.getReponseCommentaire());
				for (Commentaire commentaireReponse : listeResponse) {
					commentaireReponse.setCommentaireParent(null);
					
				}
			}

		}
		return lista;
		
	}

	@Override
	public List<Forum> trierForumsNomsPrix() {
	
		return forumRepository.trierForumsNomsPrix();
	}
}
