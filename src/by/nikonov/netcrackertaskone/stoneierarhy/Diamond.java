package by.nikonov.netcrackertaskone.stoneierarhy;

/**
 * Created by valua on 10/7/2016.
 */
public class Diamond extends PreciousStone {
    private String diamondType;

    public String getDiamondType() {
        return diamondType;
    }

    public void setDiamondType(String diamondType) {
        this.diamondType = diamondType;
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        /*carat;
    private String colour;
    private double solidity;//tverdost'
    private double density;//plotnost'
    private double price;*/
        result.append("Diamond: diamond type-"+getDiamondType()+", Colour- "+getColour()+", syngony- "+getSyngony());
        result.append(", solidity- "+getSolidity()+", density- "+getDensity());
        result.append(", weight- "+getCarat()+" carat, average price per carat- ");
        result.append(getPrice()+"$.");
        return result.toString();
    }
}
