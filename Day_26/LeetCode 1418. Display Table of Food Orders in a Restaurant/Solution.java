//"https://leetcode.com/problems/display-table-of-food-orders-in-a-restaurant/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        List<List<String>> orders = Arrays.asList(
            Arrays.asList("David", "3", "Cevapi"),
            Arrays.asList("Corina", "3", "Fried Chicken"),
            Arrays.asList("David", "2", "Cevapi"),
            Arrays.asList("Corina", "3", "Cevapi"),
            Arrays.asList("David", "3", "Fried Chicken")
        );
        
        List<List<String>> displayTable = displayTable(orders);
        for (List<String> row : displayTable) {
            System.out.println(row);
        }
    }
    public static List<List<String>> displayTable(List<List<String>> orders) {
        Map<Integer, Map<String, Integer>> tableToFoodMap = new HashMap<>();
        Set<String> foodItems = new TreeSet<>();
        
        for (List<String> order : orders) {
            String customerName = order.get(0); 
            int tableNumber = Integer.parseInt(order.get(1));
            String foodItem = order.get(2);
            
            foodItems.add(foodItem);
            
            tableToFoodMap.putIfAbsent(tableNumber, new HashMap<>());
            Map<String, Integer> foodCountMap = tableToFoodMap.get(tableNumber);
            foodCountMap.put(foodItem, foodCountMap.getOrDefault(foodItem, 0) + 1);
        }
        
        List<String> header = new ArrayList<>();
        header.add("Table");
        header.addAll(foodItems);
        
        List<List<String>> result = new ArrayList<>();
        result.add(header);
        
        List<Integer> sortedTables = new ArrayList<>(tableToFoodMap.keySet());
        Collections.sort(sortedTables);
        
        for (int tableNumber : sortedTables) {
            List<String> row = new ArrayList<>();
            row.add(String.valueOf(tableNumber));
            Map<String, Integer> foodCountMap = tableToFoodMap.get(tableNumber);
            
            for (String foodItem : foodItems) {
                row.add(String.valueOf(foodCountMap.getOrDefault(foodItem, 0)));
            }
            
            result.add(row);
        }
        
        return result;
    }
}
