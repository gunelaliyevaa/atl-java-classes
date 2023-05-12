package az.atlacademy.module01.lesson16_p2;

import java.util.HashMap;

public class MapApp {
    public static void main(String[] args) {
        HashMap<String, String> humanMap = new HashMap<>();
        humanMap.put("p1", "Lana");
        humanMap.put("p2", "Alex");
        humanMap.put("p3", "Nemo");
        humanMap.put("p4", "");
        humanMap.put("", "Idk");

        System.out.println(humanMap);

        String str = humanMap.get("p3");
        System.out.println(str);

        String str2 = humanMap.get("p1");
        System.out.println(str2);
        System.out.println(new String("p2").hashCode());

        humanMap.remove("p1");
        System.out.println(humanMap);

        System.out.println(humanMap.size());
        System.out.println(humanMap.containsKey("p5"));

        humanMap.clear();
        System.out.println(humanMap.size());

        String str3 = humanMap.get("p1");
        System.out.println(str2);

        System.out.println(new String("p1").hashCode());
    }
}
