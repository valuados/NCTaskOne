package by.nikonov.netcrackertaskone.stoneierarhy;

/**
 * Created by valua on 10/7/2016.
 */
public class Kvartz extends PreciousStone {
    private String kvartzType;

    public String getKvartzType() {
        return kvartzType;
    }

    public void setKvartzType(String kvartzType) {
        this.kvartzType = kvartzType;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        /*carat;
    private String colour;
    private double solidity;//tverdost'
    private double density;//plotnost'
    private double price;*/
        result.append("Kvartz: kvartz type-"+getKvartzType());
        result.append(", colour- "+getColour()+", syngony- "+getSyngony());
        result.append(", solidity- "+getSolidity()+", density- "+getDensity());
        result.append(", weight- "+getCarat()+" carat, average price per carat- ");
        result.append(getPrice()+"$.");
        return result.toString();
    }
}
