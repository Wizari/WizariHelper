package com.gmail.danze.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TestLe7n27v2 {
    public static void main(String[] args) {
        String [] f = DanzeHelper.inputStringSequenceFromUser(".");
//        String[] f = new String[]{"aaa aanaaa", "aaaaa", "aaa aaaavva"};
//        String[] f = new String[]{"anaa", "aaaaa", "aaa aaaavva"};
//        String[] f = new String[]{"aaaaa"};
//        List<String> items = Arrays.asList(f.split("\\s* \\s*"));
//        String[] subStr;
//        subStr = str.split(delimeter);
        List<String> in = new ArrayList<String>();
        List<String> xin = new ArrayList<String>();
//        List<String> deli = new ArrayList<String>();
//        String [] items = f.split(" ");
//        List<String> aitems = Arrays.asList(f.split("\\s*,\\s*"));
//        List<String> container = Arrays.asList(items);
        String delimeter = " ";
//        String [] z;
//        String t;
        for (int i = 0; i < f.length; i++) {
            String t;
            String [] z;
            t = f[i];
            z = t.split(delimeter);
            for (int j = 0; j < z.length; j++) {
                xin.add(z[j]);
            }
//            System.out.println(xin);
//        System.out.println(Arrays.toString(f));
//            in.add(t);

//            deli.add()Arrays.asList(f.split("\\s* \\s*"));
        }
//            String a = f [i];
//            in.add(a.split(delimeter));
//        }
//        in.add(delimeter.split(f));
//        in.add(f);

        String[] y = xin.toArray(new String[xin.size()]);
//        String[] y = xin.toArray(new String[0]);
//        String x[] = Arrays.copyOf(y, y.length);


        int maxLengthString = 0;
        for(int i=0;i<y.length;i++){
            if(y[i].length()>maxLengthString){
                maxLengthString = y[i].length();
            }
        }
        for(int i=0;i<y.length;i++){
            if(y[i].length()==maxLengthString){
//                Str.replace('s', 'b')
//                System.out.println(Arrays.toString(new String[]{f[i]}));
                in.add(y[i].replace("a", "d"));

//                in.add(f[i]);
//                String zz;
//                zz = in.get(0);
                //                in<i> = f[i].replace("a", "d");
            }
//            System.out.println(in);
        }

        System.out.println(in);
//        System.out.println(zz);
//        System.out.println(Arrays.toString(y));
//        System.out.println(Arrays.toString(in));

    }

}

