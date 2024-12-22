package qa_automation.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class DataUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    // Hàm đọc dữ liệu từ tệp JSON
    public static JsonNode getDataFromJson(String filePath) {
        try {
            return objectMapper.readTree(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
