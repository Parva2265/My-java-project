import java.util.Scanner;

class Student1 {
    private String name;
    private int numberOfSubjects;
    private int[] subjectMarks;
    private int totalMarks;
    private double percentage;
    private char grade;
    private String result;

    public Student1(String name, int numberOfSubjects) {
        this.name = name;
        this.numberOfSubjects = numberOfSubjects;
        this.subjectMarks = new int[numberOfSubjects];
    }

    public void inputSubjectMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the subject marks:");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectMarks[i] = sc.nextInt();
            totalMarks += subjectMarks[i];
        }
        percentage = (double) totalMarks / numberOfSubjects;
        calculateGradeAndResult();
    }

    private void calculateGradeAndResult() {
        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 60) {
            grade = 'B';
        } else if (percentage >= 40) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        result = (percentage >= 40) ? "Pass" : "Fail";
    }

    public void display() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Name of Student: " + name);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
        System.out.println("-------------------------------------------------------");

        System.out.println("\n\nAll input Subject marks:");
        System.out.println("\n-------------------------------------------------------");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Subject " + (i + 1) + " marks = " + subjectMarks[i]);
        }
        System.out.println("-------------------------------------------------------");
    }
}

public class TestStudent1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the student name: ");
        String name = sc.nextLine();
        System.out.print("How many subjects do you study? ");
        int numberOfSubjects = sc.nextInt();

        Student1 student = new Student1(name, numberOfSubjects);
        student.inputSubjectMarks();
        student.display();
    }
}
