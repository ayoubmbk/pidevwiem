package com.PiDev.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.PiDev.Entities.Commentaire;
import com.PiDev.Services.CommentaireService;

@RestController
@CrossOrigin("*")
public class CommentaireController {
	
	@Autowired
	private CommentaireService commentaireService;
	
	@RequestMapping(value="/commentaires", method=RequestMethod.GET)
	public List<Commentaire> getAllCommentaires()
	{
		return commentaireService.getAllCommentaires();
	}
	
	@RequestMapping(value="/forum/{idForum}/{typeCommentaire}/commentaires", method=RequestMethod.GET)
	public List<Commentaire> getAllCommentairesByForum(@PathVariable("idForum") Long idForum)
	{
		return commentaireService.getCommentairesByForum(idForum);
	}
	
	@RequestMapping(value="/commentaire/{idCommentaire}/{typeCommentaire}/commentaires", method=RequestMethod.GET)
	public List<Commentaire> getAllCommentairesByCommentaireParent(@PathVariable("idCommentaire") Long idCommentaire)
	{
		return commentaireService.getCommentairesByCommentaireParent(idCommentaire);
	}
	
	@RequestMapping(value="/commentaires", method = RequestMethod.POST)
	public Commentaire createCommentaire(@RequestBody Commentaire commentaire) {
			return commentaireService.saveCommentaire(commentaire);
	}
	@RequestMapping(value="/forum/{idForum}/commentaires", method = RequestMethod.POST)
	public Commentaire createCommentaireByForum(@PathVariable("idForum") Long idForum, @RequestBody Commentaire commentaire) {
			return commentaireService.saveCommentaireByForum(idForum, commentaire);
	}
	
	@RequestMapping(value="/commentaires/{id}", method = RequestMethod.PUT)
	public Commentaire updateCommentaire(@PathVariable("id") Long id, @RequestBody Commentaire commentaire) {
		return commentaireService.editCommentaire(id, commentaire);
	}
	
	@RequestMapping(value="/forum/{idForum}/commentaires/{id}", method = RequestMethod.PUT)
	public Commentaire updateCommentaireByForum(@PathVariable("id") Long id, @PathVariable("idForum") Long idForum,@RequestBody Commentaire commentaire) {
		return commentaireService.editCommentaireByForum(idForum, id, commentaire);
	}
	
	@RequestMapping(value="/commentaires/{id}",method = RequestMethod.DELETE)
	public void deleteCommentaire(@PathVariable("id") Long id)
	{
		commentaireService.deleteCommentaire(id);
	}
}

