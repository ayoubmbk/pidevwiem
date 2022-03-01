package com.PiDev.Services;

import java.util.List;

import com.PiDev.Entities.Event;


public interface EventServices {
	
	Event saveEvent(Event p);
	Event updateEvent(Event p);
	void deleteEvent(Event p);
	void deleteEventById(Long id);
	Event getEvent(Long id);
	List<Event> getAllEvents();

}
