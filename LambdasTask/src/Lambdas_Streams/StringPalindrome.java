package Lambdas_Streams;
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class StringPalindrome{
	
    public static void main(String args[]){
        List<String> inputlist= new ArrayList<>();
        inputlist.add("radar");
        inputlist.add("haiah");
        inputlist.add("madam");
        inputlist.add("vaishnavi");
        inputlist.add("college");
        inputlist.add("civic");
        System.out.println("List is: "+inputlist);
        StringPalindrome.isPalindrome(inputlist);
    }
    public static void isPalindrome(List<String> l1){
        List<String> palindromes=new ArrayList<String>();
        for(String i:l1)
        {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                palindromes.add(i);}
       System.out.println("Palindrome Strings are: "+palindromes);
    }
}