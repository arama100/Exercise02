public class ObjectSimulator {
    public static void main(String... args){
        Foo foo = new Foo(3, new Bar(2));

        System.out.println(foo.getX());
        // => 3
        System.out.println(foo.getBar().getY());
        // => 2
        System.out.println(foo.calc());
        // => 5
    }
}