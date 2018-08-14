import java.util.Random;

public class Rocket implements SpaceShip{
    public int RocketCost ;
    public int RocketWeight;
    public int Maxweight ;
    public int currentTotalWeight;
    public int currentCargoWeight;
    public int cargoLimit;
    public double ClaunchExplosion ;
    public double ClandingCrash ;
    public double rateExplosion;
    public double rateCrash;
    public double randomNumber;


    public Rocket(){
        RocketCost =0;
        RocketWeight = 0;
        Maxweight = 0;
        currentTotalWeight = 0;
        currentCargoWeight = 0;
        cargoLimit = 0;
        ClaunchExplosion = 0.0;
        ClandingCrash = 0.0;

    }
    public boolean launch(){
        return false;
    };
    public boolean land(){
        return false;
    };
    public boolean canCarry(Item item){
        return (this.RocketWeight + item.weight) <= this.Maxweight;
    }
    public void carry(Item item){
        this.currentTotalWeight += item.weight;
        this.currentCargoWeight = this.currentTotalWeight - this.RocketWeight;
    }




}
