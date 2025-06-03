package Invest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Stock> listOfStocks() throws FileNotFoundException {
        ArrayList<Stock> list = new ArrayList<>();

        Scanner scanner = new Scanner(new File("C:\\Users\\RedmiBook\\IdeaProjects\\03.06.AISD\\src\\Invest\\meh.txt"));

        while (scanner.hasNext()) {
            String[] data = scanner.nextLine().split("$");

            String name = data[0];
            String price = data[1];
            String profit = data[2].trim();

            Stock stock = new Stock(name, Integer.parseInt(price), Integer.parseInt(profit));
            list.add(stock);
        }
        scanner.close();
        return list;
    }

    public static void spendMoneyForHoney(int balance, ArrayList<Stock> list) {
        ArrayList<Stock> result = new ArrayList<>();

        int allProfit = 0;
        int allPrice = 0;

        if (balance < 50) {
            System.out.println("You're so poor :(");
            return;
        }

        for (Stock stock : result) {
            System.out.println(stock.name);
            System.out.println("Профит " + allProfit);
            System.out.println("Затраты " + allPrice);
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);

        ArrayList<Stock> list = listOfStocks();

        int balance = scanner.nextInt();

        spendMoneyForHoney(balance, list);
    }
}
