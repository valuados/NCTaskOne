package by.nikonov.netcrackertaskone.run;

import by.nikonov.netcrackertaskone.factory.StoneFactory;
import by.nikonov.netcrackertaskone.necklace.Necklace;
import by.nikonov.netcrackertaskone.stone.Stone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by valua on 10/7/2016.
 */
public class Main {
    public static void main(String[] args) {

        File file = new File("src/by/nikonov/netcrackertaskone/files/text.txt");
        Necklace necklace = new Necklace();

        try {

            Scanner sc = new Scanner(file);


            while (sc.hasNext()) {
                Stone stone = StoneFactory.getStone(sc.next(),sc);
                necklace.setNecklace(stone);

            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(necklace.toString());
        System.out.println("Current necklace price in $:"+ necklace.countPrise());
        System.out.println("Current necklace weight in carats:"+ necklace.countWeight());
        System.out.println("\n Sorted by weight:");
        necklace.sortByCarat();
        System.out.println(necklace.toString());
        System.out.println("\n Sorted by general cost:");
        necklace.sortByCost();
        System.out.println(necklace.toString());
        System.out.println(necklace.showInThePriceRange(600, 100000));
    }
}
