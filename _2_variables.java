/*
Variables are containers for storing data values.
1- String - stores text, such as "Hello". String values are surrounded by double quotes
2- int - stores integers (whole numbers), without decimals, such as 123 or -123
3- float - stores floating point numbers, with decimals, such as 19.99 or -19.99
4- char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
5- boolean - stores values with two states: true or false
*/

/*
integer types
byte aSingleByte = 100; // -128 to 127
short aSmallNumber = 20000; // -32,768 to 32,767
int anInteger = 2147483647; // -2147483648 to 2147483647
long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807
*/

/*
decimal types
double aDouble = 1.79769313; // 4.9E-324 to 1.7976931348623157E308
float aFloat = 3.4028F; // 1.4E-45 to 3.4028235E38
*/

/*
booleans types
boolean isWeekend = false;
boolean isWorkday = true;
*/

/*
characters
char copyrightSymbol = '\u00A9';
*/

class _2_variables {
    	static int age; // This is a class variable. We have to declare it as a static.
    	
	public static void main(String[] args) {
	    static age = 24;
	    int birthYear = 1998; // This is a local variable.
		System.out.println("I am " + age + " years old.");
		System.out.println("I was born in December " + birthYear + ".");
	}
}
