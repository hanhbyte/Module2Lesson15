package IllegalTriangleException;

public class Triagle {
    private int a, b, c;

    public Triagle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0){
            throw new IllegalTriangleException("No exits");
        }else if (a+b<c || a+c<b||b+c<a){
            throw new IllegalTriangleException("No no no");
        }else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
