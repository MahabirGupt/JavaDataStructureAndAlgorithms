import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.method();
    }

    void method(){
        Calendar calendar = new GregorianCalendar(2000,10,30);
        System.out.println(calendar);
    }
}
