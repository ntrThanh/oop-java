import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter salary ");
            int salary = sc.nextInt();
            if (salary == -1) {
                System.out.println("Bye!");
                break;
            }
            System.out.println("Enter age ");
            int age = sc.nextInt();
            calculateAndDisplayContributions(salary, age);
        }
    }

    public static void calculateAndDisplayContributions(int salary, int age) {
        double employeeRate;
        double employerRate;
        if (age <= 55) {
            employeeRate = 0.2;
            employerRate = 0.17;
        } else if (age <= 60) {
            employeeRate = 0.13;
            employerRate = 0.13;
        } else if (age <= 65) {
            employeeRate = 0.075;
            employerRate = 0.09;
        } else {
            employeeRate = 0.05;
            employerRate = 0.075;
        }

        // mức lương trần là 6000 USD
        int maxSalary;
        if (salary < 6000) {
            maxSalary =  salary;
        } else {
            maxSalary = 6000;
        }

        double employeeContribution = (double) maxSalary * employeeRate;
        double employerContribution = (double) maxSalary * employerRate;
        System.out.printf("The employee’s contribution is: %.2f", employeeContribution);
        System.out.println();
        System.out.printf("The employer’s contribution is: %.2f", employerContribution);
        System.out.println();
        System.out.printf("The total contribution is: %.2f", employeeContribution + employerContribution);
        System.out.println();
        System.out.println();
    }
}
