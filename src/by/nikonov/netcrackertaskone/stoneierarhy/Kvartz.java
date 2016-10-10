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
        result.append("Kvartz: kvartz type-")
                .append(kvartzType)
                .append(super.toString());
        return result.toString();
    }
}
