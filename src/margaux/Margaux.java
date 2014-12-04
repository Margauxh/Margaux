package margaux;

public class Margaux {
static int i =0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        Lapin lap = new Lapin("Bob", 20); 
        while (i<=10){
            lap.crier();
            i=i+1;
        }
        
    }
}
