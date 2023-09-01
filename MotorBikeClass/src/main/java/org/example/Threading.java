package org.example;


class Task1 extends Thread {
    public void run() { //SIGNATURE
        System.out.println("\n Task1 Started");

        for (int i = 101; i<= 199; i++){
            System.out.println(i);
        }
        System.out.println("\n Task1 Done");
    }
}

class Task2 implements Runnable {
    public void run() { //SIGNATURE
        System.out.println("\n Task2 Started");

        for (int i = 201; i<= 299; i++){
            System.out.println(i);
        }
        System.out.println("\n Task2 Done");
    }
}
public class Threading {
    public static void main(String[] args) throws InterruptedException{
        Task1 task1 = new Task1();
        task1.setPriority(10); //set this threads as a priority
        task1.start();

        Task2 task2 = new Task2();
        Thread thread = new Thread(task2);
        thread.start();

        //wait for task1 to complete
        task1.join();
        thread.join();

        for (int i = 301; i<= 399; i++){
            System.out.println(i);
        }
        System.out.println("\n Task3 Done");

    }
}
