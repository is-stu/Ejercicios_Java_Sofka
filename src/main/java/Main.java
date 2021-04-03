import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.getDate();
    }

    public void getDate(){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha y hora actuales son :");
        System.out.println(date.format(LocalDateTime.now()));
    }
}
