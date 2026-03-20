// David Omojola
// M4HW1
// 03/14/2026
// This program calculates widget sales, commission, and monthly salary based on sales data.

import java.util.Scanner;

public class M4HW1_Omojola {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Constants
        final double PRICE = 4.79;
        final double BASE_SALARY = 2000;

        // Variables
        String name;
        int widgetsSold, widgetsReturned, netWidgets;
        double salesAmount, commission, salary, commRate;

        // Input
        System.out.print("Enter sales person name: ");
        name = input.nextLine();

        System.out.print("Enter widgets sold: ");
        widgetsSold = input.nextInt();

        System.out.print("Enter widgets returned: ");
        widgetsReturned = input.nextInt();

        // Calculations
        netWidgets = widgetsSold - widgetsReturned;
        salesAmount = netWidgets * PRICE;

        // Decision Structure
        if (netWidgets >= 0 && netWidgets <= 100) {
            commRate = 0.10;
        } else if (netWidgets <= 199) {
            commRate = 0.15;
        } else if (netWidgets <= 299) {
            commRate = 0.20;
        } else {
            commRate = 0.25;
        }

        commission = commRate * salesAmount;
        salary = commission + BASE_SALARY;

        // Output
        System.out.println("\nSales Person: " + name);
        System.out.println("Net Widgets Sold: " + netWidgets);
        System.out.println("Widgets Sales Amount: $" + salesAmount);
        System.out.println("Commission Amount: $" + commission);
        System.out.println("Monthly Salary: $" + salary);
    }
}
