package readDataFromPropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Eg1 {
    public static void main(String[] args) throws IOException {
        FileInputStream myfile = new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\24jantestingselenium\\src\\credentials.properties");
        //create an object of Properties class
        Properties properties= new Properties();
        //load file using properties object
        properties.load(myfile);
        //read data
        String applicationUrl = properties.getProperty("url");
        System.out.println("application url is "+applicationUrl);
        //env
        String applicationEnv = properties.getProperty("browser");
        System.out.println("application environment is "+applicationEnv);



    }
}
