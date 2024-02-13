package lisvov;

class Invariants {
    class Super {
        // Invariant: numInstances is an increasing sequence.
        protected static int numInstances;

        public static int getNumInstances() {
            return numInstances;
        }

        public Super() {
            numInstances++;
        }
    }

    class Sub extends Super {
        // Invariant violated: creating a new Sub decrements the sequence.
        public Sub() {
            numInstances--;
        }
    }
}
