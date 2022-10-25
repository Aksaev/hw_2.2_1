public class Bouqet {
    private final Flower[] flowers;

    public Bouqet(Flower... flowers) {
        this.flowers = flowers;
    }
    public double getCost() {
        double sum = 0;
        for (Flower flower : flowers) {
            if (flower != null) {
                sum += flower.getCost();
            }
        }
        return sum + sum * 0.1;
    }

    public int getLifeSpan() {
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower != null && flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return minLifeSpan;
    }

}

