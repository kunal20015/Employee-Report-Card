import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Employee Report Card
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Employee Department : ");
        String dep = sc.nextLine();

        System.out.println("Enter Employee Age : ");
        int age = sc.nextInt();

        System.out.println("Enter Employee Salary : ");
        double salary = sc.nextDouble();

        System.out.println("Enter Overtime Hours : ");
        int overtime = sc.nextInt();

        System.out.println("Enter Performance Rating : ");
        int rating = sc.nextInt();

        System.out.println("Enter Number of Leaves : ");
        int leaves = sc.nextInt();


        double overTimePayment = salary*200;
        double bonus = (rating>=4) ? salary * 0.1 : salary * 0.05;
        double salarydeduction = leaves*500;

        double finalsalary = salary;
        finalsalary += bonus;
        finalsalary += overTimePayment;
        finalsalary -= salarydeduction;

        boolean isApplicableForReward = (rating>5 && leaves<=1);

        String performance = (finalsalary>25000) ? "Good Performance" : "Need Improvement";

        System.out.println("\n --- Final Report Card ---\n");

        System.out.println("Employee Name : " + name);
        System.out.println("Employee Department : " + dep);
        System.out.println("Employee Age : " + age);
        System.out.println("Employee Salary : " + salary);
        System.out.println("OverTime Pay : " + overTimePayment);
        System.out.println("Deduction : " + salarydeduction);
        System.out.println("Final Salary : " + finalsalary);
        System.out.println("Performance  : " + performance);


    }
}
