package ducks.inheritance;

import java.util.List;

class P1 {

    // Add fly
     static abstract class Duck {
        void quack() {
            System.out.println("quack!");
        }

        void swim() {
            System.out.println("I'm swimming");
        }

        abstract void display();
    }

     static class MallardDuck extends Duck {

        @Override void display() {
            System.out.println("I am look like a mallard");
        }
    }

     static class RedheadDuck extends Duck {

        @Override void display() {
            System.out.println("I am look like a readhead");
        }
    }

     static class RubberDuck extends Duck {

        @Override void quack() {
            System.out.println("squeak!");
        }

        @Override void display() {
            System.out.println("I am look like a rubberduck");
        }
    }

    public static void main(String[] args) {
        var ducks = List.of(
                new MallardDuck(),
                new RedheadDuck(),
                new RubberDuck() // Rubber ducks can't fly, btw wooden ducks can't swim
        );

        ducks.forEach(duck -> {
            System.out.println();
            duck.display();
            duck.quack();
            duck.swim();
        });
    }
}
