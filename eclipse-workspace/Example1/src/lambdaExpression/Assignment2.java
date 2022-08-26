package lambdaExpression;
import java.util.*;  

class GetNamePrice{  
    int id;  
    String name;  
    float price;  
    public GetNamePrice(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Assignment2 {
	public static void main(String[] args) {  
        List<GetNamePrice> productsList = new ArrayList<GetNamePrice>();  
        //Adding Products  
        productsList.add(new GetNamePrice(1,"HP Laptop",17000f));  
        productsList.add(new GetNamePrice(2,"Dell Laptop",18000f));  
        productsList.add(new GetNamePrice(3,"Lenevo Laptop",28000f));  
        productsList.add(new GetNamePrice(4,"Sony Laptop",28000f));  
        productsList.add(new GetNamePrice(5,"Apple Laptop",90000f));  
        productsList.add(new GetNamePrice(6,"Acer Laptop",19000f));
        productsList.add(new GetNamePrice(7,"Asus Laptop",20000f));
        productsList.add(new GetNamePrice(8,"MSI Laptop",15500f));
        productsList.add(new GetNamePrice(9,"Samsung Laptop",25000f));
        productsList.add(new GetNamePrice(10,"Rasor Laptop",28000f));
        
        // This is more compact approach for filtering data  
        productsList.stream()  
                             .filter(product -> product.price >= 15000 && product.price <=20000)  
                             .forEach(product -> System.out.println(product.name));    
    }  
}
