public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools burger = new BurgerTools();
        burger.mostPopularTopping = "Cheese";
        burger.averageDaysBeforeExpiration = 20;
        burger.temperatureWhenCooked = 120;
        burger.grill();
        System.out.println(burger.mostPopularTopping);
    }
}
