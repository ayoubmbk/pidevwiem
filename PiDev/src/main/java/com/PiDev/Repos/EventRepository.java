package com.PiDev.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PiDev.Entities.Event;

public interface EventRepository extends JpaRepository<Event,Long> {

}
