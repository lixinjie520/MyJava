package basic_java;

public class Varargs {
    public static void main(String[] args) {
//        Varargs：可變參數，可接受任意數量的參數，將其當成陣列處理。
        System.out.println(add(1,2,3,4,5));
    }
    static int add(int...numbers){
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }
}
