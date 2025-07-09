/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permit;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gurde
 */
public class PermitCreationUI {
        private final PermitCategoryManager categoryManager = new PermitCategoryManager();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            String permitNumber = promptPermitNumber();
            String category = promptCategorySelection();

            Permit permit = new Permit(permitNumber, category);
            if (permit.validatePermitNumber()) {
                System.out.println("Permit successfully created!");
                System.out.println("Permit Number: " + permit.getPermitNumber());
                System.out.println("Category: " + permit.getCategory());
                break;
            } else {
                System.out.println("Invalid permit number format. Please try again.\n");
            }
        }
    }

    private String promptPermitNumber() {
        System.out.print("Enter the permit number (format AAA1234): ");
        return scanner.nextLine().trim().toUpperCase();
    }

    private String promptCategorySelection() {
        List<String> categories = categoryManager.getCategories();
        System.out.println("Select permit category:");

        for (int i = 0; i < categories.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, categories.get(i));
        }

        while (true) {
            System.out.print("Enter choice (1-" + categories.size() + "): ");
            String input = scanner.nextLine().trim();

            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= categories.size()) {
                    return categories.get(choice - 1);
                }
            } catch (NumberFormatException e) {
                // ignore and prompt again
            }
            System.out.println("Invalid selection. Please try again.");
        }
    }
}
