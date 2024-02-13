package interfaces;

import java.io.Serializable;

class InterfacessTalk implements Serializable, Cloneable {

    // Marker || Tag(-ging)
    interface Empty {}

    @Marker2
    class MyClass implements Empty {


        void transactional(Runnable command) {
            try {
                // Open transaction
                command.run();
                // Commit transaction
            } catch (Exception e) {
                // Rollbaclk transaction
            }
        }

        void example() {
            transactional(() -> {
                System.out.println("hwllo");
            });
        }
    }

    @interface Marker2{}

    // Only one Method

    // Between class & interface = Trait || Mixin


    interface Quackable {
        default void quack() {
            System.out.println("quack");
        }
    }
}
