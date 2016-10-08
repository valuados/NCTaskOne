package by.nikonov.netcrackertaskone.stoneierarhy;

/**
 * Created by valua on 10/7/2016.
 */
public class Halczedon extends SemipreciousStone {
private String halczedonType;

    public String getHalczedonType() {
        return halczedonType;
    }

    public void setHalczedonType(String halczedonType) {
        this.halczedonType = halczedonType;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        /*carat;
    private String colour;
    private double solidity;//tverdost'
    private double density;//plotnost'
    private double price;*/
        result.append("Halczedon: halczedon type-"+getHalczedonType()+", Colour- ");
        result.append(getColour()+", colour features- "+getColorFeatures());
        result.append(", solidity- "+getSolidity()+", density- "+getDensity());
        result.append(", weight- "+getCarat()+" carat, average price per carat- ");
        result.append(getPrice()+"$.");
        return result.toString();
    }
}
