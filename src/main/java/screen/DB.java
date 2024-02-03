package screen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 请实现一个简单的数据库，支持以下操作：
 * 1. SET_OR_INC key field value：如果数据库中不存在 key，则创建一个新的记录，并将 field 的值设为 value。如果数据库中存在 key，则将 field 的值增加 value。
 * 2. GET key field：返回数据库中 key 对应的 field 的值。如果 key 不存在，则返回空字符串。
 * 3. DELETE key field：删除数据库中 key 对应的 field。如果 key 不存在，则返回 false；如果 field 不存在，则返回 false；否则返回 true。
 * <p>
 * 输入：queries = [["SET_OR_INC", "A", "B", "5"], ["SET_OR_INC", "A", "B", "6"], ["GET", "A", "B"], ["GET", "A", "C"], ["DELETE", "A", "B"], ["DELETE", "A", "C"]]
 * 输出：["11", "", "true", "false"]
 */
public class DB {
    /**
     * 实现数据库操作, 返回操作结果, 操作结果为字符串数组, 每个元素为操作的结果
     * the purpose of this method is to implement a simple database, supporting the following operations:
     * 1. SET_OR_INC key field value: if the key does not exist in the database, create a new record and set the value of the field to value. If the key exists in the database, increase the value of the field by value.
     * 2. GET key field: return the value of the field corresponding to the key in the database. If the key does not exist, return an empty string.
     * 3. DELETE key field: delete the field corresponding to the key in the database. If the key does not exist, return false; if the field does not exist, return false; otherwise return true.
     *
     * @param queries string字符串二维数组 操作数组
     * @return string字符串一维数组
     */
    public String[] solution(String[][] queries) {
        Map<String, Map<String, Integer>> database = new HashMap<>();
        String[] results = new String[queries.length];
        int currentIndex = 0;
        for (String[] query : queries) {
            String operation = query[0];
            String key = query[1];
            String field = query[2];
            // if the operation is "SET_OR_INC", the value is the fourth element in the query
            if ("SET_OR_INC".equals(operation)) {
                int value = Integer.parseInt(query[3]);
                // call the setOrIncrement method to set or increment the value of the field
                results[currentIndex++] = setOrIncrement(database, key, field, value);
            } else if ("GET".equals(operation)) { // if the operation is "GET", call the get method to get the value of the field
                results[currentIndex++] = get(database, key, field); // call the get method to get the value of the field
            } else if ("DELETE".equals(operation)) {
                results[currentIndex++] = delete(database, key, field);
            }
        }

        return results;
    }

    /**
     * set or increment the value of the field, and return the new value as a string type value
     * @param database
     * @param key
     * @param field
     * @param value
     * @return
     */
    public String setOrIncrement(Map<String, Map<String, Integer>> database, String key, String field, int value) {
        database.putIfAbsent(key, new HashMap<>());
        Map<String, Integer> record = database.get(key);

        int currentValue = record.getOrDefault(field, 0);
        int newValue = currentValue + value;
        record.put(field, newValue);

        return String.valueOf(newValue);
    }

    /**
     * get the value of the field, and return the value as a string type value
     * @param database
     * @param key
     * @param field
     * @return
     */
    private String get(Map<String, Map<String, Integer>> database, String key, String field) {
        if (database.containsKey(key)) {
            Map<String, Integer> record = database.get(key);
            if (record.containsKey(field)) {
                return String.valueOf(record.get(field));
            }
        }
        return "";
    }

    /**
     * delete the field, and return the result as a string type value
     * @param database
     * @param key
     * @param field
     * @return
     */
    private String delete(Map<String, Map<String, Integer>> database, String key, String field) {
        if (database.containsKey(key)) {
            Map<String, Integer> record = database.get(key);
            if (record.containsKey(field)) {
                record.remove(field);
                if (record.isEmpty()) {
                    database.remove(key);
                }
                return "true";
            }
        }
        return "false";
    }

    /**
     * main method to test the solution
     * @param args
     */
    public static void main(String[] args) {
        DB db = new DB();
        String[][] queries = {
                {"SET_OR_INC", "A", "B", "5"},
                {"SET_OR_INC", "A", "B", "6"},
                {"GET", "A", "B"},
                {"GET", "A", "C"},
                {"DELETE", "A", "B"},
                {"DELETE", "A", "C"}
        };
        String[] solution = db.solution(queries);
        System.out.println(Arrays.toString(solution));
    }
}
