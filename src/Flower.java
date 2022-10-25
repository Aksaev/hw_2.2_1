import java.text.DecimalFormat;


public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }
    public Flower(String flowerColor, String country, double cost) {
        this(flowerColor, country, cost, 3);
    }
    public String getFlowerColor() {
        return flowerColor;
    }
    public void setFlowerColor(String flowerColor) {
        this.flowerColor = ValidationUtils.validOrDefault(flowerColor, "Белый");
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = ValidationUtils.validOrDefault(country, "Россия");
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
            this.cost = Math.max(cost, 1);
    }
    public int getLifeSpan() {
        return lifeSpan;
    }
    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan > 0 ? lifeSpan : 3;
    }

    @Override
    public String toString() {
        return "Цветок - " + flowerColor +
                ". Страна происхождения - " + country +
                ". Стоимость штуки - " + cost + " руб" +
                ". Срок стояния - " + lifeSpan + " дн.";
    }
}