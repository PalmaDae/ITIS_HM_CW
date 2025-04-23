package Task_7;

public class Main {
    public static void main(String[] args) {
        Flower rose1 = new Rose("Netherlands", 7, 100);
        Flower gerbena1 = new Gerbena("Russia", 5, 120);
        Flower tulip1 = new Tulip("Ukraine", 6, 70);
        Flower carnation1 = new Carnation("Turkey", 4, 69);

        Flower[] bonquetFirst = {rose1, gerbena1, tulip1};
        Flower[] bonquetSecond = {tulip1, gerbena1, carnation1};
        Flower[] bonquetThird = {carnation1, rose1, gerbena1};

        double bonquetFirstCost = calculateBonquetCost(bonquetFirst);
        double bonquetSecondCost = calculateBonquetCost(bonquetSecond);
        double bonquetThirdCost = calculateBonquetCost(bonquetThird);

        Flower.addSoldFlowers(bonquetFirst.length);
        Flower.addSoldFlowers(bonquetSecond.length);
        Flower.addSoldFlowers(bonquetThird.length);

        System.out.println(bonquetFirstCost);
        System.out.println(bonquetSecondCost);
        System.out.println(bonquetThirdCost);

        System.out.println(Flower.getTotalSold());
    }

    public static double calculateBonquetCost(Flower[] bonquet) {
        double totalCost = 0;
        for (Flower flower : bonquet) {
            totalCost += flower.getPrice();
        }
        return totalCost;
    }

}
