import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of following subject (out of 100) : ");

        System.out.println("\nEnter a marks of MARATHI: ");
        int m=sc.nextInt();
        System.out.println("Enter a marks of ENGLISH: ");
        int e=sc.nextInt();
        System.out.println("Enter a marks of MATH: ");
        int m1=sc.nextInt();
        System.out.println("Enter a marks of HISTORY: ");
        int h=sc.nextInt();
        System.out.println("Enter a marks of GEOGRAPHY: ");
        int g=sc.nextInt();

        float totalMarks = 0;
        
        totalMarks=(m+e+m1+h+g);
     
        float averagePercentage = (float)totalMarks / 500*100;

        String grade;
        if (averagePercentage >= 90 && averagePercentage<=100 ) {
            grade = "A+";
        } else if (averagePercentage >= 80 && averagePercentage<=89) {
            grade = "A";
        } else if (averagePercentage >= 70 && averagePercentage<=79) {
            grade = "B";
        } else if (averagePercentage >= 60 && averagePercentage<=69) {
            grade = "C";
        } else if (averagePercentage >= 36 && averagePercentage<=59) {
            grade = "D";
        } else if ( averagePercentage<=35)
        {
            grade = "F";
        }
        else
        {
            grade="out of range";
        }

        System.out.print("\n Total Maraks  \t  Average Marks \t Grade");

        System.out.println("\n"+ totalMarks+"\t\t\t"+averagePercentage +"%"+"\t\t"+grade);
         
    }
}