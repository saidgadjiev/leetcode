package ru.saidgadjiev.leetcode._146;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

class LRUCacheTest {

    @Test
    public void test() {
        LRUCache cache = new LRUCache(2);

        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        Assertions.assertEquals(3, cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        Assertions.assertEquals(-1, cache.get(1));       // returns -1 (not found)
        cache.put(3, 3);
        Assertions.assertEquals(3, cache.get(3));       // returns 3
        Assertions.assertEquals(4, cache.get(4));       // returns 4
    }

    @Test
    public void test11() throws Exception {
        File file = new File("/Users/said/Desktop/testcase.json");
        Gson gson = new Gson();

        JsonObject testCase = gson.fromJson(new FileReader(file), JsonObject.class);
        String inputFormattedStr = testCase.getAsJsonPrimitive("input_formatted").getAsString();
        String[] args = inputFormattedStr.split(", ");
        List<String> commands = gson.fromJson(args[0], new TypeToken<List<String>>() {}.getType());

        List<Integer[]> values = gson.fromJson(args[1], new TypeToken<List<Integer[]>>() {}.getType());
        List<Integer> expected = gson.fromJson(testCase.get("expected_output").getAsString(), new TypeToken<List<Integer>>() {}.getType());
        LRUCache lruCache = null;

        for (int i = 0; i < commands.size(); ++i) {
            String command = commands.get(i);

            switch (command) {
                case "LRUCache":
                    lruCache = new LRUCache(values.get(i)[0]);
                    break;
                case "put":
                    lruCache.put(values.get(i)[0], values.get(i)[1]);
                    break;
                case "get":
                    int value = lruCache.get(values.get(i)[0]);

                    Assertions.assertEquals(expected.get(i), value, "i:" + i + " key: " + values.get(i)[0]);
                    break;
            }
        }
    }

}