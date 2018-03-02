public class RestaurantTest {
    public static void main(String[] args) {
        RestaurauntDish dish = new RestaurauntDish(350, "Spicy Meatball", true);
        System.out.printf("%s - %d¢, %s\n", dish.getNameOfDish(), dish.getCostInCents(), dish.getWouldRecommend() ? "10/10 Would Recommend" : "Would Not Recommend");
        dish.eat();
    }
}
