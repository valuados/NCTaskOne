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
        result.append("Granat: Granat type-")
                .append(granatType)
        .append(", Granat undertype- ")
                .append(granatUnderType)
                .append(super.toString());
        return result.toString();
    }
}
