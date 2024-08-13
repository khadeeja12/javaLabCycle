import java.util.*;
import java.io.*;
import java.lang.*;

class Odd extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i%2!=0) {
                System.out.println("odd :"+i);
            }
        }
    }
}
class Even extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i%2==0) {
                System.out.println("even :"+i);
            }
        }
    }
}
public class Main10_1 {
    public static void main(String[] args) {
        Odd o =new Odd();
        Even e = new Even();
        System.out.println("odd start");
        o.start();
        e.start();
        try{
            o.join();
            e.join();
        }
        catch(Exception e1){
            System.out.println(e);
        }
        
        System.out.println("Even start");
        
    }
}
