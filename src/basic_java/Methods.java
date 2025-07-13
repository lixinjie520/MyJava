package basic_java;

public class Methods {
    public static void main(String[] args) {
        String fullName = getFullName("Amber","Wang");
        System.out.println(fullName);
    }
    static String getFullName(String first,String last){
        return first + " " + last;
    }
}
