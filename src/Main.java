/*
Nigeria has 6 geopolitical zones: South - South, North - East, North - Central, South -East, South - West and North - West.
Write an application that collects a state from a user and tells him which geopolitical zone he belongs.

North Central: Benue, FCT, Kogi, Kwara, Nasarrawa, Niger and Plateau.

North East: Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe.

North West: Kaduna, Katsina, Kano, Kebbi, Sokoto, Jigawa, Zamfara.

SouthEast: Abia, Anambra, Ebonyi, Enugu, Imo.

SouthSouth: Akwa - Ibom, Bayelsa, Cross - River, Delta, Edo, Rivers.

South West: Ekiti, Lagos, Osun, Ondo, Ogun, Oyo

 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner states = new Scanner(System.in);

        System.out.println("Hello there! I can help you identify the geo-political zone of any Nigerian state");
        System.out.print("Please, type the state name and press Enter: ");

        String userInput = states.nextLine();

        GeoPoliticalApplication geoPoliticalApplication = new GeoPoliticalApplication();

        String geoPoliticalZone = geoPoliticalApplication.getGeoPoliticalZone(userInput);

        System.out.println("The Geopolitical Zone of " + userInput + " is " + geoPoliticalApplication);
    }
}