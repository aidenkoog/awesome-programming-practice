package json.test;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class App {
    public String getGreeting() {
        return "Hello World AidenKooG !!!";
    }

    public static void main(String[] args) throws IOException, URISyntaxException {

        System.out.println(new App().getGreeting());

        URL resource = App.class.getClassLoader().getResource("Data.json");
        assert resource != null;

        String str = Files.readString(Paths.get(resource.toURI()));
        System.out.println(str);

        JsonData jsonData = new Gson().fromJson(str, JsonData.class);

        Set<String> objectKeys = jsonData.data.keySet();
        System.out.println(objectKeys);

        for (String key : objectKeys) {
            List<Data> data = jsonData.data.get(key);
            System.out.println(data);
        }
    }

    private static class JsonData {
        private LinkedHashMap<String, List<Data>> data;
        private int status;
    }

    private static class Data {
        private long id;
        private String type;
        private int point;

        @Override
        public String toString() {
            return "id : " + id + ", type : " + type + ", point : " + point;
        }
    }
}
