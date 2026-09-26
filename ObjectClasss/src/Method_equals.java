public class Method_equals {
    public static void main(String[] args) {
     Emp e1=new Emp();//object of class
     e1.name="rutuja";
     e1.age=23;

     Emp e2=new Emp();//object of class
     e2.name="rutuja";
     e2.age=23;

     Emp e3=null;
        System.out.println(e1.equals(e3));

        Integer i=30;
        System.out.println(e1.equals(i));

     //object class equals method

     System.out.println(e1.equals(e2));//object comparison(checks if both objects points to same memory location)
        //internally .equals uses ==
       // System.out.println(e1==e2); also gives false



/*
       //string class equals method

        String s=new String("rutuja");
        String s11=new String("rutuja");

        //here we are using string class .equals method for string comparison
        // string class overrides method of Object class and compares contents instead of memory location
        System.out.println(s.equals(s11));

        //== not overrides it works same as object class
        System.out.println(s==s11);//gives false both are not pointing to same memor location


    */


    }





}

class Emp{
    String name;
    int age;

    public String toString(){
       return (name+","+age);
    }



    public boolean equals(Object obj){
        //in case when we are comparing s1 object to s1 it is always true no need to further process
        if(this == obj){
            return true;
        }

        //in case if we decalre Student object as null it gives NullPointerException
        if(obj ==null){
            return false;//returns false if object doesn't contain value

        }

        //in case (as we have to give parameter as Object obj so it can use any class like integer , float etc)
        //it gives ClassCastException
        if(obj.getClass() != this.getClass()){

            //getClass points to current class(or returns current class that we are using)
            //so checking if we are using student class only if not
            return false;//returns false

        }
        //casting (converting object into student so it uses student class for comparison)
        Emp ss=(Emp) obj;
        return (this.name== ss.name && this.age==ss.age);//internally equals method usess == for comparison

    }
}