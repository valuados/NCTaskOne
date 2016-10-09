package by.nikonov.netcrackertaskone.factory;

import by.nikonov.netcrackertaskone.stone.Stone;
import by.nikonov.netcrackertaskone.stoneierarhy.*;

import java.util.Scanner;

/**
 * Created by valua on 10/8/2016.
 */
public class StoneFactory {

    public Stone getStone(String stoneType, Scanner scanner){
        if(stoneType == null){
            return null;
        }
        if(stoneType.equalsIgnoreCase("DIAMOND")){
            Diamond diamond = new Diamond();

            diamond.setDiamondType(scanner.next());
            diamond.setColour(scanner.next());
            diamond.setSyngony(scanner.next());
            diamond.setSolidity(scanner.nextDouble());
            diamond.setDensity(scanner.nextDouble());
            diamond.setCarat(scanner.nextDouble());
            diamond.setPrice(scanner.nextDouble());
            return diamond;

        } else if(stoneType.equalsIgnoreCase("BIRYUZA")){
            Biryuza biryuza = new Biryuza();

            biryuza.setColour(scanner.next());
            biryuza.setColorFeatures(scanner.next());
            biryuza.setSolidity(scanner.nextDouble());
            biryuza.setDensity(scanner.nextDouble());
            biryuza.setPleohorizm(scanner.next());
            biryuza.setCarat(scanner.nextDouble());
            biryuza.setPrice(scanner.nextDouble());
            return biryuza;


        }else if(stoneType.equalsIgnoreCase("CORUND")){
            Corund corund = new Corund();
            corund.setCorundType(scanner.next());
            corund.setColour(scanner.next());
            corund.setSyngony(scanner.next());
            corund.setSolidity(scanner.nextDouble());
            corund.setDensity(scanner.nextDouble());
            corund.setCarat(scanner.nextDouble());
            corund.setPrice(scanner.nextDouble());
            return corund;


        }else if(stoneType.equalsIgnoreCase("GRANAT")){
            Granat granat = new Granat();
            granat.setGranatType(scanner.next());
            granat.setGranatUnderType(scanner.next());
            granat.setColour(scanner.next());
            granat.setSyngony(scanner.next());
            granat.setSolidity(scanner.nextDouble());
            granat.setDensity(scanner.nextDouble());
            granat.setCarat(scanner.nextDouble());
            granat.setPrice(scanner.nextDouble());
            return granat;


        }else if(stoneType.equalsIgnoreCase("HALCZEDON")){
            Halczedon halczedon = new Halczedon();
            halczedon.setHalczedonType(scanner.next());
            halczedon.setColour(scanner.next());
            halczedon.setColorFeatures(scanner.next());
            halczedon.setSolidity(scanner.nextDouble());
            halczedon.setDensity(scanner.nextDouble());
            halczedon.setCarat(scanner.nextDouble());
            halczedon.setPrice(scanner.nextDouble());
            return halczedon;
            //Halczedon Onix dark glass 6 2.65 100 50


        }else if(stoneType.equalsIgnoreCase("KVARTZ")){
            Kvartz kvartz = new Kvartz();
            kvartz.setKvartzType(scanner.next());
            kvartz.setColour(scanner.next());
            kvartz.setSyngony(scanner.next());
            kvartz.setSolidity(scanner.nextDouble());
            kvartz.setDensity(scanner.nextDouble());
            kvartz.setCarat(scanner.nextDouble());
            kvartz.setPrice(scanner.nextDouble());
            return kvartz;

        }

        return null;
    }
}
