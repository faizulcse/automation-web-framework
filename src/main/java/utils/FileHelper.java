package utils;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHelper {

    public static FileReader readJson(String fileName) {
        try {
            return new FileReader(User.JSON_DIR_PATH + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object getModel(FileReader jsonData, Class classType) {
        return new Gson().fromJson(jsonData, classType);
    }

    public static Object getModel(String fileName, Class classType) {
        try {
            return new Gson().fromJson(new FileReader(User.JSON_DIR_PATH + fileName), classType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
