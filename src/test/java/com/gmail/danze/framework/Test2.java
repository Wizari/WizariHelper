package com.gmail.danze.framework;

public class Test2 {
    public static void main(String[] args) {
    int [][] t = new int[][]{{1, 22, 33}, {11, 22, 33}};
    int [][] b = new int[][]{{1, 2, 3},{1, 2, 3}};
    t [0][0] += b [0][0];
    System.out.println(t[0][0]);
}
}
