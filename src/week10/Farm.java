package week10;

import java.util.ArrayList;
import java.util.Collection;

public class Farm {
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return owner;

    }

    public  void addCow(Cow cow){
        this.cows.add(cow);
    }

    public void liveHour(){
        for (Cow cow: this.cows){
            cow.liveHour();
        }
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.barn.installMilkingRobot(milkingRobot);
    }

    public void manageCows(){
        this.barn.takeCareOf(this.cows);
    }

    @Override
    public String toString() {
        String cows = "";
        if(this.cows.isEmpty()){
            cows += "No cows.";
        } else {
            cows += "Animals: \n";
            for (Cow cow: this.cows){
                cows += "\t" + cow.toString() + "\n";
            }
        }
        return "Farm owner: " + this.owner + "\n"
                + "Barn bulk tank: " + this.barn.toString() + "\n"
                + cows;
    }
}