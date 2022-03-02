package com.PiDev.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.PiDev.Entities.Reaction;
import com.PiDev.Entities.enumeration.TypeReaction;
import com.PiDev.Services.ReactionService;

@RestController
@CrossOrigin("*")
//@RequestMapping("/reactions")
public class ReactionController {
	
	@Autowired
	private ReactionService reactionService;
	
	@RequestMapping(value="/reactions", method=RequestMethod.GET)
	public List<Reaction> getAllReactions()
	{
		return reactionService.getAllReactions();
	}
	
	@RequestMapping(value="/forum/{idForum}/{typeReaction}/reactions", method=RequestMethod.GET)
	public List<Reaction> getAllReactionsByForum(@PathVariable("idForum") Long idForum, @PathVariable("typeReaction") TypeReaction typeReaction)
	{
		return reactionService.getAllReactionsByForumAndTypeReaction(idForum, typeReaction);
	}
	
	@RequestMapping(value="/commentaire/{idCommentaire}/{typeReaction}/reactions", method=RequestMethod.GET)
	public List<Reaction> getAllReactionsByCommentaire(@PathVariable("idCommentaire") Long idCommentaire, @PathVariable("typeReaction") TypeReaction typeReaction)
	{
		return reactionService.getAllReactionsByCommentaireAndTypeReaction(idCommentaire, typeReaction);
	}
	
	@RequestMapping(value="/reactions", method = RequestMethod.POST)
	public Reaction createReaction(@RequestBody Reaction reaction) {
			return reactionService.saveReaction(reaction);
	}
	@RequestMapping(value="/forum/{idForum}/reactions", method = RequestMethod.POST)
	public Reaction createReactionByForum(@PathVariable("idForum") Long idForum, @RequestBody Reaction reaction) {
			return reactionService.saveReactionByForum(idForum, reaction);
	}
	@RequestMapping(value="/commentaire/{idCommentaire}/reactions", method = RequestMethod.POST)
	public Reaction createReactionByCommentaire(@PathVariable("idCommentaire") Long idCommentaire, @RequestBody Reaction reaction) {
			return reactionService.saveReactionByCommentaire(idCommentaire, reaction);
	}
	
	@RequestMapping(value="/reactions/{id}", method = RequestMethod.PUT)
	public Reaction updateReaction(@PathVariable("id") Long id, @RequestBody Reaction reaction) {
		return reactionService.editReaction(id, reaction);
	}
	
	@RequestMapping(value="/forum/{idForum}/reactions/{id}", method = RequestMethod.PUT)
	public Reaction updateReactionByForum(@PathVariable("id") Long id, @PathVariable("idForum") Long idForum,@RequestBody Reaction reaction) {
		return reactionService.editReactionByForum(idForum, id, reaction);
	}
	
	@RequestMapping(value="/commentaire/{idCommentaire}/reactions/{id}", method = RequestMethod.PUT)
	public Reaction updateReactionByCommentaire(@PathVariable("id") Long id, @PathVariable("idCommentaire") Long idCommentaire,@RequestBody Reaction reaction) {
		return reactionService.editReactionByCommentaire(idCommentaire, idCommentaire, reaction);
	}
	
	@RequestMapping(value="/reactions/{id}",method = RequestMethod.DELETE)
	public void deleteReaction(@PathVariable("id") Long id)
	{
		reactionService.deleteReaction(id);
	}
}
