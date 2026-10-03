package FunctionalInterfaces.Consumer;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier=() ->100;
        supplier.get();
    }
}
