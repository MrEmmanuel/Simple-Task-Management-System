package serviceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.TaskManager;

public class TaskManagerTest {
	
	private TaskManager taskManager;
	
	@BeforeEach
	public void setUp() {
		taskManager = new TaskManager();
	}
	
	@Test
	public void testAddTask() {
		taskManager.addTask("Write Unit Tests");
		assertEquals(1, taskManager.getTaskCount());
		assertEquals("[ ] Write Unit Tests", taskManager.getTask(0));
		
	}

	@Test
	public void testRemoveTask() {
		taskManager.addTask("Task 1");
		taskManager.addTask("Task 2");
		assertEquals(2, taskManager.getTaskCount());
		
		taskManager.removeTask(0);
		assertEquals(1, taskManager.getTaskCount());
		assertEquals("[ ] Task 2", taskManager.getTask(0));
	}
	
	
	@Test
	public void testCompleteTask() {
		taskManager.addTask("Complete JUnit Test");
		taskManager.completeTask(0);
		assertEquals("[ v ] Complete JUnit Test", taskManager.getTask(0));
		
	}
	
	@Test
	public void testRemoveTaskInvalidIndex() {
		taskManager.addTask("Only Task");
		taskManager.removeTask(5);
		assertEquals(1, taskManager.getTaskCount());
		
		
	}
	
	@Test
	public void testCompeteTaskInvalidIndex() {
		
		taskManager.completeTask(3);
		assertEquals(0, taskManager.getTaskCount());
	}
	
	
}
