import java.util.Scanner;

public class MetalsApp {
    static Scanner userinput = new Scanner(System.in);

    //This is the temp conversion method from the course site.
	static double convertFromCelcius(String to, double temp) {
		double answer = temp;
		if (to.charAt(0) == 'f') {
			answer = (9.0 / 5) * answer + 32;
		}
		if (to.charAt(0) == 'r') {
			answer = (9.0 / 5) * answer + 492;
		}
		if (to.charAt(0) == 'k') {
			answer = answer + 273;
		}
		return answer;
    }

    //Main method.
    public static void main(String[] args) {

        //Define an integer to hold the number of metals the user wants to enter info about.
        int metalQuantity = 0;

        //Formatting.
        System.out.println("\n");

        //Ask the user how many metals they want to enter info about.
        System.out.print("How many metals do you want to enter data for --> ");
        metalQuantity = userinput.nextInt();
        userinput.nextLine();

        //Create arrays to hold the information about each metal.
        //Set the length equal to the number of numvers.
        String [] name = new String[metalQuantity];
        double [] density = new double[metalQuantity];
        double [] melt = new double[metalQuantity];
        double [] boil = new double[metalQuantity];
        int [] hardness = new int[metalQuantity];

        //This loop will iterate through the metals, and ask the user to enter the data about each one.
        for(int i = 0 ; i < metalQuantity; i++){

            //Formatting.
            System.out.println("\n");

            //Have the user enter the name of the metal.
            System.out.print("Name of metal number " + i + " --> ");
            name[i] = userinput.nextLine();

            //Formatting.
            System.out.println("\n");

            //Prompt for the density of the metal.
            System.out.print("Density of metal " + i + " g/cm^3 --> ");
            density[i] = userinput.nextDouble();
            userinput.nextLine();

            //Formatting.
            System.out.println("\n");

            //Prompt for the melting point.
            System.out.print("Melting point for metal " + i + " (°C @ Standard Pressure) --> ");
            melt[i] = userinput.nextDouble();
            userinput.nextLine();

            //Formatting.
            System.out.println("\n");

            //Prompt for boiling point.
            System.out.print("Boiling point of metal " + i + " (°C @ Standard Pressure) --> ");
            boil[i] = userinput.nextDouble();
            userinput.nextLine();

            //Formatting.
            System.out.println("\n");

            //Prompt for hardness.
            System.out.print("Hardness of metal " + i + " (int between 1 & 10) --> ");
            hardness[i] = userinput.nextInt();
            userinput.nextLine();

            //Formatting.
            System.out.println("\n");
        }

        //Print the table heading.
        System.out.format("%10s | %10s | %10s | %10s | %10s%n", "Name:", "Density:", "Melting Point (°F):", "Boiling Point (°F):", "Hardness:");

        //Print dividing line.
        System.out.format("-----------|------------|---------------------|---------------------|-----------%n");

        //Iterate through the all the metals
        for(int i = 0; i < metalQuantity; i++){
            //Print the a line of the table for each metal.
            System.out.format("%10s | %10.2f | %19.2f | %19.2f | %10d%n", name[i], density[i], convertFromCelcius("f", melt[i]), convertFromCelcius("f", boil[i]), hardness[i]);
        }

        //Formatting.
        System.out.println("\n");

        //Tell user that program is ending.
        System.out.println("Program is ending...");

        //Formatting.
        System.out.println("\n");

        //Close the scanner.
        userinput.close();
    }
}