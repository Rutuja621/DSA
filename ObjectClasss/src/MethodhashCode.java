import java.util.Objects;

class Demo {
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Demo d = (Demo) obj;
// Type casting: obj is an Object reference, so we convert it to Demo
// because we need to access Demo class variables like age and name.

        return age == d.age &&
// Compare current object's age with the other Demo object's age

                Objects.equals(name, d.name);
// Compare current object's name with the other Demo object's name
// Objects.equals() safely compares the String values, including null.
    }
    /* *** imp ***

    here we have override equal method based on name age
    then'
    we should have to override hashCode by name and age

     return Objects.hash(name, age);
     here we have overridden hashCode method according to our need
     and it will genearate an hash value for name and age so it will give true
     */

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
        // Generates one integer hash value using the name and age of the object.
        // If two objects have the same name and age,
        // their hashCode() will return the same hash value.
    }
}

public class MethodhashCode {
    public static void main(String[] args) {
        Demo dm = new Demo();
        dm.name = "rutuja";
        dm.age = 23;

        Demo dm1 = new Demo();
        dm1.name = "rutuja";
        dm1.age = 23;

        //here we have overriden the equal method so it will give true
        System.out.println(dm.equals(dm1));


        System.out.println(dm.hashCode() == dm1.hashCode());
    }
}