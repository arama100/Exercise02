/**
 * Created by s1220127 on 5/19/2017.
 */
public class Foo {

    private int x;
    private Bar b;

    Foo(int x,Bar b){
        this.x = x;
        this.b = b;
    }

    public int getX(){
        return x;
    }

    public Bar getBar(){
        return b;
    }

    public int calc(){
        return x+this.getBar().getY();
    }

}

class Bar{

    private int n;

    Bar(int n){
        this.n = n;
    }

    public int getY(){
            return n;
    }
}