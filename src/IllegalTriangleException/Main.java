package IllegalTriangleException;

public class Main {
    public static void main(String[] args) {
        try {
            Triagle mot = new Triagle(-2, 2, 5);
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
