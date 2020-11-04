package JavaSampleOOP;

import java.lang.*;
import java.math.*;

public class JavaSampleOOP_Cars {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // collection of Car-instances
        Car[] carCollection = buildSeveralCars();
        
        printGarage(carCollection);
        
        carCollection[0].drive(10.0);
        carCollection[0].refuel(22.45);
        carCollection[1].refuel(50.00);
        carCollection[1].drive(130.5);

        printGarage(carCollection);
    }    
    
    /**
     * create multiple instances of Car, put them into an array, return that array
     * @return 
     */
    private static Car[] buildSeveralCars() {
        Car[] array = {
            new Car(
                    "Renault Twingo",   // name
                    "violet",           // color
                    6.0,                // average consumption (l/100km)
                    195625.0,           // mileage (in km)
                    38.5                // tank volume
            ),
            new Car(
                    "Audi A6",
                    "darkblue",
                    8.0,
                    120000.56,
                    65.0
            )
        };
        return array;
    }
    
    /**
     * print out all relevant attributes of car collection in a tabular fashion to console
     * @param carCollection 
     */
    private static void printGarage(Car[] carCollection) {
        StringBuilder output = new StringBuilder();
        Integer spacer = 12;
        output.append(" name                               │ engineOn   │ mileage    │ tankContents           │ avCons \n");
        output.append("------------------------------------│------------│------------│------------------------│------------\n");
        
        for(int i=0; i<carCollection.length; i++) {
            output.append(fillStringWithSpaces(
                    " " + carCollection[i].getName() + " (" + carCollection[i].getColor() + ")",
                    ((spacer*3))
            ));
            output.append("│ ");
            output.append(fillStringWithSpaces(
                    Boolean.toString(carCollection[i].getIsEngineOn()),
                    (spacer-1)
            ));
            output.append("│ ");
            output.append(fillStringWithSpaces(
                    Double.toString(carCollection[i].getMileage()),
                    (spacer-1)
            ));
            output.append("│ ");
            output.append(fillStringWithSpaces(
                    carCollection[i].getTankContents(),
                    ((spacer*2)-1)
            ));
            output.append("│ ");
            output.append(fillStringWithSpaces(
                    Double.toString(carCollection[i].getConsumption()),
                    (spacer-1)
            ));
            output.append("\n");
        }
        System.out.println(output);
    }
    
    /**
     * helper method to fill strings with tailing spaces
     * @param input e.g. "example"
     * @param outputLength e.g. 12
     * @return e.g. "example     "
     */
    private static String fillStringWithSpaces(String input, Integer outputLength) {
        String result = input;
        for(int i=input.length(); i<outputLength; i++){
            result += " ";
        }
        return result;
    }
}
