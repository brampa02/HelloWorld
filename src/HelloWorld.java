import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by patrice.bramble on 6/2/2017.
 */
public class HelloWorld {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World! What's your name? Type 0 to exit.");
        ArrayList<String> names = new ArrayList<String>();

        while (sc.hasNext()){
            String str = sc.nextLine();
            if(str.equals("0")){
                if(!names.isEmpty()){
                    String goodbye = "It was nice meeting you ";
                    for (String s: names) {
                        goodbye = goodbye + s + ", ";
                    }
                    goodbye = goodbye.substring(0,goodbye.length() - 2) + ". Goodbye!";
                    System.out.println(goodbye);
                }
                System.exit(0);
            }
            else
                names.add(str);
            System.out.println("Hi " + str + "! Who else is there? Type 0 to exit.");
        }
    }
}
