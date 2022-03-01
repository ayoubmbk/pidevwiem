package com.PiDev.Entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Event {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEvent;
	private String NameEvent;
	private String TypeEvent;
	private Long NoteEvent;
	private Date DateStartEvent;
	private Date DateEndEvent;
	
	@ManyToMany(mappedBy="events")
	private Set<User> users;
	
	
	@Override
	public String toString() {
		return "Event [idEvent=" + idEvent + ", NameEvent=" + NameEvent + ", TypeEvent=" + TypeEvent + ", NoteEvent="
				+ NoteEvent + ", DateStartEvent=" + DateStartEvent + ", DateEndEvent=" + DateEndEvent + ", users="
				+ users + "]";
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	//private List<String> Comments;
	//private List<User> Subscribers;
	
	public String getNameEvent() {
		return NameEvent;
	}
	public void setNameEvent(String nameEvent) {
		NameEvent = nameEvent;
	}
	public String getTypeEvent() {
		return TypeEvent;
	}
	public void setTypeEvent(String typeEvent) {
		TypeEvent = typeEvent;
	}
	public Long getNoteEvent() {
		return NoteEvent;
	}
	public void setNoteEvent(Long noteEvent) {
		NoteEvent = noteEvent;
	}
	public Date getDateStartEvent() {
		return DateStartEvent;
	}
	public void setDateStartEvent(Date dateStartEvent) {
		DateStartEvent = dateStartEvent;
	}
	public Date getDateEndEvent() {
		return DateEndEvent;
	}
	public void setDateEndEvent(Date dateEndEvent) {
		DateEndEvent = dateEndEvent;
	}
	public Event() {
		super();
	}
	
	public Long getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(Long idEvent) {
		this.idEvent = idEvent;
	}
	public Event(String nameEvent, String typeEvent, Long noteEvent, Date dateStartEvent, Date dateEndEvent,
			Set<User> users) {
		super();
		NameEvent = nameEvent;
		TypeEvent = typeEvent;
		NoteEvent = noteEvent;
		DateStartEvent = dateStartEvent;
		DateEndEvent = dateEndEvent;
		this.users = users;
	}
	
	
	
	/*@ManyToMany(mappedBy="Events")
	private Set<User> users;*/

	
	
}
