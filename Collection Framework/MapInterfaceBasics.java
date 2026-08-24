import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceBasics {

    //Map interface is a part of collection framework , it used map data structure
    //Map stores data in key value pairs
    //no duplicate key
    //insertion order maintain
    //value pairs in sorted order
    //allow one null key and multiple null values
    //but hash map does not allow null key and null value

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //insertion k liye put
        map.put("EN", "England");
        map.put("IN", "India");
        map.put("US", "United States");
        System.out.println(map);
        map.replace("US", "United States", "America");
        System.out.println(map);

        Map<String,String > table = new HashMap<>();
        table.put("ES", "Spain");
        table.put("NR", "Norway");
//      System.out.println("Before Putting all value of map " + table);
        table.putAll(map);
//      System.out.println("After Putting all value of map in inside the table map " + table);
        System.out.println(table.get("ES"));
        table.putIfAbsent("BR", "Bihar");
        System.out.println(table);
        System.out.println(table.getOrDefault("ZX", "No Value exist realted to this Key"));
        System.out.println(table.containsKey("ING")); //FALSE
        System.out.println(table.containsValue("India")); //True
        table.replace("BR", "Bihar", "Brasil");
        System.out.println(table);  //return true

        Set<String> keySet = table.keySet();
        System.out.println(keySet);

        Collection<String> keyValue = table.values();
        System.out.println(keyValue);

        //get all the entries from the map
        //entry set method is used
    }
}

