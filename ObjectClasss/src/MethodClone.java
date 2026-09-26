public class MethodClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Stud st=new Stud();
        st.name="rutuja";
        st.age=23;

        Stud st1=new Stud();
        st1.name="rutuja";
        st1.age=23;

        Stud s3=(Stud) st1.clone();//shallow copy
        System.out.println(s3.name);
        System.out.println(s3.age);
    }
}

//whose object you want to clone should implement Cloneable
class Stud extends Object implements  Cloneable{
    String name;
    int age;


    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
