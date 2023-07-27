package task_02;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static String WeightMeasure = "kg";

    public static void main(String[] args) {

        LOGGER.info("\n" + getResult(getSearch(), getData()));
    }

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private static Map<String, Integer> getData() {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("orange", 12);
        map.put("banana", 25);
        map.put("lemon", 8);
        map.put("pineapple", 13);
        map.put("grape", 9);
        return map;
    }

    private static String getSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        return scanner.nextLine().trim();
    }

    private static String getResult(String code, Map<String, Integer> map) {
        boolean hasContain = map.containsKey(code);
        if (hasContain) {
            Integer weight = map.get(code);
            return code + " = " + weight + " " + WeightMeasure;
        } else
            return code + " not found!";
    }
}


