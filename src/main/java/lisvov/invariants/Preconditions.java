package lisvov.invariants;

class Preconditions {

    private class Super {
        private int myInt = 42;

        // Precondition: newValue can be anything.
        public void setMyInt(int newValue) {
            myInt = newValue;
        }
    }

    private class Sub extends Super {
        // Stronger precondition: newValue must be > 0.
        @Override public void setMyInt(int newValue) {
            if (newValue <= 0) throw new RuntimeException("Must be positive");
            super.setMyInt(newValue);
        }
    }
}
