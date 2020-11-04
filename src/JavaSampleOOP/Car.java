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
    
    /**
     * constructor
     * @param name
     * @param color
     * @param consumption
     * @param mileage
     * @param tankVolume 
     */
    Car(String name, String color, Double consumption, Double mileage, Double tankVolume) {
        this.name = name;
        this.color = color;
        this.consumption = consumption;
        this.mileage = mileage;
        this.isEngineOn = false;
        this.tank = new Tank(tankVolume);
    }
    
    /**
     * attempt to drive a given distance
     * @param km, distance which should be driven
     * @return true on success, false otherwise
     */
    public Boolean drive(Double km) {
        // LOGIC SECTION START
        Boolean result = false;
        
        if (km > 0) {
            this.mileage = this.mileage + km;
            result = true;
        }
        // LOGIC SECTION END
        
        // LOGGING SECTION START
        String message = "[" + this.name + "] ";
        if (result) {
            message += "drove " + km + " km.";
        } else {
            message += "could NOT drive " + km + " km. Out of gas maybe?";
        }
        System.out.println(message + "\n");
        // LOGGING SECTION END
        
        return result;
    }
    
    /**
     * refuel car completely
     * @return true on success, false otherwise
     */
    public Boolean refuel() {
        // LOGIC SECTION START
        Boolean result = this.tank.refuel();
        // LOGIC SECTION END
        
        // LOGGING SECTION START
        String message = "[" + this.name + "] ";
        if (result) {
            message += "tanking up was successful.";
        } else {
            message += "tanking up failed.";
        }
        System.out.println(message + "\n");
        // LOGGING SECTION END
        
        return result;
    }
    
    /**
     * refuel car by a certain amount of gas
     * @param liter
     * @return  true on success, false otherwise
     */
    public Boolean refuel(Double liter) {
        // LOGIC SECTION START
        Boolean result = this.tank.refuel(liter);
        // LOGIC SECTION END
        
        // LOGGING SECTION START
        String message = "[" + this.name + "] ";
        if (result) {
            message += "tanking up with " + liter + " liter(s) was successful.";
        } else {
            message += "tanking up with " + liter + " liter(s) failed.";
        }
        System.out.println(message + "\n");
        // LOGGING SECTION END
        
        return result;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public double getConsumption() {
        return this.consumption;
    }
    
    public double getMileage() {
        return this.mileage;
    }
    
    public boolean getIsEngineOn() {
        return this.isEngineOn;
    }
<<<<<<< Updated upstream
    
    public String getTankContents() {
        return (
                this.tank.getPercent() + "% (" +
                this.tank.getLevel() + "/" +
                this.tank.getVolume() + ")"
                );
    }    
=======
    public void crashCar()
    {
        this.color = "abgeranzt";
        this.isEngineOn = false;
        this.tank.drainTank();
    }
>>>>>>> Stashed changes
}
