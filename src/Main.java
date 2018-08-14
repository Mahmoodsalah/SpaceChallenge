import java.util.Random;  //temp

public class Main {
    //to check bugs only will be moved to sperate main class
    public static void main(String args []){
        System.out.println(new Random().nextDouble());
        System.out.println( Math.random());
        U1 u1= new U1();
        U2 u2= new U2();

        System.out.println(u1.launch());

    }
}
