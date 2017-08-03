package me.moree;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式测试，有以下几步：
 * 1. 编译正则表达式，由Pattern的工厂方法生成Pattern对象，生成对象同时对正则表达式进行编译
 * 2. 生成Matcher对象，作进一步的操作，由Pattern的matcher方法生成对象
 * 3. 匹配操作，全匹配测试 matches；起始匹配测试 lookingAt；查找匹配 find，只有find成功，才能执行group, start, end等操作
 * Created by MORE-E on 8/3/2017.
 */
public class RegExpTest {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    // 全匹配，直接用Pattern类的静态方法，本质还是先生成Pattern，再生成Matcher对象进行matches
    public void matchesTest() {
        String content = "I am MORE-E from earth.";
        String patternStr = ".*MORE-E.*";
        boolean isMatch = Pattern.matches(patternStr, content);
        Assert.assertEquals(true, isMatch);

        // 等同形式
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(content);
        Assert.assertEquals(true, matcher.matches());
    }

    @Test
    // 起始匹配，lookingAt
    public void lookingAtTest() {
        String content1 = "foooooooooooooooooo";
        String patternStr = "foo";
        String content2 = "ooooooooofooooooooo";

        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher1 = pattern.matcher(content1);
        Matcher matcher2 = pattern.matcher(content2);
        Assert.assertEquals(true, matcher1.lookingAt());
        Assert.assertEquals(false, matcher1.matches());
    }

    @Test
    // 循环捕获
    public void loopTest() {
        String content = "something like a-1, a-2, a-3";
        String patternStr = "a-\\d";

        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(content);

        int num = 1;
        while (matcher.find()) {
            Assert.assertEquals("a-" + num, matcher.group());
            num++;
        }
    }

    @Test
    // 分组捕获
    public void groupTest() {
        String contend = "abc 3000! OK?";
        String patternStr = "(\\D*)(\\d+)(.*)";

        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(contend);

        if (matcher.find( )) {
            Assert.assertEquals(contend, matcher.group(0));
            Assert.assertEquals("abc ", matcher.group(1));
            Assert.assertEquals("3000", matcher.group(2));
            Assert.assertEquals("! OK?", matcher.group(3));
            try {
                System.out.println(matcher.group(4));
            } catch (IndexOutOfBoundsException e) {
                Assert.assertEquals("No group 4", e.getMessage());
            }
        } else {
            System.out.println("NO MATCH");
        }
    }
}
