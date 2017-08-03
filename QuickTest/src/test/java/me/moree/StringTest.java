package me.moree;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 字符串功能测试用例
 * Created by MORE-E on 6/10/2017.
 */
public class StringTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    // 传值测试，changStr传入对象s的指针的值的复制，这个复制原来也是指向对象s
    public void pointerTest() {
        String s = "HELLO";
        changeStr(s);
        Assert.assertEquals("HELLO", s);
    }
    // 改变的仅是局部变量值的指向，函数调用结束即销毁了
    private void changeStr(String s) {
        s = s.toLowerCase();
    }

    @Test
    // 左闭右开原则
    public void subStringTest() {
        String str = "[2]";
        String newStr = str.substring(1, str.length()-1);
        System.out.println(newStr);
    }

    @Test
    // 分割测试
    public void splitTest() {
        String str = "boo:and:foo";
        String[] split1 = {"boo", "and", "foo"};
        Assert.assertArrayEquals(split1, str.split(":"));
        String[] split2 = {"boo", "and:foo"};
        Assert.assertArrayEquals(split2, str.split(":", 2));
        // 以分割符结尾的子字符串，两个o之间为空字符串，所以分出了空串，字符串结尾也算
        String[] split3 = {"b", "", ":and:f", "", ""};
        Assert.assertArrayEquals(split3, str.split("o", 5));
    }

}
