package Task_2;

public class Main {
    public static String getWeather(Seasons season) {
        switch (season) {
            case WINTER:
                return "Холодно";
            case SUMMER:
                return "Жарко";
            case SPRING:
            case AUTUMN:
                return "Прохладно";
            default:
                return "Неизвестный сезон";
        }
    }

    public static void main(String[] args) {
        System.out.println(getWeather(Seasons.WINTER));
        System.out.println(getWeather(Seasons.SUMMER));
        System.out.println(getWeather(Seasons.SPRING));
        System.out.println(getWeather(Seasons.AUTUMN));
    }
}
