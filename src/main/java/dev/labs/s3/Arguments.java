package dev.labs.s3;

public class Arguments {

    public static void main(String[] args) {
        Arguments testInt = new Arguments();

        int passInMain = 6;
        testInt.primitiveDataType(passInMain); // Passed in by value
        System.out.println(passInMain + " set in main");
    }

    void primitiveDataType(int passedInTheMethod){
        System.out.println(passedInTheMethod + " is the argument");
        passedInTheMethod = 10; // Value changes are only within the scope of the method
        System.out.println(passedInTheMethod + " reassigned in method");
    }

    void referenceDataTypes(String passIn){
        // Future topic
    }
}
