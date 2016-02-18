/** modified for lab 2 to accommodate testing without junit test**/

/**
 *
 * @author mooradianje
 */
 
import java.util.Objects; 
 
public class TriangleTest {
  /**  We've already created a testScalene method.  Please fill in testEquilateral, and additionally
   *   create tests for Isosceles, Negative Sides, and Invalid sides
   **/
    public static int numtests = 0;
    public static int numpass = 0;
    
    public static void testScalene() {
        Triangle t = new Triangle(30, 40, 50);
        String result = t.triangleType();
        if (Objects.deepEquals("Scalene",result) == false) {
            numpass = numpass-1;
            System.out.println("testScalene Failed: got " + result);
        }
        numpass=numpass+1;
        numtests=numtests+1;
    }


    public static void testEquilateral() {
      //TODO: FILL IN
        Triangle t = new Triangle(30, 30, 30);
        String result = t.triangleType();
        Triangle t2 = new Triangle(30, 50, 40);
        String result2 = t2.triangleType();
        if (Objects.deepEquals("Equilateral",result) == false) {
            numpass = numpass-1;
            System.out.println("testEquilateral Failed: got " + result);
        }
        if (Objects.deepEquals("Equilateral",result2) == true) {
            numpass = numpass-1;
            System.out.println("Non Equilateral Test Failed: got " + result + ", should be Scalene");
        }
        numpass=numpass+2;
        numtests=numtests+2;
    }

    //TODO: CREATE MORE TESTS

    public static void main(String[] args) {
        testScalene();
        testEquilateral();
        System.out.println(numpass + " of " + numtests + " tests passed." );
    }
}
