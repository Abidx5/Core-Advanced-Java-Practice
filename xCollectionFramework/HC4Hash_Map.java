package xCollectionFramework;
import java.util.HashMap;
import java.util.Map;
public class HC4Hash_Map {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 40);

        // Displaying the HashMap
        System.out.println("Initial HashMap: " + map);

        // Accessing a value using the key
        int price = map.get("Apple");
        System.out.println("Price of Apple: " + price);

        // Removing a key-value pair
        map.remove("Banana");
        System.out.println("After removing Banana: " + map);

        // Checking if a key exists
        boolean hasOrange = map.containsKey("Orange");
        System.out.println("Has Orange: " + hasOrange);

        // Checking if a value exists
        boolean hasPrice50 = map.containsValue(50);
        System.out.println("Has price 50: " + hasPrice50);

        // Iterating over the keys
        System.out.println("Keys in HashMap: ");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // Iterating over the values
        System.out.println("Values in HashMap: ");
        for (int value : map.values()) {
            System.out.println(value);
        }

        // Iterating over key-value pairs
        System.out.println("Key-Value pairs in HashMap: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
