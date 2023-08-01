package HW;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Object> params = new HashMap<>();
        params.put("model", "V-60");
        params.put("country", "Germany");
        params.put("city", "Berlin");
        params.put("year", null);
        params.put("active", true);

        String sqlQuery = buildQuery("cars", params);
        System.out.println(sqlQuery);
    }

    public static String buildQuery(String tableName, Map<String, Object> params) {
        StringBuilder sb = new StringBuilder("SELECT * FROM " + tableName + " WHERE ");

        boolean isFirstParam = true;
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (value != null) {
                if (!isFirstParam) {
                    sb.append(" AND ");
                } else {
                    isFirstParam = false;
                }

                if (value instanceof String) {
                    sb.append(key).append(" = '").append(value).append("'");
                } else {
                    sb.append(key).append(" = ").append(value);
                }
            }
        }

        return sb.toString();
    }
}
