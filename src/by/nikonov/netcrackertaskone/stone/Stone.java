package by.nikonov.netcrackertaskone.stone;

/**
 * Created by valua on 10/7/2016.
 */
public abstract class Stone {
    private double carat;
    private String colour;
    private double solidity;
    private double density;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCarat() {
        return carat;
    }

    public void setCarat(double carat) {
        this.carat = carat;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getSolidity() {
        return solidity;
    }

    public void setSolidity(double solidity) {
        this.solidity = solidity;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(", colour- ")
                .append(colour)
                .append(", solidity- ")
                .append(solidity)
                .append(", density- ")
                .append(density)
                .append(", weight- ")
                .append(carat)
                .append(" carat, average price per carat- ")
                .append(getPrice())
                .append("$.");
        return result.toString();
    }
}
