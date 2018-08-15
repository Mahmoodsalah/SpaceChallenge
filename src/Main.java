import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;  //temp

public class Main {
    public static void main(String args []) throws FileNotFoundException {
        Simulation S = new Simulation();
        ArrayList<Item> phase1Items= S.loadItems("phase-1.txt");
        ArrayList<Item> phase2Items= S.loadItems("phase-2.txt");


        //Load U1rockets group
        ArrayList<Rocket> U1list = S.loadU1(phase1Items);
        U1list.addAll(S.loadU1(phase2Items));

        //run simulation for U1 prototype
        int totalu1 = S.runSimulation(U1list);
        System.out.println("Total budget for mission through prototype U1 is: " + totalu1/1000000 + " Million $");


        //Load U2rockets group
        ArrayList<Rocket> U2list = S.loadU2(phase1Items);
        U2list.addAll(S.loadU2(phase2Items));

        //run simulation for U2 prototype
        int totalu2 = S.runSimulation(U2list);
        System.out.println("Total budget for mission through prototype U2 is: " + totalu2/1000000 + " Million $");
    }
}
