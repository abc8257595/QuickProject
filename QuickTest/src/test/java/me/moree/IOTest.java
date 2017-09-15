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
    // getResourceAsStream()必须要有斜杠
    public void readFileViaStream() {
        Class baseClass = this.getClass();
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

    @Test
    // 通过File读文件没有斜杠，跟ide的working directory有关，.代表当前项目目录，即QuickTest这个目录，也可以去掉./
    public void readFileViaFileReader() throws IOException {
    	File file = new File("pom.xml");
    	BufferedReader reader = new BufferedReader(new FileReader(file));
	    String line;
	    StringBuilder builder = new StringBuilder();
	    while ((line = reader.readLine()) != null) {
	    	builder.append(line);
	    }
	    reader.close();
	    logger.info(builder.toString());
    }
}
