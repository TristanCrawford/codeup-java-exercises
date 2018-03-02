public class RestaurantTest {
    public static void main(String[] args) {
        RestaurauntDish dish = new RestaurauntDish();
        dish.costInCents = 9001;
        dish.nameOfDish = "Spicy Meatball";
        dish.wouldRecommend = true;
        System.out.printf("%s - %d ¢, %s\n", dish.nameOfDish, dish.costInCents, dish.wouldRecommend ? "10/10 Would Recommend" : "Would Not Recommend");
        dish.eat();
    }
}
