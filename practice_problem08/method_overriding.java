package practice_problem08;


class Restaurant {
    String name;
    int tax = 10;
    int foodPrice;

    Restaurant(String name,int tax,int foodPrice){
        this.name = name;
        this.foodPrice = foodPrice;
        this.tax = tax;
    }
    int estimateDeliveryTime() {
        return 40;
    }

    int calculateBill(){
        return foodPrice + (foodPrice*tax)/100;
    }

    void displayInfo() {
        System.out.println(name + " estimated delivery time: " + estimateDeliveryTime() + " minutes."
                +" bill: " + calculateBill());
    }

}

class FastFoodRestaurant extends Restaurant {
    FastFoodRestaurant(String name,int tax,int foodPrice){
        super(name,tax,foodPrice);
    }
    @Override
    int estimateDeliveryTime() {
        return 20;
    }


}

class FineDiningRestaurant extends Restaurant {

    FineDiningRestaurant(String name,int tax,int foodPrice){
        super(name,tax,foodPrice);
    }
    int estimateDeliveryTime() {
        return 60;
    }


}
public class method_overriding {
    public static void main(String[] args) {
        Restaurant genericRestaurant = new Restaurant("res",10,500);
        FastFoodRestaurant fastFood = new FastFoodRestaurant("fastfood",15,500);


        genericRestaurant.displayInfo();
        fastFood.displayInfo();
        System.out.println();
        genericRestaurant.calculateBill();
        fastFood.calculateBill();


    }
}
