package main.java.FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by neeraj.bhatnagar on 1/18/2017.
 */
public class propertyFileWriting {
    public static void main(String[] args) throws IOException {
        File fis = new File(System.getProperty("user.dir")+"\\config.properties");
        Properties prop = new Properties();
        prop.setProperty("lastName", "Bhatnagar");
        FileOutputStream fout = new FileOutputStream(fis);
        prop.store(fout,null);


    }
}
