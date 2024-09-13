import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;



public class SetOperations {
    static Set<Object> union(Set<Object> a, Set<Object> b) {
        Set<Object> out = new HashSet<Object>();
        out.addAll(a);
        out.addAll(b);
        return out;
    }

    static Set<Object> intersect(Set<Object> a, Set<Object> b) {
        Set<Object> out = new HashSet<Object>();
        out.addAll(a);
        out.retainAll(b);
        return out;
    }

    static Set<Object> diff(Set<Object> a, Set<Object> b) {
        Set<Object> out = new HashSet<Object>();
        out.addAll(a);
        out.removeAll(b);
        return out;
    }

    static boolean isSubSet(Set<Object> a, Set<Object> b) {
        return b.containsAll(a);
    }

    static Set<Object> cartesiano(Set<Object> a, Set<Object> b) {
        Set<Object> out = new HashSet<Object>();
        for (Object i : a) {
            for (Object j : b) {
                Collection<Object> temp = new ArrayList<Object>();
                temp.add(i);
                temp.add(j);
                out.add(temp);
            }
        }
        return out;
    }

    public static void main(String[] args) {
        Set<Object> a = new HashSet<Object>();
        a.add(1);
        a.add(2);
        a.add(3);
        Set<Object> b = new HashSet<Object>();
        b.add(3);
        b.add(4);
        b.add(5);
        
        System.out.println("el set a es: " + a);
        System.out.println("el set b es: " + b);
        System.out.println("La union de set a y set b: " + union(a, b));
        System.out.println("La interseccion de set a con set b: " + intersect(a, b));
        System.out.println("El resultado de set a - b: " + diff(a, b));
        System.out.println("Es a subset de b?: " + isSubSet(a, b));
        System.out.println("Producto Cartesiano: " + cartesiano(a, b));  
    }
}