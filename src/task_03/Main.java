package task_03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String, Employee> contactsList = new LinkedHashMap<>();
        contactsList.put("Tom", new Employee("Tom", "tom@mail.com"));
        contactsList.put("Lisa", new Employee("Lisa", "lisa@mail.com"));
        contactsList.put("Alice", new Employee("Alice", "alisa@mail.com"));
        contactsList.put("Denis", new Employee("Denis", "den@mail.com"));

        System.out.println("Initial contacts:");
        displayContactsList(contactsList);

        updateContact(contactsList, askName(), askEmail());

        System.out.println("\nUpdated contacts:");
        displayContactsList(contactsList);
    }

    private static void updateContact(Map<String, Employee> contactsList, String name, String email) {
        Employee employee = contactsList.get(name);
        if (employee != null) {
            employee.setEmail(email);
        }
    }

    private static void displayContactsList(Map<String, Employee> contactsList) {
        int i = 1;
        for (Employee employee : contactsList.values()) {
            System.out.println(i + ") " + employee);
            i++;
        }
    }

    private static String askEmail() {
        Scanner scn = new Scanner(System.in);
        System.out.println("What is your new email?: ");
        return scn.nextLine().trim();
    }

    private static String askName() {
        Scanner scn = new Scanner(System.in);
        System.out.println("What is your name?: ");
        return scn.nextLine().trim();
    }
}
