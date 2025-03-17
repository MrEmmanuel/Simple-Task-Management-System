package service;


//Task class to store details of a task
public class Task {
	
	String title;
	boolean isCompleted;

	public Task(String title) {
		this.title = title;
		this.isCompleted = false;
		
	}
	
	public void markCompleted() {
		this.isCompleted = true;
	}

	@Override
	public String toString() {
		return (isCompleted ? "[ v ] ": "[ ] ") + title;
	}
	
	
}
