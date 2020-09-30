package JavaSampleOOP;

public class Car {
    
    // static attributes
    private String name;
    private String color;
    private double consumption;
    // dynamic attributes
    private double mileage;
    private boolean isEngineOn;
    private Tank tank;

    Car(String name, String color, Double consumption, Double mileage, Double tankVolume) {
        this.name = name;
        this.color = color;
        this.consumption = consumption;
        this.mileage = mileage;
        this.isEngineOn = false;
        this.tank = new Tank(tankVolume);
    }
        
    public Boolean drive(Double km) {
        if (km > 0) {
            this.mileage = this.mileage + km;
            return true;
        } else {
            return false;
        }
    }
        
    public Boolean refuel() {
        return this.tank.refuel();
    }
    
    public Boolean refuel(Double liter){
        return this.tank.refuel(liter); 
    }
    
    public void setMileage(Double mileage) {   
        if (mileage > 0){
            this.mileage = mileage;
        }        
    }
    
    public double getMileage(){
        return this.mileage;
    }
    
    public String printMe() {
        String output = "------------------------------------------------";
        output += "\n               car: " + this.name + ", " + this.color;
        output += "\naverageConsumption: " + this.consumption;
        output += "\n       isEngineOn?: " + this.isEngineOn;
        output += "\n           mileage: " + this.mileage;
        output += "\n       tankContent: " + this.tank.getPercent() + "% (" +
                this.tank.getLevel() + "/" + this.tank.getVolume() + ")";
        return output;
    }
}
