import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;  //temp

public class Main {
    //to check bugs only will be moved to sperate main class
    public static void main(String args []) throws FileNotFoundException {
        System.out.println(new Random().nextDouble());
        System.out.println( Math.random());
        U1 u1= new U1();
        U2 u2= new U2();
        Simulation simulation = new Simulation();
        ArrayList<Item> all =new ArrayList<Item>();

        all = simulation.loadItems("phase-1.txt");
        System.out.println(all.get(10).weight);


        System.out.println(u1.launch());
        System.out.println(u2.launch());


    }
}
