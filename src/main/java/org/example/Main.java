package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static boolean isPalindrome(int x) {
       int n=Math.abs(x);
       String s = Integer.toString(n);
       String rev = new StringBuilder(s).reverse().toString();
       return s.equals(rev);
    }

    public static boolean isPerfectNumber(int x){
        if (x<1) return false;
        int sum = 1;
        int limit = (int)Math.sqrt(x);
        for (int i = 2; i <= limit; i++) {
            if(x % i==0){
              sum+=i;
              int other = x/i;
              if(other!=x) sum+=other;
            }
        }
        return sum==x;
    }

    public static String numberToWords(int y){
        if(y<0) return "Invalid Value";
        if(y==0) return "Zero";

        String s=Integer.toString(y);
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            switch (c){
                case '0': sb.append("Zero");break;
                case '1': sb.append("One");break;
                case '2': sb.append("Two");break;
                case '3': sb.append("Three");break;
                case '4': sb.append("Four");break;
                case '5': sb.append("Five");break;
                case '6': sb.append("Six");break;
                case '7': sb.append("Seven");break;
                case '8': sb.append("Eight");break;
                case '9': sb.append("Nine");break;
            }
            if(i<s.length()-1) sb.append(" ");
        }
        return sb.toString();
    }
}



