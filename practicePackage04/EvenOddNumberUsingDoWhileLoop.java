package practicePackage04;

public class EvenOddNumberUsingDoWhileLoop {

    public static void main(String[] args) {

        int num = 1;


        do {
            if (num % 2 == 0) {
                System.out.println("Even number:" +num);
            } else {
                System.out.println("Odd number:" +num);
            }
            num++;
        } while (num <= 20);
    }


}
