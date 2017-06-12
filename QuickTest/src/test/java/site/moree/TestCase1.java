package site.moree;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by MORE-E on 6/10/2017.
 */
public class TestCase1 {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test1() {
        logger.info("hello world!");
    }
}
