package main.java.FileReading;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by neeraj.bhatnagar on 1/17/2017.
 */
public class PropertyFileReading {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        File fis = new File(System.getProperty("user.dir") + "\\config.properties");
        FileReader obj = new FileReader(fis);
        properties.load(obj);
        String value = properties.getProperty("userNameValue");
        System.out.println(value);
        System.out.println(properties.get("invalidPassword"));
    }
}
