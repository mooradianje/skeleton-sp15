public class FoxLauncher {
    
    public static void main(String[] args) {
        Animal a0 = new Animal();   // Line 1
        Fox f0 = new Fox();         // Line 2
        a0.speak();                 // Line 3
        f0.speak();                 // Line 4
        ((Animal) f0).speak();      // Line 5
        //((Fox) a0).speak();         // Line 6
        
        System.out.println("______pt2_____");
        Animal a2 = new Animal();
        System.out.println(a2.name);
        Animal a3 = new Fox("SuperFox");
        System.out.println(a3.name);
        System.out.println(((Animal) a3).name);
    }
}

// a: yes - SuperAnimal
// b - no
// c - prints "ringding?"
// d - error
// e prints error (none)
// f dynamic type

//q2:
//a: A
//b: ringding
//c: ringding
//d: dynamic

//q3: 
//a: True
//b: superanimial
//c: super animoal
//d: static