package MultiThreading;

public class NumberPrinter implements Runnable{

    int i;

    NumberPrinter(int i)
    {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(STR."\{i} from thread :\{Thread.currentThread().getName()}");
    }
}
