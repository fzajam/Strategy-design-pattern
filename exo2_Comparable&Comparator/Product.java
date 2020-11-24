package Strategy;
import java.util.Comparator;

public class Product implements Comparable<Product> {
	protected String nom;
	protected int prix;
	protected int valeur;

	public Product(String nom, int prix, int valeur) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.valeur = valeur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	//Comparer par prix
	@Override
	public int compareTo(Product prod) {
		
		int comparePrix = ((Product) prod).getPrix();
		return this.prix - comparePrix;
	}
	
	//Comparer par nom
	public static Comparator<Product> ProductNomComparator = new Comparator<Product>() {

		public int compare(Product prod1, Product prod2) {
		
			String prodName1 = prod1.getNom().toUpperCase();
			String prodName2 = prod2.getNom().toUpperCase();
			
			return prodName1.compareTo(prodName2);
		}
	};
	
	//Comparer par valeur
	public static Comparator<Product> ProductValeurComparator = new Comparator<Product>() {
		
		public int compare(Product prod1, Product prod2) {
			
			int prodvaleur1 = prod1.getValeur();
			int prodvaleur2 = prod2.getValeur();
			
			return Integer.compare(prodvaleur1,prodvaleur2);
		}
		
	};
}
