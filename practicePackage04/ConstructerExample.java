package practicePackage04;

public class ConstructerExample {

    String fname;
    int age;

    ConstructerExample(String fname, int age){

        this.fname=fname;
        this.age=age;

    }

    public static void main(String[] args) {

        ConstructerExample cs = new ConstructerExample("Shilpa", 25);

        System.out.println(cs.fname+ "  "+cs.age);
    }

}
