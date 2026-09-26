public class MethodgetClass {
    public static void main(String[] args) {
        Animal a=new Animal();
        Animal d=new Dog();
        //return class class_name
        System.out.println(a.getClass().getName());

        //returns only class_name
        System.out.println(d.getClass());

        //instance of operator --> check if object is instance of any class or any of its subclass
        System.out.println(d instanceof Animal);//returns true
        System.out.println(a instanceof Animal);//returns true
        System.out.println(a instanceof Dog);
    }
}

class Animal{

}

class Dog extends Animal{

}
