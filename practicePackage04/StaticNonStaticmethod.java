package practicePackage04;

public class StaticNonStaticmethod {

    double nonStaticMethod(double a, double b){

        return a+b;
    }

    static int staticMethod(int x, int y){

        return x+y;
    }

    public static void main(String[] args) {

        StaticNonStaticmethod st = new StaticNonStaticmethod();

        System.out.println(st.nonStaticMethod(20.1,50.4));
        System.out.println(staticMethod(50,40));




    }


}
