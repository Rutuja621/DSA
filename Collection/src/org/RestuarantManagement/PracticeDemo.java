package org.RestuarantManagement;
interface PaymethodMethod{
    void pay(double payment);
}

class ViaUPI implements PaymentMethod{

    @Override
    public void pay(double amount) {

    }
}

class ViaCreditCard implements PaymentMethod{

    @Override
    public void pay(double amount) {

    }
}

class ViaCashOnDelivery implements PaymentMethod{

    @Override
    public void pay(double amount) {

    }
}

//abstarction + inhertance
abstract  class Restaurant1{
    abstract void preparingFood();

   abstract double getDeliveryCharge();

}

class PizzaPizzaRestaurant extends Restaurant1{

    @Override
    void preparingFood() {

    }

    @Override
    double getDeliveryCharge() {
        return 0;
    }
}

class ChineseRestaurant1 extends Restaurant1{

    @Override
    void preparingFood() {

    }

    @Override
    double getDeliveryCharge() {
        return 0;
    }
}

class SouthIndianRestaurant1 extends Restaurant1{

    @Override
    void preparingFood() {

    }

    @Override
    double getDeliveryCharge() {
        return 0;
    }
}




public class PracticeDemo {

    public static void main(String[] args) {

    }
}
