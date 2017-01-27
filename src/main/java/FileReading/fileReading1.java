package main.java.FileReading;

import java.io.*;
import java.util.Properties;

/**
 * Created by neeraj.bhatnagar on 1/18/2017.
 */
public class fileReading1 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        File fis = new File(System.getProperty("user.dir") + "\\config.properties");
        FileReader fileReader = new FileReader(fis);
        prop.load(fileReader);
        String value = prop.getProperty("validPassword");
        System.out.println(value);
        prop.setProperty("Name", "Neeraj");
        FileOutputStream fout = new FileOutputStream(fis);
        prop.store(fout,null);



    }
}
