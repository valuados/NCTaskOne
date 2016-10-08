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
        StoneFactory stoneFactory = new StoneFactory();
        Necklace necklace = new Necklace();

        try {

            Scanner sc = new Scanner(file);


            while (sc.hasNext()) {
                Stone stone = stoneFactory.getStone(sc.next(),sc);
                necklace.setNecklace(stone);

            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(necklace.toString());
    }
}
