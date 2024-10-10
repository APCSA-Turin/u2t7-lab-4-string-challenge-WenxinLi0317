package com.example.project;
//concat,withoout,friz string
public class StringProblems{
    //empty constructor
    public StringProblems(){}


    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x){
            //implement code here
            
       if (x.length()<2){
        return false;
       }
        String lastTwo = x.substring((x.length()-2));
        if (lastTwo.equals("ly")){
            return true;
        }else {
            return false;
        }
    }


    // Given two strings, append them together (known as "concatenation") 
    // and return the result. However, if the concatenation creates a double-char, 
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    //.        012.   345

    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"

    public String conCat(String s1, String s2){
        //implement code here
        Boolean bool = false;
        String concatenation = s1+s2;
        int index1 = 0;
        
        int index2 = 1;
        
        int index3 = 2;

        while(index3 <= concatenation.length()){
            
            
            String sub1 = concatenation.substring(index1,index2);
                                                  //2,3=c
            String sub2 = concatenation.substring(index2,index3);//3,4=c

            if(sub1.equals(sub2)){
                String sub3 = concatenation.substring(0,index1 );
               ///
                String sub4 = concatenation.substring(index2);
                    //abc cat. 0-2,3
                return sub3+sub4;
            }
            else{
                index1 ++;
                index2 ++;
                index3 ++;
            }
            
            
        }
        return concatenation;
    }

    // Given a string, return a version without the first 2 chars. 
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    public String deFont(String s1){
        //implement code here

        String firstLetter = s1.substring(0,1);
        String secondLetter = s1.substring(1,2);
        String subString = s1.substring(2);

        if(firstLetter.equals("a") && secondLetter.equals("b")){
            return s1;
        }else if (firstLetter.equals("a")){
            return firstLetter+s1.substring(2);
        }else if(secondLetter.equals("b")){
            return s1.substring(1);
        }else{
            return subString;
        }
        
        //return firstLetter+s1.substring(2);
    }

    
    // Given a string, if the first or last chars are 'x', 
    // return the string without those 'x' chars, and otherwise 
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1){
        String firstLetter = s1.substring(0,1);
        String lastLetetr = s1.substring((s1.length()) - 1);
        int length = s1.length();
        if(firstLetter.equals("x") && lastLetetr.equals("x")){
            s1 = s1.substring(1,(length-1));
        }else if (firstLetter.equals("x")){
            s1 = s1.substring(1);
        }else if (lastLetetr.equals("x")){
            s1 = s1.substring(0,length-1);
        }
        return s1;
    }

    // Given a string str, if the string starts with "f" return "Fizz".
    //  If the string ends with "b" return "Buzz". If both the "f" and "b" 
    //  conditions are true, return "FizzBuzz". In all other cases, return the 
    //  string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"

    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1){
        String firstLtter = s1.substring(0,1);
        String lastLetter = s1.substring(s1.length()-1);
        if(firstLtter.equals("f") && lastLetter.equals("b")){
            s1 = "FizzBuzz";
        }else if(firstLtter.equals("f")){
            s1 ="Fizz";
        }else if (lastLetter.equals("b")){
            s1 = "Buzz";
        }

        return s1;
    }

    // Given an int n, return the string form of the number followed 
    // by "!". So the int 6 yields "6!". Except if the number is 
    // divisible by 3 use "Fizz" instead of the number, and if the 
    // number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    //  Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
    //   What will the remainder be when one number divides evenly into another? 
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String fizzString2(int x){
       
        if (x < 3) {
            String newx = "" +x;

            return newx + "!";
            
        }else if(x%3==0 && x%5==0){
            return "FizzBuzz!";
        }else if (x%3==0){
            return "Fizz!";
        }else if(x%5==0){
            return "Buzz!";
        }else {
            String newx = "" +x+"!";

            return newx ;
        }
        
        
    }
}