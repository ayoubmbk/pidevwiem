package com.PiDev.Entities;


import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.PiDev.Entities.User;

@Entity
public class Idea {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idIdea;
	private Long VotePlus;
	private Long VoteCounter;
	private String Subject;
	
	/*@ManyToOne
	private User user;*/

}
