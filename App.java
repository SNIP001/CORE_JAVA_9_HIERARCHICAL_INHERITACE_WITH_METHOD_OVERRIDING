
package $09_Hierarchical_inheritance;

public class App {
    public static void main(String[] args) {
        Son r = new Son();
        System.out.println( r.drink());
        
        Relatives re = new Relatives();
        System.out.println(re.drink());
       
        
    }
}
