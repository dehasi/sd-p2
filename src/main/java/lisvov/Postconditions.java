package lisvov;

class Postconditions {
    private class Super {
        private String myString;

        // Postcondition: myString is always nonull.
        public String getMyString() {
            return myString == null ? "" : myString;
        }
    }

    private class Sub extends Super {

        private String myBetterString;

        // Weaker postcondition: myString can be null.
        @Override public String getMyString() {
            return myBetterString;
        }
    }
}
