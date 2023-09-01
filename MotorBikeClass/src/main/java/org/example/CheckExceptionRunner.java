package org.example;

public class CheckExceptionRunner {
    public static void main(String[] args) {
        /*try{
            SomeOtherMethod();
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }*/
        OtherMethod();
    }

    private static void SomeOtherMethod() throws InterruptedException{
        Thread.sleep(2000);
    }

    private static void OtherMethod() throws RuntimeException{
    }
}
