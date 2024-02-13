package ducks.interfaces;

import java.util.List;

class P2 {

    private static abstract class Duck {

        void swim() {
            System.out.println("I'm swimming");
        }

        abstract void display();
    }

//    private interface Flyable {
//        void fly();
//    }

    private interface Quackable {
        void quack();
    }

    private static class MallardDuck extends Duck implements Quackable {

        @Override public void quack() {
            System.out.println("quack!");
        }   // <- Duplication

        @Override void display() {
            System.out.println("I am look like a mallard");
        }
    }

    private static class RedheadDuck extends Duck implements Quackable {

        @Override public void quack() {
            System.out.println("quack!");
        } // <- Duplication

        @Override void display() {
            System.out.println("I am look like a readhead");
        }
    }

    private static class RubberDuck extends Duck implements Quackable {

        @Override public void quack() {
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
                new RubberDuck()
        );

        ducks.forEach(duck -> {
            System.out.println();
            duck.display();
            duck.quack();
            duck.swim();
        });
    }
}
