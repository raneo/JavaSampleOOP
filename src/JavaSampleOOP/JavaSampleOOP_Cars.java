package JavaSampleOOP;

public class JavaSampleOOP_Cars {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sammlung von Auto-Objekten, gesammelt in einer ArrayList
        Car[] carCollection = buildAFewCars();
        
        for(int i=0; i<carCollection.length; i++) {
            System.out.println(carCollection[i].printMe());
        }
        System.out.println("------------------------------------------------");
        
        
        
        if(carCollection[1].refuel(20.0)) {
            System.out.println("tanking up was successful\n");
        } else {
            System.out.println("tanking up failed (volume exceeded)\n");
        }
        carCollection[1].drive(100.0);
        
        for(int i=0; i<carCollection.length; i++) {
            System.out.println(carCollection[i].printMe());
        }
    }
    
    
    private static Car[] buildAFewCars() {
        Car[] array = {
            new Car(
                    "Renault Twingo",   // Bezeichnung
                    "violet",          // Farbe
                    6.0,                // durchschnittlicher Verbrauch (l/100km)
                    195625.0,           // kmStand
                    38.5                // Tankvolumen
            ),
            new Car(
                    "Audi A6",
                    "darkblue",
                    8.0,
                    120000.5,
                    65.0
            )
        };
        return array;
    }
    
}
