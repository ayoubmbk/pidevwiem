package com.PiDev.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.PiDev.Entities.Event;
import com.PiDev.Entities.Forum;
import com.PiDev.Services.EventServices;
import com.PiDev.Services.ForumServices;

@RestController
@RequestMapping("/api2")
@CrossOrigin
public class ForumRestController {

	@Autowired
	ForumServices forumService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Forum> getAllForums()
	{
		return forumService.getAllForums();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Forum getForumById(@PathVariable("id") Long id) {
		return forumService.getForum(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Forum createProduit(@RequestBody Forum produit) {
			return forumService.saveForum(produit);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Forum updateProduit(@RequestBody Forum produit) {
		return forumService.updateForum(produit);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteForum(@PathVariable("id") Long id)
	{
			forumService.deleteForumById(id);
	}
	
	@RequestMapping(value="/3",method=RequestMethod.GET)
	public List<Forum> getForumsOrderbyLikes()
	{
		return forumService.trierForumsNomsPrix();
	}
}
