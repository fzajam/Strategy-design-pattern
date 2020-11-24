package Strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String args[]) throws InterruptedException {
    	
    	List<Product> ProductArray = new ArrayList<Product>();
    	
    	Product produit1 = new Product("cloud", 100, 50);
    	Product produit2 = new Product("aseds", 20, 30);
    	Product produit3 = new Product("data", 100, 30);
    	Product produit4 = new Product("iccn", 80, 10);
    	
    	ProductArray.add(produit1);
    	ProductArray.add(produit2);
    	ProductArray.add(produit3);
    	ProductArray.add(produit4);
    	
    	Collections.sort(ProductArray);
    	
    	System.out.println("********* Trier par Prix *********");
        for(Product prod: ProductArray){
           System.out.println("Name : " + prod.nom + ", Prix : " + prod.prix +", Valeur : " + prod.valeur);
        }

        
        System.out.println("\n********* Trier par Nom *********");
        Collections.sort(ProductArray,  Product.ProductNomComparator);
        for(Product prod: ProductArray){
            System.out.println("Name : " + prod.nom + ", Prix : " + prod.prix +", Valeur : " + prod.valeur);
         }
        
        System.out.println("\n********* Trier par Valeur *********");
        Collections.sort(ProductArray,  Product.ProductValeurComparator);
        for(Product prod: ProductArray){
            System.out.println("Name : " + prod.nom + ", Prix : " + prod.prix +", Valeur : " + prod.valeur);
         }
    }
}

