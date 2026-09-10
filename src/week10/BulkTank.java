package week10;

public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this(2000.0);
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }

    public void addToTank(double amount){
        if(amount > this.howMuchFreeSpace()){
            this.volume = this.capacity;
        } else {
            this.volume += amount;
        }
    }

    public double getFromTank(double amount){
        if(amount > this.volume){
            amount = this.volume;
            this.volume = 0;
            return amount;
        } else {
            this.volume -= amount;
            return amount;
        }
    }

    @Override
    public String toString() {
        return Math.ceil(this.volume) + "/" + this.capacity;
    }
}