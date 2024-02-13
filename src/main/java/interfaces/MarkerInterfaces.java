package interfaces;

public class MarkerInterfaces {//implements RandomAccess, Cloneable, Serializable {

    // Marker || Tag(-ging)
    interface Empty {}

    @interface Marker {}

    @Marker
    class MyClass implements Empty{}
}
