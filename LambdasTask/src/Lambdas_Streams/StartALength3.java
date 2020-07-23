package Lambdas_Streams;
import java.util.*;
import java.io.*;
import java.util.stream.*;
public class StartALength3{
	public static void printStrings(Stream<String> stream)
    {
        System.out.print("After filtering: ");
        stream.filter(s->s.startsWith("a")).filter(s -> s.length()==3).forEach(s->{System.out.print(s+" ");});
    }
    public static void main(String args[])
    {
        Stream<String> streamOfArray = Stream.of("ant","hello", "how", "are","you","fine");
        StartALength3.printStrings(streamOfArray);
    }
}