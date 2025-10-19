package advanced_java_features_Lambda;

import java.util.ArrayList;

public class LambdaSample
{
    public static void main(String[]args)
    {
        LambdaSample1();
        LambdaSample2();
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

    // Lambda 2
    // note:
    // this is method refferencing
    public static void LambdaSample3()
    {
        ArrayList<String>sample = new ArrayList<>();
        sample.add("This is lambda3: one");
        sample.add("This is lambda3: two");
        sample.add("This is lambda3: three");

        sample.forEach(System.out::println); // this is method reference
    }
}
