package package2;
import package1.*;

public class Asub extends C{
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defaultMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage );
    }
}
