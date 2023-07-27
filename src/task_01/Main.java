package task_01;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("Initial data:");
        displayProductList(getData());

        System.out.println("\nUpdated data:");
        displayProductList(updateProductList(updateProductList(getData(), "plum", 15), "banana", 14));
    }

    private static Map<String, Integer> getData() {

        Map<String, Integer> productList = new HashMap<>();
        productList.put("orange", 12);
        productList.put("banana", 25);
        productList.put("lemon", 8);
        productList.put("pineapple", 13);
        productList.put("grape", 9);

        return productList;
    }

    private static Map<String, Integer> updateProductList(Map<String, Integer> productList, String productName, int quantity) {
        productList.put(productName, quantity);
        return productList;
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
