package MultiThreading;

public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        for(int i=0;i<100;i++)
        {
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
        }
    }
}
