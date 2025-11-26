package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestData {

    public static String propertyReader(String key) throws IOException {
        FileInputStream path=new FileInputStream("src/test/resources/TestData.properties");
        Properties pro=new Properties();
        pro.load(path);
        return pro.getProperty(key);
    }

}
