package org.example;

public class StringChange {

    private String phrase;

    public StringChange(String arg){
        this.phrase = arg;
    }

    public void initialCharacter(){
        for (int i = 0; i<=this.phrase.length()-1;i++){
            System.out.println(this.phrase.charAt(i));
        }
    };

    public static void main(String[] args) {
        StringChange word = new StringChange("Ola Carlos");
        word.initialCharacter();
    }
}
