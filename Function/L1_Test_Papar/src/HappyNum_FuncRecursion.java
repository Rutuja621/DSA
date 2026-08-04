import java.util.Scanner;

public class HappyNum_FuncRecursion {
//get sum of all digit square
    public int getSum(int num){

        int sum=0;
        int temp=num;
        while(temp>0){//loop to iterate till 0
            int digit=temp%10;
            sum +=digit*digit;//get square and add it to sum
            temp /=10;//remove current digit
        }
        return sum;//return sum


    }

    public boolean isHappyNum(int num) {
        if(num == 1){//if num is 1 return true
            return true;
        }

        if(num == 4 || num==0){//if num is 4 and 0 then false
            return false;

        }
        return isHappyNum(getSum(num));//function recursion if above condition not match the call funcion

    }
    public static void main(String[] args) {
        HappyNum_FuncRecursion hp=new HappyNum_FuncRecursion();
        Scanner sc=new Scanner(System.in);//get an user input

        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        //function calling in main method

        if(hp.isHappyNum(num)){
            System.out.println("Happy number");

        }else{
            System.out.println("Not an happy number");
        }


    }
}
