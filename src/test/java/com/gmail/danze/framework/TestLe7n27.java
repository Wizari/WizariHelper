package com.gmail.danze.framework;

import com.gmail.danze.trash.application.DanzeHelper;

import java.util.ArrayList;
import java.util.List;

/**Дана строка символов. Группы символов, разделенные
 *  одним или несколькими пробелами и не содержащие
 *  пробелов внутри себя, будем называть словами. В
 *  самом длинном слове заменить все буквы «a» на «b».
 *  */
public class TestLe7n27 {
    public static void main(String[] args) {
        String [] f = DanzeHelper.inputStringSequenceFromUser("aa");
        List<String> in = new ArrayList<String>();
//        in.add(f);
        int maxLengthString = 0;
        for(int i=0;i<f.length;i++){
            if(f[i].length()>maxLengthString){
                maxLengthString = f[i].length();
            }
        }
        for(int i=0;i<f.length;i++){
            if(f[i].length()==maxLengthString){
//                Str.replace('s', 'b')
//                System.out.println(Arrays.toString(new String[]{f[i]}));
                in.add(f[i].replace("a", "d"));
            }
        }

        System.out.println(in);
//        System.out.println(Arrays.toString(f));
//        System.out.println(Arrays.toString(in));

    }

}
