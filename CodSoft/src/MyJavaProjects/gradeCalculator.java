package MyJavaProjects;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Subjects:-->> ");
        int numSubjects = sc.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Marks obtained in subject " + i + " : ");
            int marks = sc.nextInt();
            totalMarks += marks;

        }
        double avgPercent = (double) totalMarks / numSubjects ;
        char grade;
        if (avgPercent>=90){
            grade = 'A';

        } else if (avgPercent>=80) {
            grade = 'B';

        } else if (avgPercent>=70) {
            grade = 'C';

        } else if (avgPercent>=60) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println("totalMarks :-->> " +totalMarks);
        System.out.println("AVERAGE Percent : " +avgPercent + " %");
        System.out.println("GRADE :-->> " +grade);
        sc.close();
    }
}
