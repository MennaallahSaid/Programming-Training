import javax.print.DocFlavor;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admain a1 = new Admain("ahmed",255 ,"devloper",12345,20,5,"ali",1,3);
        System.out.println(a1.access +a1.application);
        User u1 = new User("la",25 ,"face",289,15,"mla",32,5,5);
        System.out.println("enter your name and password");

        String uName = scanner.nextLine();
        int password =scanner.nextInt();

        u1.login(uName,password);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}