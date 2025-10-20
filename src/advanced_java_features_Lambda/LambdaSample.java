package advanced_java_features_Lambda;

import java.util.ArrayList;

public class LambdaSample
{
    public static void main(String[]args)
    {
        LambdaSample1();
        LambdaSample2();
        methodReferencing1();
        methodReferencing2();
    }

    /* lambda expression = 	feature for Java 8 and above
	* 						also known as an anonymous method
	* 						a shorter way to write anonymous classes with only one method
	*
	*						need to use a functional interface or use a pre-defined functional interface
	*						they contain only one abstract method
	*						ex. ActionListener, Runnable, (user-defined)
	*
	*						A Lambda expression can be used in any place where a functional interface is required
	*						How to use a lambda expression:
	*						(arguments) -> {statement/s}
	*/

    // Lambda 1
    // note:
    // this is the use of lambda by searching in a foreach loop
    public static void LambdaSample1()
    {
        ArrayList<String>sample = new ArrayList<>();
        sample.add("one");
        sample.add("two");
        sample.add("three");

        // i need to use the "x" here because this represent the String value 
        // why i didnt just use "sample" because i cannot call a value here if  
        sample.forEach((x) -> System.out.println("this is lambda1: "+x));    

        // for(String s: sample) // this is only a sample for loop not actualy for lambda 
        // {
            
        // }
    }
    
    // Lambda 2
    // note:
    // this is a lambda that uses a interface that is @FunctionalInterface anutation
    // "@FunctionalInterface" means that the interface can only have one 
    public static void LambdaSample2()
    {
        sampleInterface s = (x) -> System.out.println("this is lambda2: "+x);
        s.sample("one");
        s.sample("two");
        s.sample("three");
    }

    // Method Referencing 1
    // note:
    // this is method refferencing but i put it here because they seem similar to a lambda
    // this is just like a lambda but much more shorter 
    public static void methodReferencing1()
    {
        ArrayList<String>sample = new ArrayList<>();
        sample.add("Method Referencing1: one");
        sample.add("Method Referencing1: two");
        sample.add("Method Referencing1: three");

        SampleMessage s = new SampleMessage();

        // ( sample.forEach((e) -> s.something(e)); ) 
        // they are basicaly simmilar 
        sample.forEach(s::something); // this is method reference
    }

    // Method Referencing 3
    // note:
    public static void methodReferencing2()
    {
        ArrayList<String> sample = new ArrayList<>();
        sample.add("Method Referencing2: one");
        sample.add("Method Referencing2: two");
        sample.add("Method Referencing2: three");

        sample.forEach(System.out::println);
    }
}
