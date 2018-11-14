package com.gmail.danze.framework.Game;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
//        int shape[][];
        int[][] shape = new int[][]{{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};
        int[][] rotate = new int[shape.length][shape.length];
        int m = shape.length;
        int k = -1;
        for (int i = 0; i < shape.length; i++) {
            m--;
            k++;
            for (int aaa = 0; aaa < shape.length; aaa++) {
//                int c = 0;
//                c++;
                rotate[aaa][m] = shape[k][aaa];
            }
//            m--;
//            k++;
 }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(rotate[i][j] + "\t");
//            }
//            System.out.println();
////        System.out.println(rotate);
        System.out.println(rotate[0][0]+" "+rotate[0][1]+" "+rotate[0][2]+"\n"+rotate[1][0]+" "+rotate[1][1]+" "+rotate[1][2]+"\n"+rotate[2][0]+" "+rotate[2][1]+" "+rotate[2][2]);
//        System.out.println(Arrays.toString(new int[]{rotate[2][2]}));
    }

}

