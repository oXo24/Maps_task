package task_01;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> productList = new HashMap<>();
        productList.put("orange", 12);
        productList.put("banana", 25);
        productList.put("lemon", 8);
        productList.put("pineapple", 13);
        productList.put("grape", 9);

        System.out.println("Initial data:");
        displayProductList(productList);

        updateProductList(productList, "banana", 14);
        updateProductList(productList, "plum", 15);

        System.out.println("\nUpdated data:");
        displayProductList(productList);
    }

    private static void updateProductList(Map<String, Integer> productList, String productName, int quantity) {
        productList.put(productName, quantity);
    }

    private static void displayProductList(Map<String, Integer> productList) {
        int i = 1;
        for (Map.Entry<String, Integer> entry : productList.entrySet()) {
            String productName = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(i + ") " + productName + ", " + quantity + " kg");
            i++;
        }
    }
}
