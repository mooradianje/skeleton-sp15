import java.util.Objects;

public class SortedCompTest {
    public static int numtests=0;
    public static int numpass=0;
    
    public static void testget(){
        Dog d1 = new Dog("bob",10);
        Dog d2 = new Dog("dave",20);
        Dog d3 = new Dog("sean", 30);
        Dog d4 = new Dog ("alex", 25);
        
        SortedComparableList L = new SortedComparableList();
        L.insert(d1);
        L.insert(d2);
        L.insert(d3);
        L.insert(d4);
        Dog dget = (Dog) L.get(1);
        if(Objects.equals(20,dget.size) == false) {
            numpass = numpass - 1;
            System.out.println("insert failed");
        }
        numtests=numtests+1;
        numpass = numpass+1;
    }
    
    public static void main(String[] args) {
        testget();
        System.out.println(numtests + " of " + numpass + " tests passed.");
    }
}