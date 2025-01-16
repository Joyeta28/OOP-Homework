package practice_problem04;

public class method_overloading {

    static void FilterProducts(String category) {
        System.out.println("Filtering product by category :" + category);
    }

    static void FilterProducts(double minPrice,double maxPrice){
        System.out.println("Filtering product by price range $"+minPrice +" - $" +maxPrice);
    }


    static void FilterProducts(String brand,boolean flag){
        if(flag==true) {
            System.out.println("Filtering product by brand : " + brand);
        }
    }


    static void FilterProducts(String category,double minPrice,double maxPrice){
        System.out.println("Filtering product by category : "+category + " and price range $"+minPrice + " - $" + maxPrice);
    }

    static void FilterProducts(String category,double minPrice,double maxPrice,String brand){
        System.out.println("Filtering product by category : "+category + " and price range $"+minPrice + " - $" + maxPrice + " and brand "+ brand);
    }

    public static void main(String[] args) {
        FilterProducts("electronics");
        FilterProducts(150,200);
        FilterProducts("Apple",true);
        FilterProducts("fashion",150,200);
        FilterProducts("electronics",150,200,"Nike");
    }
}


