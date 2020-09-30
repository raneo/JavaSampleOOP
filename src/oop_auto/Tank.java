package oop_auto;

public class Tank {
    
    private Double volumen; // in liter
    private Double level; // in liter
    private Integer levelPercent; // in percent

    Tank(Double volumen) {
        this.volumen = volumen;
        this.setLevel(0.0);
    }

    public Boolean refuel(){
        this.setLevel(this.volumen);
        return true;
    }
    
    public Boolean refuel(Double liter) {
        Boolean ok = false;
        if (liter > this.volumen - this.level) {
            this.setLevel(this.volumen);
        } else {
            this.setLevel(this.level + liter);
            ok = true;
        }
        return ok;
    }
    
    private void setLevel(Double newLevel) {
        this.level = newLevel;
        this.levelPercent = (int) Math.round(
                100 * (this.level / this.volumen)
        );
    }
    
    public Integer getPercent() {
        return this.levelPercent;
    }
    
    public Double getLevel() {
        return this.level;
    }
    
    public Double getVolume() {
        return this.volumen;
    }
    
}
