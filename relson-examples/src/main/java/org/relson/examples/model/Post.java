/*
 User: Ophir
 Date: 04/05/13
 Time: 22:23
 */
package org.relson.examples.model;

import com.google.common.collect.Lists;
import java.util.List;
import org.relson.annotations.ResourceId;

public class Post {

	@ResourceId
	private String id;
	private User author;
	private final List<Comment> comments = Lists.newArrayList();
	private String title;
	private String text;

	public User getAuthor() {
		return author;
	}

	public List<Comment> getComments() {
		return comments;
	}
}
