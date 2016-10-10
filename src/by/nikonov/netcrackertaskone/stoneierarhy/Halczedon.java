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
        result.append("Halczedon: halczedon type-")
                .append(halczedonType)
                .append(super.toString());
        return result.toString();
    }
}
