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
        result.append("Diamond: diamond type-")
                .append(diamondType)
                .append(super.toString());
        return result.toString();
    }
}
