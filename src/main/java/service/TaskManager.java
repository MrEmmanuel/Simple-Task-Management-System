package service;

import java.util.LinkedList;

//Task Manager class using LinkedList
public class TaskManager {
	
	private LinkedList<Task> taskList;
	
	public TaskManager() {
		this.taskList = new LinkedList<Task>();
	}
	
	// Add a new task
	public void addTask(String title) {
		
		taskList.add(new Task(title));
		System.out.println("Task added: " + title);
		
	}
	
	// Remove a task by index
	public void removeTask(int index) {
		
		if(index >=0 && index < taskList.size()) {
			Task removedTask = taskList.remove(index);
		}
		
	}
	
	// Mark a task as completed
	public void completeTask(int index) {
		
		if(index >=0 && index < taskList.size()) {
			taskList.get(index).markCompleted();;
		}
		
	}
	
	// Display all tasks
	public void displayTasks() {
		if(taskList.isEmpty()) {
			System.out.println("No tasks available");
		}else {
			System.out.println("Task list: ");
			for(int i=0; i<=taskList.size();i++) {
				System.out.println(i + "." + taskList.get(i));
			}
		}
		
	}

	public Integer getTaskCount() {
		return taskList.size();
	}

	public Object getTask(int index) {
        if (index >= 0 && index < taskList.size()) {
            return taskList.get(index).toString();
        }
        return null;
	}
}
