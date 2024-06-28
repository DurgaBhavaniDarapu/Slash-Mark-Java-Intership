import java.util.Scanner;

public class TaskListApp {
    private static TaskList taskList = new TaskList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }

        System.out.println("Exiting Task List Application.");
    }

    private static void showMenu() {
        System.out.println("\nTask List Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. List Tasks");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addTask() {
        System.out.print("Enter the task description: ");
        String description = scanner.nextLine();
        taskList.addTask(description);
        System.out.println("Task added.");
    }

    private static void removeTask() {
        System.out.print("Enter the task number to remove: ");
        int taskNumber = Integer.parseInt(scanner.nextLine());
        taskList.removeTask(taskNumber - 1);
        System.out.println("Task removed.");
    }

    private static void listTasks() {
        System.out.println("Task List:");
        taskList.listTasks();
    }
}

