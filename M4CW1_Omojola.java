        // Variables
        int majors;              // Number of CS majors
        int nonmajors;           // Number of nonmajors
        double total;            // Total number of students
        double percentMajors;    // Percentage of CS majors
        double percentNonmajors; // Percentage of nonmajors

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Get the number of majors
        System.out.print("Enter the number of students majoring in CS: ");
        majors = input.nextInt();

        // Get the number of nonmajors
        System.out.print("Enter the number of non-computer science students: ");
        nonmajors = input.nextInt();

        // Calculate total
        total = majors + nonmajors;

        // Calculate percentages
        percentMajors = (majors / total) * 100;
        percentNonmajors = (nonmajors / total) * 100;

        // Display results
        System.out.println("Majors: " + percentMajors + "%");
        System.out.println("Nonmajors: " + percentNonmajors + "%");

        input.close();
    }
}
