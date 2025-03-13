package map.classActivity1A;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> employeeData = new HashMap<>();

        employeeData.put("John", 1001);
        employeeData.put("Jane", 1002);
        employeeData.put("Stark", 1003);
        employeeData.put("Snow", 1003);


        System.out.println(employeeData);

       // System.out.println(employeeData.get("John"));

    }
}
