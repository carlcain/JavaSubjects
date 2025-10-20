package Advance_java_features_Enums;

public class EnumsMain 
{
    // Enums = (Enumerations) A special kind of class that
    //                  represents a fixed set of constants.
    //                  They improve code readability and reliability.
    //                  More efficient with switches than Strings.

    public static void main(String[]args)
    {
        Sample s = Sample.one;

        // using a class varriable names
        System.out.println(s.getId()+" : "+s.getName());

        // this is a way of using the class names 
        System.out.println("using the class Names: "+Sample.one.getId());
    }
}
