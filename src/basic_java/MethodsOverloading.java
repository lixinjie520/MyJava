package basic_java;

public class MethodsOverloading {
    public static void main(String[] args) {
        // 方法多載 ：當我們有多個具有相同名稱但參數類型不同的method時（換句話說，不同的簽名），我們就是在使用method overloading。

        int result1 = plusMethod(1,2);
        System.out.println(result1);

        double result2 = plusMethod(1.1,2.2);
        System.out.println(result2);

        int result3 = plusMethod(1,2,3);
        System.out.println(result3);

    }

    static int plusMethod(int a ,int b){
        return a + b;
    }

    static double plusMethod(double a , double b){
        return a + b;
    }

    static int plusMethod(int a, int b, int c){
        return a + b + c;
    }
}
