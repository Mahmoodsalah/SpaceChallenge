import java.util.Random;

/* U1
Rocket cost = $100 Million
Rocket weight = 10 Tonnes
Max weight (with cargo) = 18 Tonnes
Chance of launch explosion = 5% * (cargo carried / cargo limit)
Chance of landing crash = 1% * (cargo carried / cargo limit)
 */

public class U1 extends Rocket{
    public U1(){
        RocketCost =100000000;
        RocketWeight = 10;
        Maxweight = 18;
        currentTotalWeight = RocketWeight;
        currentCargoWeight = 0;
        cargoLimit = Maxweight - RocketWeight;
        rateExplosion = 0.05 ;//* ((double) currentCargoWeight / (double) cargoLimit);
        rateCrash = 0.01 ;//*((double) currentCargoWeight / (double) cargoLimit);
    }
    @Override
    public boolean launch(){
        double randomNumber = new Random().nextDouble();
        this.ClaunchExplosion = this.rateExplosion * ((double) currentCargoWeight / (double) cargoLimit);
        return randomNumber > this.ClaunchExplosion;
    };
    @Override
    public boolean land(){
        double randomNumber = new Random().nextDouble();
        this.ClandingCrash = this.rateCrash * ((double) currentCargoWeight / (double) cargoLimit);
        return randomNumber > this.ClandingCrash;
    };

}
