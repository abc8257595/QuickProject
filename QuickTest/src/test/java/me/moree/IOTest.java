package me.moree;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * Created by MORE-E on 8/6/2017.
 */
public class IOTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void readFile() {
        Class baseClass = this.getClass();
        // 必须要有斜杠
        try (InputStream is = baseClass.getResourceAsStream("/logback-test.xml")) {
            if (is != null) {
                char[] buffer = new char[4096];
                Reader reader = new InputStreamReader(is);
                StringWriter writer = new StringWriter();
                int n = 0;
                while ((n = reader.read(buffer)) != -1) {
                    writer.write(buffer, 0, n);
                }
                System.out.println(writer.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
