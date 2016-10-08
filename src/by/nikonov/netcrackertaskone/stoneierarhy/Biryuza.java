package by.nikonov.netcrackertaskone.stoneierarhy;

/**
 * Created by valua on 10/8/2016.
 */
public class Biryuza extends SemipreciousStone {
    private String pleohorizm;//low mostly

    public String getPleohorizm() {
        return pleohorizm;
    }

    public void setPleohorizm(String pleohorizm) {
        this.pleohorizm = pleohorizm;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        /*carat;
    private String colour;
    private double solidity;//tverdost'
    private double density;//plotnost'
    private double price;*/
        result.append("Biryuza: colour- "+getColour()+", colour features- "+getColorFeatures());
        result.append(", solidity- "+getSolidity()+", density- "+getDensity());
        result.append(", pleohorizm- "+getPleohorizm()+", weight- "+getCarat()+" carat, average price per carat- ");
        result.append(getPrice()+"$.");
        return result.toString();
    }
}
