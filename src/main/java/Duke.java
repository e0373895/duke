import  java.util.Scanner;

public class Duke {

    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        System.out.println("Hello! I'm Duke.\nWhat can I do for you?");

        while (true) {
            String line;
            Scanner in = new Scanner(System.in);
            line = in.nextLine();

            Task t = new Task(line);

            if (line.equals("list")) {
                Task.listTask();
            } else if (line.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
                break;
            } else {
                Task.addTask();
            }
        }
    }

}
