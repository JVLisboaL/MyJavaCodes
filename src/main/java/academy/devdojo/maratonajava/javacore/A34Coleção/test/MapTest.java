package academy.devdojo.maratonajava.javacore.A34Coleção.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("vc", "você2");
        map.put("vc", "você3");
        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("--------------------------------");
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("--------------------------------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}