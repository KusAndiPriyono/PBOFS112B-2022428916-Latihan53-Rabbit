package pbofs112b.pkg2022428916.latihan53.rabbit;

/**
 *
 * @author 
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public String getEats() {
        return eats;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }
}
