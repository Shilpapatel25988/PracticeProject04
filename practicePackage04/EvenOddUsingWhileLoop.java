package practicePackage04;

public class EvenOddUsingWhileLoop {

    public static void main(String[] args) {

        int num = 0;
        while (num<=20){

            if(num % 2 == 0){
                System.out.println("Even number:"+num);
            }else{
                System.out.println("Odd number:"+num);
            }
            num++;

        }
    }
}
