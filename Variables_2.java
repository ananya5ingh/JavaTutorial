public class Variables_2 {
    
    public static void main(String[] args){

        int myNum; // variable declaration
        myNum = 10; // variable initialisaton
        
        System.out.println(myNum);
        
        // There are 8 primitive types: char, int, byte, short, double, float, long, boolean

        // Boolean
        // Size: 1 bit | Description: Stores true or false values
        boolean myBool = true; 
        
        // Char
        // Size: 2 bytes | Description: Stores a single character/letter or ASCII values
        char a = 'G';

        // Int
        // Size: 4 bytes | Description: Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int i = 89;
  
        // use byte and short if memory is a constraint

        //Byte
        // Size: 1 byte | Description: Stores whole numbers from -128 to 127
        byte b = 4;
  
        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;

        // Short
        // Size: 2 bytes | Description: Stores whole numbers from -32,768 to 32,767

        short s = 56;
  
        // this will give error as number is
        // larger than short range
        // short s1 = 87878787878;
  
        // by default fraction value is double in java  (double - double precision - extra precision)

        //Double
        // Size: 8 bytes | Description: Stores fractional numbers. Sufficient for storing 15 decimal digits
        double d = 4.355453532;
  
        // for float use 'f' as suffix as standard

        //Float
        // Size: 4 bytes | Description: Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float f = 4.7333434f;
  
        // need to hold big range of numbers then we need long data type

        //Long
        // Size: 8 bytes | Description: Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l = 12121;
  
        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
        System.out.println("boolean: " + myBool);
        
    }
}

