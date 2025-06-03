import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<App> listOfApps() throws FileNotFoundException {
        ArrayList<App> list = new ArrayList<>();

        Scanner scanner = new Scanner(new File("C:\\Users\\RedmiBook\\IdeaProjects\\03.06.AISD\\src\\Applications.txt"));

        while(scanner.hasNext()) {
            String[] data = scanner.nextLine().split(",");
            String name = data[0];
            String value = data[1];
            String size = data[2].trim();

            App app = new App(name, Integer.parseInt(value), Integer.parseInt(size));
            list.add(app);
        }

        scanner.close();
        return list;
    }

    public static void valueApps(ArrayList<App> list) {
        list.sort((a, b) -> Double.compare(b.valuePerMb(), a.valuePerMb()));

        ArrayList<App> selectedApps = new ArrayList<>();

        int limit = 30;
        int used = 0;
        int value = 0;

        for (App app : list) {
            if (used + app.size <= limit) {
                selectedApps.add(app);
                used += app.size;
                value += app.value;
            }
        }


        System.out.println("Apps");
        for (App app : selectedApps) {
            System.out.println(app.name );
        }

        double sr = (double) value/used;

        System.out.println("Память " + used);
        System.out.println("Полезность " + value);
        System.out.println("Средняя полезность " + sr);

    }

    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<App> list = listOfApps();

        valueApps(list);

//        for (App app : listOfApps) {
//            System.out.println(app);
//        }
    }
}