package pbofs112b.pkg2022428916.latihan53.rabbit;

/**
 *
 * @author 
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
 */
public class PBOFS112B2022428916Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rabbit r = new Rabbit("Peter", false, "grass", 4, "grey");
       
       System.out.println("Hello, his name is " + r.getName());
       System.out.println(r.getName() + " is vegetarian? " + r.isVegetarian());
       System.out.println(r.getName() + " eats " + r.getEats());
       System.out.println(r.getName() + " has " + r.getNoOfLegs() + "legs");
       System.out.println(r.getName() + " color is " + r.getColor());
    }
    
}
