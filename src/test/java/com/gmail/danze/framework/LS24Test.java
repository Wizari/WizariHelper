package com.gmail.danze.framework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LS24Test {

//    @Test
//    public void findMinElementTest() {
//        int [] array = new int[]{5, 1, 3};
//        int actual = DanzeHelper.findMinimumFromArray(array);
//        assertEquals(1, actual);

    public static void main(String[] args) {
        int array = DanzeHelper.findMinimumFromArray(DanzeHelper.inputIntSequenceFromUser());
        System.out.println(array);
        
    }
}
