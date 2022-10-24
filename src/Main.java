public class Main {
    public static void main(String[] args) {

        System.out.println("Урок 2.2 ООП. Домашнее задание - Human.");

        Human maksim = new Human("Максим", "Минск", 35,"бренд-менеджер");
        Human ania = new Human("Аня", "Москва", 29, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 27, "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 21, "");

        System.out.println(maksim);
        System.out.println(ania);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir);

        System.out.println("----------------------------------------");

        System.out.println("Урок 2.2 ООП. Домашнее задание - Flower.");
        System.out.println("----------------------------------------");

        Flower rose = new Flower("Роза обыкновенная","Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема","", 15, 5);
        Flower pion = new Flower("Пион","Англии", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила","Турция", 19.5, 10);

        printFlower(rose);
        printFlower(chrysanthemum);
        printFlower(pion);
        printFlower(gypsophila);

        calculateFlower(
                rose, rose, rose,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila
        );
        System.out.println("----------------------------------------");
    }

    private static void printFlower(Flower flower) {
        System.out.printf("Цветок - %s. Страна происхождения - %s. Стоимость штуки - %.2f руб. Срок стояния - %d дн.\n",
                flower.getFlowerColor(), flower.getCountry(), flower.getCost(), flower.getLifeSpan());
    }
    private static void calculateFlower(Flower... flowers) {
        double total = 0;
        int minLifeSpan = Integer.MAX_VALUE;

        for (Flower flower : flowers) {
            if (flower.lifeSpan < minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }
            total += flower.getCost();
        }
        total = total * 1.1;
        System.out.printf("Стоимость букета - %.2f руб. Срок стояния букета - %d дн.\n", total, minLifeSpan);
    }

}