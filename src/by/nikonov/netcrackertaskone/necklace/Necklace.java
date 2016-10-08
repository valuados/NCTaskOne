package by.nikonov.netcrackertaskone.necklace;

import by.nikonov.netcrackertaskone.comparators.CaratComparator;
import by.nikonov.netcrackertaskone.comparators.CostComparator;
import by.nikonov.netcrackertaskone.stone.Stone;

import java.util.*;

/**
 * Created by valua on 10/8/2016.
 */
public class Necklace {
    List<Stone> necklace;

    public Necklace() {
        this.necklace = new ArrayList<>();
    }

    public Stone getNecklace(int i) {
        if(i< necklace.size())
        return necklace.get(i);
        else
            return null;
    }

    public List<Stone> getNecklace() {
        return necklace;
    }

    public void setNecklace(List<Stone> necklace) {
        this.necklace = necklace;
    }

    public void setNecklace(Stone stone) {
        this.necklace.add(stone);
    }

    public void SortByCarat(){
        Collections.sort(necklace, new CaratComparator());
    }

    public void SortByCost(){
        Collections.sort(necklace, new CostComparator());
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Stone s: necklace){
            result.append(s.toString());
            result.append('\n');
        }
        return  result.toString();

    }

}
