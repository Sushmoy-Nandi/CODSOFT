package in.codsoft.task2;

import java.util.Scanner;

public class StudentGradeCalculatorTest extends StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to the Student Grade Calculator");
        System.out.print("Enter the number of subjects(Total 3 subject here): ");
        numberOfSubjects=input.nextInt();
        System.out.println();
        System.out.print("Please enter your Math marks: ");
        mathMarks=input.nextInt();
        System.out.print("Please enter your Physics marks: ");
        physicsMarks=input.nextInt();
        System.out.print("Please enter your Chemistry Marks: ");
        chemistryMarks=input.nextInt();

        totalMarks=mathMarks+physicsMarks+chemistryMarks;
        averageMarks= (double) totalMarks /numberOfSubjects;
        percentageOfMarks= (float) (averageMarks/100)*100;
        System.out.print("Total Marks: ");
        System.out.println(totalMarks);
        System.out.print("Percentage of Total Marks: ");
        System.out.println(percentageOfMarks+" %");

        if (percentageOfMarks >= 90) {
            System.out.println("Great, You have got A");
        } else if (percentageOfMarks >= 75) {
            System.out.println("Good, You have got B");
        } else if (percentageOfMarks >= 60) {
            System.out.println("You have got C, Work harder next time");
        } else if (percentageOfMarks >= 30) {
            System.out.println("You have got D, You seriously need to work harder");
        } else {
            System.out.println("Sorry, You have failed the test and got a F");
        }
    }
}
