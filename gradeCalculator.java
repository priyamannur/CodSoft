import java.util.Scanner;
public class gradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("************************************************************************************");
        System.out.println("GRADE CALCULATOR");
        System.out.println();
        System.out.println("Enter the number of subjects");
        int no_of_subs = sc.nextInt();

        System.out.println("Enter maximum marks that can be scored in a subject");
        int max_marks = sc.nextInt();

        int sum_of_marks = 0;

        for(int i=0;i<no_of_subs;i++){
            System.out.println("Enter marks for Subjext "+(i+1));
            sum_of_marks+=sc.nextInt();
        }

        int total_marks = max_marks*no_of_subs;

        float percentage = ((float)sum_of_marks/total_marks)*100;

        char grade = 'F';

        if(percentage>100){
            System.out.println("Invalid marks entered try again");
        }
        else{
        if(percentage>=90){
            grade = 'S';
        }
        else if(percentage>=80){
            grade = 'A';
        }
        else if(percentage>=70){
            grade = 'B';
        }
        else if(percentage>=60){
            grade = 'C';
        }
        else if(percentage>=50){
            grade = 'D';
        }
        else if(percentage>=40){
            grade = 'P';
        }

        System.out.println();
        System.out.println("Total Marks Scored : "+sum_of_marks);
        System.out.println("Congratulations you scored : "+percentage+"%");
        System.out.println("Grade : "+grade);
        System.out.println();
        }
        System.out.println("************************************************************************************");
    }
}