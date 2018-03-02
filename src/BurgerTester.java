public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools.mostPopularTopping = "Bacon";
        BurgerTools.averageDaysBeforeExpiration = 3;
        BurgerTools.temperatureWhenCooked = 9001;
        System.out.printf("Topping: %s, Expires in %d days, Cooked at %d°\n", BurgerTools.mostPopularTopping, BurgerTools.averageDaysBeforeExpiration, BurgerTools.temperatureWhenCooked);
        BurgerTools.grill();
    }
}
