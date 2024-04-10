package TempConvert;

import java.util.Scanner;

public class Student {
	
	private double math;
    private double english;
    private double science;

    public Student(int math, int english, int science) {
        this.math = math;
        this.english = english;
        this.science = science;
    }

    public void calculateGrade() {
        double average = (math + english + science) / 3.0;

        char Grade;
        if (average >= 90 && average <= 100) {
            Grade = 'A';
        } else if (average >= 80 && average <= 89) {
            Grade = 'B';
        } else if (average >= 70 && average <= 79) {
            Grade = 'C';
        } else if (average >= 60 && average <= 69) {
            Grade = 'D';
        } else {
            Grade = 'F';
        }

        System.out.println("Average Grade: " + average);
        System.out.println("Letter Grade: " + Grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Math score
        System.out.print("Enter Math score (0-100): ");
        int math = scanner.nextInt();

        // Input English score
        System.out.print("Enter English score (0-100): ");
        int english = scanner.nextInt();

        // Input Science score
        System.out.print("Enter Science score (0-100): ");
        int science = scanner.nextInt();

        // Create a Student object
        Student student = new Student(math, english, science);

        // Calculate and display the grade
        student.calculateGrade();

        scanner.close();

	
		

	}

}
