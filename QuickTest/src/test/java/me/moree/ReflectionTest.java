package me.moree;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by MORE-E on 8/3/2017.
 */
public class ReflectionTest {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void invokeReflectionClass() {
        try {
            Constructor constructor = ReflectionClass.class.getConstructor(int.class);
            ReflectionClass myClassReflect = (ReflectionClass) constructor.newInstance(10);

            Method method = ReflectionClass.class.getMethod("increase", int.class);
            method.invoke(myClassReflect, 5);

            // 10 + 5 = 15
            Field field = ReflectionClass.class.getDeclaredField("count");
            field.setAccessible(true); // access private field
            Assert.assertEquals(15, field.getInt(myClassReflect));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
