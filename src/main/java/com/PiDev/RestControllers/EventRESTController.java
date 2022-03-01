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
import com.PiDev.Services.EventServices;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class EventRESTController {
	
	@Autowired
	EventServices eventService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Event> getAllEvents()
	{
		return eventService.getAllEvents();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Event getProduitById(@PathVariable("id") Long id) {
		return eventService.getEvent(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Event createProduit(@RequestBody Event produit) {
			return eventService.saveEvent(produit);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Event updateProduit(@RequestBody Event produit) {
		return eventService.updateEvent(produit);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id)
	{
			eventService.deleteEventById(id);
	}
	
	/*@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
	public List<Event> getEventsByCatId(@PathVariable("idCat") Long idCat) {
		return eventService.findByCategorieIdCat(idCat);
	}*/

}
