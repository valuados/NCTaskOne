package by.nikonov.netcrackertaskone.stoneierarhy;

/**
 * Created by valua on 10/7/2016.
 */
public class Granat extends PreciousStone{
    private String granatType;
    private String granatUnderType;

    public String getGranatType() {
        return granatType;
    }

    public void setGranatType(String granatType) {
        this.granatType = granatType;
    }

    public String getGranatUnderType() {
        return granatUnderType;
    }

    public void setGranatUnderType(String granatUnderType) {
        this.granatUnderType = granatUnderType;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        /*carat;
    private String colour;
    private double solidity;//tverdost'
    private double density;//plotnost'
    private double price;*/
        result.append("Granat: Granat type-"+getGranatType()+", Granat undertype- "+getGranatUnderType());
        result.append(", colour- "+getColour()+", syngony- "+getSyngony());
        result.append(", solidity- "+getSolidity()+", density- "+getDensity());
        result.append(", weight- "+getCarat()+" carat, average price per carat- ");
        result.append(getPrice()+"$.");
        return result.toString();
    }
}
