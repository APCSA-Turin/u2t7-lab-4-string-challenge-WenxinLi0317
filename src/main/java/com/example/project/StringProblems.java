public class StringProblems{
    //empty constructor
    public StringProblems(){}


    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x){
            //implement code here
        int lastTwoLetter = (endsLy.lemngth()-2);
        if (endsLy.substring(lastTwoLetter).equals("ly")){
            return true;
        }
        return false;
    }


    // Given two strings, append them together (known as "concatenation") 
    // and return the result. However, if the concatenation creates a double-char, 
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2){
        //implement code here
        Boolean bool = false;
        String concatenation =  s1 + s2;
        while(bool=false){
            
            int index1 = 1;
            int index2 = 2;
            String sub1 = concatenation.substring(0,index1);
            String sub2 = concatenation.substring(index1,index2);

            if(sub1.equals(sub2)){
                String sub3 = concatenation.substring(0,index1);
                Sttring sub4 = concatenation.substring(index2+1);

                return sub3+sub4;
            }
            else{
                index1 ++;
                index2 ++;
            }
            if (index2> (concatenation.length()+1)){
                return s1+s2;
            }
        }
        
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
        //String secondLetetr = s1.substring(1,2);
        String subString = s1.substring(2);
        if(firstLetter.equals("a")){
            return firstLetter+s1.substring(2);
        }
        return subString;
    }

    
    // Given a string, if the first or last chars are 'x', 
    // return the string without those 'x' chars, and otherwise 
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1){
        String firstLetter = s1.substring(0,1);
        String lastLetetr = s1.substring(s1.length());
        int length = s1.length();
        if(firstLetter.equal("x") && lastLetetr.equal("x")){
            s1 = s1.substring(1,(length+1));
        }else if (firstLetter.equal("x")){
            s1 = s1.substring(1);
        }else if (lastLetetr.equal("x")){
            s1 = s1.substring(0,length);
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
        Stirng lastLetter = s1.substring(s1.length());
        if(firstLtter.equal("f") && lastLetter.equal("b")){
            s1 = "FizzBuzz";
        }else if(firstLtter.equal("f")){
            s1 ="Fizz";
        }else if (lastLetter.equal("b")){
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
        if(x%3==0 && x%5==0){
            return "FizzBuzz";
        }else if (x%3==0){
            return "Fizz";
        }else if (x%5==0){
            return "Buzz";
        }else{
            return (String)x+"!";
        }
        
    }
}