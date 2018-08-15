import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Simulation {
    //public ArrayList<Item> allItems;  //new ArrayList<Item>();
    public ArrayList<Rocket> U1fleet;  //new ArrayList<U1>();
    public ArrayList<Rocket> U2fleet;  //new ArrayList<U2>();
    public int i;
    public int j;




    public Simulation(){
        //allItems = new ArrayList<Item>();
        U1fleet = new ArrayList<Rocket>();
        U2fleet = new ArrayList<Rocket>();
        i= 0;
        j=0;

    }

    public ArrayList<Item> loadItems(String filename) throws FileNotFoundException{
        ArrayList<Item> allItems =  new ArrayList<Item>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            Item item = new Item();
            String line = scanner.nextLine();
            String[] parts = line.split("=");
            item.name = parts[0];
            item.weight = Integer.parseInt(parts[1]);
            item.weight = item.weight /1000;
            allItems.add(item);
        }
        //System.out.println(allItems.size());
        return allItems;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> all){
        while (i < (all.size() - 1)){
            U1 u1= new U1();
            while(u1.canCarry(all.get(i))){
                u1.carry(all.get(i));
                i++;
                if(i > (all.size()-1)){
                    U1fleet.add(u1);
                    return U1fleet;
                }
            }
            U1fleet.add(u1);
        }
        return U1fleet;
    }


    public ArrayList<Rocket> loadU2(ArrayList<Item> all){
        while (j < (all.size() - 1)){
            U2 u2= new U2();
            while(u2.canCarry(all.get(j))){
                u2.carry(all.get(j));
                j++;
                if(j > (all.size()-1)) {
                    U2fleet.add(u2);
                    return U2fleet;
                }
            }
            U2fleet.add(u2);
        }
        return U2fleet;
    }

    public int runSimulation(ArrayList<Rocket> rockets){
        int totalBudget = 0;
        int rocketNumber =0;
        for(Rocket rocket : rockets){
            totalBudget += rocket.RocketCost;
            rocketNumber++;
            while(!rocket.launch() || !rocket.land()){
                System.out.println("<<Explode through Launch/Land>> Resend Rocket "+ rocketNumber + " again.");
                totalBudget += rocket.RocketCost;
            }
        }
        return totalBudget;
    }



}
