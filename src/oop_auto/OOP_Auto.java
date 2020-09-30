package oop_auto;

public class OOP_Auto {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sammlung von Auto-Objekten, gesammelt in einer ArrayList
        Auto[] autoSammlung = bauMalEinPaarAutos();
        
        for(int i=0; i<autoSammlung.length; i++) {
            System.out.println(autoSammlung[i].printMe());
        }
        System.out.println("------------------------------------------------");
        
        
        autoSammlung[0].drive(10.0);
        autoSammlung[1].tanken(150.00);
        if(autoSammlung[1].tanken(150.00)) {
            System.out.println("Tanken hat geklappt.\n");
        } else {
            System.out.println("Tanken hat nicht geklappt.\n");
        }
        
        for(int i=0; i<autoSammlung.length; i++) {
            System.out.println(autoSammlung[i].printMe());
        }
    }
    
    
    private static Auto[] bauMalEinPaarAutos() {
        Auto[] array = {
            new Auto(
                    "Renault Twingo",   // Bezeichnung
                    "violet",          // Farbe
                    6.0,                // durchschnittlicher Verbrauch (l/100km)
                    195625.0,           // kmStand
                    38.5                // Tankvolumen
            ),
            new Auto(
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
