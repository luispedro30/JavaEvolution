package org.example;

public class MyChar {

    private char letter;

    public MyChar(char letter){
        this.letter = letter;
    }

    public boolean isVowel(){
        if(this.letter == 'a' ||this.letter == 'e' ||this.letter == 'i' ||this.letter == 'o' ||this.letter == 'u'
        ||this.letter == 'A' ||this.letter == 'E' ||this.letter == 'I' ||this.letter == 'O' ||this.letter == 'U'){
            return true;
        }else{
            return false;
        }
    }

    public boolean isDigit(){
        if (this.letter >= 48 && this.letter < 57){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isAlphabet(){
        int numA = (int) 'a';
        int numZ = (int) 'z';
        if (this.letter >= numA && this.letter < numZ){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isConsonant(){
        if (isVowel() == false && isAlphabet() == true){
            return true;
        } else {
            return false;
        }
    }

    public static void printLowerCaseAlphabets(){
        //a to z
        for (char ch = 'a';  ch <= 'z'; ch++){
            System.out.println(ch);
        }
    }

    public static void printUpperCaseAlphabets(){
        //a to z
        for (char ch = 'A';  ch <= 'Z'; ch++){
            System.out.println(ch);
        }
    }
}
