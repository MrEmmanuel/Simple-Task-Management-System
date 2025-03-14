package service;

import java.util.Scanner;

public class LinkedListTaskManager {
	
	public static void main(String[] args) {
		TaskManager manager = new TaskManager();
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Complete Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
            case 1:
                System.out.print("Enter task title: ");
                String title = scanner.nextLine();
                manager.addTask(title);
                break;
            case 2:
                manager.displayTasks();
                System.out.print("Enter task index to remove: ");
                int removeIndex = scanner.nextInt();
                manager.removeTask(removeIndex);
                break;
            case 3:
                manager.displayTasks();
                System.out.print("Enter task index to mark as completed: ");
                int completeIndex = scanner.nextInt();
                manager.completeTask(completeIndex);
                break;
            case 4:
                manager.displayTasks();
                break;
            case 5:
                System.out.println("Exiting Task Manager.");
                break;
            default:
                System.out.println("Invalid choice. Try again.");
            }
		} while (choice != 5);

    scanner.close();
		
	}
}
