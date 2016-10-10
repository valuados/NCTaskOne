package by.nikonov.netcrackertaskone.stoneierarhy;

/**
 * Created by valua on 10/8/2016.
 */
public class Biryuza extends SemipreciousStone {
    private String pleohorizm;//low mostly

    public String getPleohorizm() {
        return pleohorizm;
    }

    public void setPleohorizm(String pleohorizm) {
        this.pleohorizm = pleohorizm;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("Biryuza: pleohorizm- ")
                .append(pleohorizm)
                .append(super.toString());
        return result.toString();
    }
}
