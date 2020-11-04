package JavaSampleOOP;

public class Tank {
    
    private Double volume; // in liter
    private Double level; // in liter
    private Integer levelPercent; // in percent

    Tank(Double volume) {
        this.volume = volume;
        this.setLevel(0.0);
    }
<<<<<<< Updated upstream
    
    public Boolean refuel() {
        this.setLevel(this.volume);
=======

    public void drainTank() {
        this.level = .0;
        this.levelPercent = 0;
    }
    
    public Boolean refuel(){
        this.setLevel(this.volumen);
>>>>>>> Stashed changes
        return true;
    }
    
    public Boolean refuel(Double liter) {
        Boolean ok = false;
        if (liter > this.volume - this.level) {
            /*
            fill up completely
            this.setLevel(this.volumen);
            */
        } else {
            this.setLevel(this.level + liter);
            ok = true;
        }
        return ok;
    }
    
    private void setLevel(Double newLevel) {
        this.level = newLevel;
        this.levelPercent = (int) Math.round(
                100 * (this.level / this.volume)
        );
    }
    
    public Integer getPercent() {
        return this.levelPercent;
    }
    
    public Double getLevel() {
        return this.level;
    }
    
    public Double getVolume() {
        return this.volume;
    }
}
