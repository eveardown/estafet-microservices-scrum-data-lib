package com.estafet.microservices.scrum.lib.data.story;

public class AddSprintStory {

	private int storyId;

	private int sprintId;

	public int getStoryId() {
		return storyId;
	}

	public int getSprintId() {
		return sprintId;
	}

	public AddSprintStory setStoryId(int storyId) {
		this.storyId = storyId;
		return this;
	}

	public AddSprintStory setSprintId(int sprintId) {
		this.sprintId = sprintId;
		return this;
	}
	
	

}
