package Interfaces;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args){
        // JEEP CLASS
        Jeep j1 = new Jeep("Wrangler", 2, 180, 4);
        Jeep j2 = new Jeep("Cherokee", 4, 190, 4);
        ArrayList<Jeep> jeeps = new ArrayList<>();
        jeeps.add(j1);
        jeeps.add(j2);

        System.out.println(jeeps.get(0).toString());
        jeeps.get(1).drive();
        jeeps.get(1).soundHorn();
        System.out.println();

        // FRIGATE CLASS
        Frigate f1 = new Frigate("Amethyst", 100, 423.1, 1132);
        Frigate f2 = new Frigate("Bideford", 68, 419, 83.4);
        ArrayList<Frigate> frigates = new ArrayList<>();
        frigates.add(f1);
        frigates.add(f2);

        System.out.println(frigates.get(0).toString());
        frigates.get(1).launch();
        frigates.get(1).fireGun();
        System.out.println();

        // HOVERCRAFT CLASS
        Hovercraft h1 = new Hovercraft("Aimee", 2, 50, 234, 4);
        Hovercraft h2 = new Hovercraft("Rowin", 2, 32, 85, 4);
        ArrayList<Hovercraft> hovercrafts = new ArrayList<>();
        hovercrafts.add(h1);
        hovercrafts.add(h2);
        System.out.println(hovercrafts.get(0).toString());
        hovercrafts.get(1).drive();
        hovercrafts.get(1).launch();
        hovercrafts.get(1).enterLand();
        hovercrafts.get(1).enterSea();
        hovercrafts.get(1).launch();
        System.out.println();

        // POLICE CAR CLASS
        PoliceCar c1 = new PoliceCar("Doja Cat", 4, 200, 4);
        PoliceCar c2 = new PoliceCar("Megan Thee Stallion", 6, 230, 4);
        ArrayList<PoliceCar> policeCars = new ArrayList<>();
        policeCars.add(c1);
        policeCars.add(c2);
        System.out.println(policeCars.get(0).toString());
        policeCars.get(0).drive();
        policeCars.get(1).soundSiren();
        policeCars.get(1).turnOnLights();
        policeCars.get(1).useLicensePlateReader();

    }
}
