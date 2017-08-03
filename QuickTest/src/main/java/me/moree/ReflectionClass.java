package me.moree;

/**
 * Created by MORE-E on 5/1/2017.
 */
public class ReflectionClass {
    private int count;

    public ReflectionClass(int start) {
        count = start;
    }
    public void increase(int step) {
        count = count + step;
    }
}
