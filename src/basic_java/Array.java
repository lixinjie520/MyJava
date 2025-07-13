package basic_java;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] fruits = {"pineapple","apple","banana","coconut","orange"};
//        System.out.println(fruits[0]);
//      sort
//        Arrays.sort(fruits);
//      fill
        Arrays.fill(fruits,"hello");
        for(String fruit :fruits){
            System.out.println(fruit);
        }
    }
}
