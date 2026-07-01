//Lab Cycle 1
// Task 4: Data Type Demonstration
// 1/07/2026

public class DataTypeDemo {
    public static void main(String[] args) {

        int intValue = 100;
        long longValue = 100000L;
        float floatValue = 25.5f;
        double doubleValue = 123.456;
        char charValue = 'A';
        boolean boolValue = true;

        System.out.println("Integer value : " + intValue);
        System.out.println("Long value    : " + longValue);
        System.out.println("Float value   : " + floatValue);
        System.out.println("Double value  : " + doubleValue);
        System.out.println("Character     : " + charValue);
        System.out.println("Boolean       : " + boolValue);

        System.out.println("\nMemory Range:");
        System.out.println("byte    : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short   : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int     : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long    : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float   : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double  : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char    : 0 to " + (int) Character.MAX_VALUE);
        System.out.println("boolean : true or false");
    }
}