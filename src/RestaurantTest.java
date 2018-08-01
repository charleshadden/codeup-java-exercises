public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish(200 , "Lasagna", true);


        System.out.println(dish.getCostInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.isWouldRecommend());


    }
}
