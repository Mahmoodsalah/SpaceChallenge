/*
Rocket Specifications:
Rocket cost = $120 Million
Rocket weight = 18 Tonnes   --> we will work with 18 not 20! (see up!)
Max weight (with cargo) = 29 Tonnes
Chance of launch explosion = 4% * (cargo carried / cargo limit)
Chance of landing crash = 8% * (cargo carried / cargo limit)
 */

import java.util.Random;

public class U2 extends Rocket{
    public U2(){
        RocketCost =120000000;
        RocketWeight = 18;
        Maxweight = 29;
        currentTotalWeight = RocketWeight;
        currentCargoWeight = 0;
        cargoLimit = Maxweight - RocketWeight;
        rateExplosion = 0.04 ;
        rateCrash = 0.08 ;
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
    }
}
