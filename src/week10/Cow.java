package week10;
import javax.xml.stream.events.Namespace;
import java.util.Random;

public class Cow implements Milkable, Alive{

    private String name;
    private double capacity = 15 + new Random().nextInt(26);
    private double amount;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(String name) {
        this.name = name;
    }

    public Cow() {
        this(NAMES[new Random().nextInt(NAMES.length)]);
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return this.name + " "+ Math.ceil(this.amount)+ "/" + this.capacity;
    }

    @Override
    public void liveHour() {
        double randomMilk = 0.7 + 1.3 * new Random().nextDouble();
        if(this.amount + randomMilk>this.capacity ){
            this.amount  =this.capacity;
        }
    this.amount += randomMilk;
    }

    @Override
    public double milk() {
        double cowsMilk = this.amount;
        this.amount = 0;
        return cowsMilk;
    }
}
