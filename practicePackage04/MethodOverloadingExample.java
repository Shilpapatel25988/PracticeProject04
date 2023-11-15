package practicePackage04;

public class MethodOverloadingExample {


    static int calNumber(int a, int b){

        return a/b;
    }

    static double calNumber(double s){

        return s*s;
    }

    public static void main(String[] args) {

        System.out.println(calNumber(50.10));
        System.out.println(calNumber(500,10));
    }

    






}
