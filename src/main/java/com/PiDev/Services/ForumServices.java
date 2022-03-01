package com.PiDev.Services;

import java.util.List;

import com.PiDev.Entities.Event;
import com.PiDev.Entities.Forum;

public interface ForumServices {
	Forum saveForum(Forum p);
	Forum updateForum(Forum p);
	void deleteForum(Forum p);
	void deleteForumById(Long id);
	Forum getForum(Long id);
	List<Forum> getAllForums();
	List<Forum> trierForumsNomsPrix();
}
