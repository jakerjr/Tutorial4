import java.text.ParseException;
import java.util.Scanner;

public class Tasks {
    private String studentName;
    private String courseTitle;
    private Tasks[] tasks;

    private Scanner input;

    public String getStudentName() {
        return studentName;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setStudentInformation(String studentName, String courseTitle) {
        this.studentName = studentName;
        this.courseTitle = courseTitle;
    }

    public void task1and2() {
        tasks = new Tasks[5];
        input = new Scanner(System.in);

        for (int x = 0; x < tasks.length; x++) {
            System.out.println("Enter student no. " + x++);
            String name = input.next();
            System.out.println("Enter the course ");
            String course = input.next();
            setStudentInformation(name, course);
        }

    }

    public void task2(){
        task1and2();

        for (int x = 0; x < tasks.length; x++){
            System.out.println(x++ + tasks[x].getStudentName()+ "\t\t" + tasks[x].getCourseTitle());
        }
    }

    public void task3() throws ParseException, NullPointerException {
        input = new Scanner(System.in);
        System.out.println("How many students will be recorded?");

        int numberOfStudents = input.nextInt();
        tasks = new Tasks[numberOfStudents];

        for (int x = 0; x < tasks.length; x++){
            System.out.println("Pls enter the name of student no." + x++);
            String name = input.next();
            System.out.println("Pls enter the course he/she is enrolled to");
            String course = input.next();
            setStudentInformation(name, course);
        }

        for (int x = 0; x < tasks.length; x++){
            System.out.println(tasks[x].getStudentName());
        }
    }

    public void task4() throws ParseException, NullPointerException{
        String question = "How old are you?";
        String tooYoung = "Young Person";
        String tooOld = "adult";

        input = new Scanner(System.in);

        System.out.println(question);

        int answer = input.nextInt();

        if (answer < 18) {
            System.out.println(tooYoung);
        } else {
            System.out.println(tooOld);
        }


    }


}
