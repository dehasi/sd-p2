package ducks.composition;


import java.util.List;

class P3 {

    interface QuackBehavior {
        void quack();
    }

    static class Quack implements QuackBehavior {
        @Override public void quack() {
            System.out.println("quack!");
        }
    }

    static class Squeak implements QuackBehavior {
        @Override public void quack() {
            System.out.println("squeak!");
        }
    }

    static abstract class Duck {
        protected QuackBehavior quackBehavior;

        void performQuack() {
            quackBehavior.quack();
        }

        void swim() {
            System.out.println("I'm swimming");
        }

        abstract void display();
    }

    static class MallardDuck extends Duck {

        public MallardDuck() {
            // creating objects in a constructor is not recommended. We'll see why if we have time
            this.quackBehavior = new Quack();
        }

        @Override void display() {
            System.out.println("I am look like a mallard");
        }
    }

    static class RedheadDuck extends Duck {

        // we can use a "classical" setter
        void setQuackBehavior(QuackBehavior quackBehavior) {
            this.quackBehavior = quackBehavior;
        }

        // we can use a "fluent" setter
        RedheadDuck withQuackBehavior(QuackBehavior quackBehavior) {
            this.quackBehavior = quackBehavior;
            return this;
        }

        @Override void display() {
            System.out.println("I am look like a readhead");
        }
    }

    static class RubberDuck extends Duck {

        // or "inject" via a constructor
        public RubberDuck(QuackBehavior quackBehavior) {
            this.quackBehavior = quackBehavior;
        }

        @Override void display() {
            System.out.println("I am look like a rubberduck");
        }
    }

    public static void main(String[] args) {
        var ducks = List.of(
                new MallardDuck(),
                new RedheadDuck().withQuackBehavior(new Quack()),
                new RubberDuck(new Squeak()) // Rubber ducks can't fly, btw wooden ducks can't swim
        );

        ducks.forEach(duck -> {
            System.out.println();
            duck.display();
            duck.performQuack();
            duck.swim();
        });
    }
}
