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
        result.append("Corund: corund type-")
                .append(corundType)
                .append(super.toString());
        return result.toString();
    }
}
