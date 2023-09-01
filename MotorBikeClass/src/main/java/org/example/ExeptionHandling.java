package org.example;

public class ExeptionHandling {
    public static void main(String[] args) {
        method1();
        System.out.println("Main ended");
    }

    public static void method1(){
        method2();
        System.out.println("Method 1 Ended");
    }

    public static void method2(){
        try{
            //String str = null;
            //str.length();
            int[] i  = {1,2};
            int number = i[2];
            System.out.println("Method 2 Ended");
        } catch (NullPointerException e){
            System.out.println("Matched NullPointerException");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Matched ArrayIndexOutOfBoundsException");
        } catch (Exception e){
            System.out.println("Matched Exception");
            e.printStackTrace();
        }
    }

}
