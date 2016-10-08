package by.nikonov.netcrackertaskone.stoneierarhy;

/**
 * Created by valua on 10/7/2016.
 */
public class Corund extends PreciousStone {
    private String corundType;

    public String getCorundType() {
        return corundType;
    }

    public void setCorundType(String corundType) {
        this.corundType = corundType;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        /*carat;
    private String colour;
    private double solidity;//tverdost'
    private double density;//plotnost'
    private double price;*/
        result.append("Corund: corund type-"+getCorundType()+", Colour- "+getColour()+", syngony- "+getSyngony());
        result.append(", solidity- "+getSolidity()+", density- "+getDensity());
        result.append(", weight- "+getCarat()+" carat, average price per carat- ");
        result.append(getPrice()+"$.");
        return result.toString();
    }
}
