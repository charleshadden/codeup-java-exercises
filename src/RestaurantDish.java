public class RestaurantDish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;


    public void eat() {
        System.out.println("nom nom nom!");
    }
    public RestaurantDish() {
        System.out.println("New Dish");
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        setCostInCents(costInCents);
        setWouldRecommend(wouldRecommend);
        setNameOfDish(nameOfDish);
    }
}