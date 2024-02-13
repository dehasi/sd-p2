package lisvov;

// It's a popular job interview question
class SquareExtendsRectangle {

    static class Rectangle {
        int width, height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        int area() {
            return width * height;
        }
    }

    static class Square extends Rectangle {

        public Square(int width) {
            super(width, width);
        }

        @Override
        public void setWidth(int width) {
            this.width = this.height = width;
        }

        @Override
        public void setHeight(int height) {
            this.width = this.height = height;
        }
    }

    static void incrementWidth(Rectangle rectangle) {
        rectangle.setWidth(rectangle.width + 1);
    }

    public static void main(String[] args) {
        var rectangle1 = new Rectangle(6, 7); // 42
        var rectangle2 = new Rectangle(2, 2);  // 4
        var square = new Square(2); // ^^^^^

        incrementWidth(rectangle1);
        incrementWidth(rectangle2);
        incrementWidth(square);

        System.out.println(rectangle1.area()); // 49
        System.out.println(rectangle2.area()); // 6
        System.out.println(square.area()); // we expect 9 but get 9

        // Try to extend Rectangle from Square
    }
}
