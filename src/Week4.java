import java.util.Scanner;

public class Week4 {
    public static void main(String[] args) {
        try {
            Tasks tasks = new Tasks();
            Tasks[] task1;
            Scanner input = new Scanner(System.in);

            System.out.println("What task do you want to perform? \n<task1> <task2> <task3> <task4>");

            String task = input.next();

            boolean finish = false;

            while (!finish) {
                switch (task.toLowerCase()) {
                    case "task1":
                        task1 = new Tasks[5];
                        finish = true;
                        break;
                    case "task2":
                        task1 = new Tasks[5];
                        tasks.task2();
                        finish = true;
                        break;
                    case "task3":
                        tasks.task3();
                        finish = true;
                        break;
                    case "task4":
                        tasks.task4();
                        finish = true;
                        break;
                    default:
                        System.out.println("That is not a valid task or input");
                        finish = true;
                        break;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
