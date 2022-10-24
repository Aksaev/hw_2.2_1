public class Flower {

    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {

        this.flowerColor =validOfDefault(flowerColor, "Белый");
        this.country =validOfDefault(country, "Россия");

        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }

        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

    }
    public Flower(String flowerColor, String country, double cost) {
        this(flowerColor, country, cost, 3);
    }
    private String validOfDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        }
        return value;
    }
    public String getFlowerColor() {
        return flowerColor;
    }
    public void setFlowerColor(String flowerColor) {
        this.flowerColor = validOfDefault(flowerColor, "Белый");
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = validOfDefault(country, "Россия");
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public int getLifeSpan() {
        return lifeSpan;
    }
    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}