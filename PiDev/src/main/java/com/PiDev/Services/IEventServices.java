package com.PiDev.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PiDev.Entities.Event;
import com.PiDev.Repos.EventRepository;


@Service
public class IEventServices implements EventServices{
	
	@Autowired
	EventRepository eventRepository;
	
	@Override
	public Event saveEvent(Event p) {
		return eventRepository.save(p);
	}

	@Override
	public Event updateEvent(Event p) {
		return eventRepository.save(p);
	}

	@Override
	public void deleteEvent(Event p) {
		eventRepository.delete(p);
		
	}

	@Override
	public void deleteEventById(Long id) {
		eventRepository.deleteById(id);
		
	}

	@Override
	public Event getEvent(Long id) {
		return eventRepository.findById(id).get();
	}

	@Override
	public List<Event> getAllEvents() {
		
		return eventRepository.findAll();
	}

}
