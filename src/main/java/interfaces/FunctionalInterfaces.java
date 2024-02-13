package interfaces;

import java.util.function.Supplier;

class FunctionalInterfaces {

    void transaction(Runnable command) {
        try {
            // open transaction
            command.run();
            // close transaction
        } catch (Exception e) {
            // rollback transaction
        }
    }

    void foo() {
        transaction(() -> {
            System.out.println("Hello World");
        });
    }


    /*
    Example:
    var response = logWork(() -> httpClient.requestTo("googl.com"));
    * */
    static <T> T logWork(Supplier<T> supplier) {
        long start = System.currentTimeMillis();
        var result = supplier.get();
        long end = System.currentTimeMillis();
        System.out.println("The work took: " + (end - start) + "ms");
        return result;
    }
}
