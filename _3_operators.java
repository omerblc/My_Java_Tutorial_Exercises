class _3_operators {
    	static int age; // This is a class variable. We have to declare it as a static.
    	
	public static void main(String[] args) {
	   int number1 = 12; // Declaring (Creating) Variables. To create a variable, you must specify the type and assign it a value:
	   final int number2 = 6; // Final Variables. If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only).
	   int number3; 
	   int number4 = 10;
	   
	   /*
	   Java divides the operators into the following groups:
	   1 - Arithmetic operators
	   2 - Assignment operators
	   3 - Comparison operators
	   4 - Logical operators
	   5 - Bitwise operators
	   */
	   
	   
	   // 1 - Arithmetic operators
	   
	   // addition
	   System.out.println(number1 + number2); // 12+6=18
	   
	   number3 = number2 + 6;
	   System.out.println(number1 + number3); // 12+12=24
	   
	   // substraction
	   System.out.println(number1 - number2); // 12-6=6
	   
	   // multiplication
	   System.out.println(number1 * number2); // 12*6=72
	   
	   // division
	   System.out.println(number1 / number2); // 12/6=2
	   
	   // remainder (modulo/modulus)
	   System.out.println(number1 % number2); // 12%6=0
	   
	   // increment
	   System.out.println(++number4); // Increases the value of a variable by 1 // 10+1=11
	   
	   // decrement
	   System.out.println(--number4); // Decreases the value of a variable by 1 // 11-1=10
	   
	   
	   // 2 - Assignment operators
	   
	        // assignment operator (=)
	        int number5 = 20; // we use the assignment operator (=) to assign the value 20 to a variable called x
	        System.out.println("number5 = " + number5);
	   
	        // addition assignment operator (+=)
	        number3 += 6; // first adds 6 and then prints the code
	        System.out.println(number1 + number3); // 12+18=30 //Java doesn't have =+ operator.
	        
	        // subtraction assignment operator (-=)
	        number3 -= 6; // first subtracts 6 and then prints the code
	        System.out.println(number1 + number3); // 12+12=24
	        
	        // multiplication assignment operator (*=)
	        number3 *= 2;
	        System.out.println(number1 + number3); // 12+24=36
	        
	        // division assignment operator (/=)
	        number3 /= 6;
	        System.out.println(number1 + number3); // 12+4=16
	        
	        // modulus assignment operator (%=)
	        number3 %= 2;
	        System.out.println(number1 + number3); // 12+0=12
	        
	        // bitwise AND assignment operator (&=)
	        int a = 60; // 60 = 0011 1100
	        int b = 13; // 13 = 0000 1101
	        a &= b;     // 12 = 0000 1100
	        /*
	        The symbol & denotes the bitwise AND operator. It evaluates the binary value of given numbers.
	        The binary result of these numbers will be returned to us in base 10.
	        Here is something you should have in mind before we start the operation:
	        1 and 0 => 0
	        0 and 1 => 0
	        1 and 1 => 1
	        0 and 0 => 0
	        */
	        
	        // bitwise inclusive OR assignment operator (|=)
	        int c = 60; // 60 = 0011 1100
	        int d = 13; // 13 = 0000 1101
	        c |= d;     // 61 = 0011 1101
	        
	        // bitwise exclusive OR assignment operator - XOR (^=)
	        int e = 60; // 60 = 0011 1100
	        int f = 13; // 13 = 0000 1101
	        e ^= f;     // 49 = 0011 0001
	        
	        // signed right shift assignment operator (>>=)
	        int g = 60; // 60 = 0011 1100
	        int h = 2; // Shifts the bits two units to the right.
	        g >>= h;    // 15 = 0000 1111

	        // signed left shift assignment operator (<<=)
	        int j = 60; // 60 = 0011 1100
	        int k = 2;
	        j <<= k;    // 240 = 1111 0000
	        
	        
	   // 3 - Comparison operators
	   
	        // Equal to (==)
	        int l = 5;
	        int m = 5;
	        boolean result1 = (l == m); // result is true
	        
	        // Not equal (!=)
	        int o = 5;
	        int p = 3;
	        boolean result2 = (o != p); // result is true
	        
	        // Greater than (>)
	        int q = 5;
	        int r = 3;
	        boolean result3 = (q > r); // result is true
	        
	        // Less than (<)
	        int s = 5;
	        int t = 3;
	        boolean result4 = (s > t); // result is true
	        
	        // Greater than or equal to (>=)
	        int v = 5;
	        int u = 3;
	        boolean result5 = (v >= u); // result is true
	        
	        // 	Less than or equal to (<=)
	        int y = 3;
	        int z = 5;
	        boolean result6 = (y <= z); // result is true
	        
	   
	   // 4 - Logical operators
	   
	        // Logical and (&&) - Returns true if both statements are true
	        int a1 = 5;
	        int b1 = 3;
	        boolean result7 = (a1 > b1) && (a1 < 10); // result is true
	        
	        // Logical or (||) - Returns true if one of the statements is true
	        int a2 = 5;
	        int b2 = 3;
	        boolean result8 = (a2 > b2) || (a2 < 2); // result is true
	        
	        // Logical not (!) - Reverse the result, returns false if the result is true
	        boolean a3 = true;
	        boolean result9 = !a3; // result is false
	        
	   
	   // 5 - Bitwise operators
	   
	        // bitwise AND operator (&)
	        int a4 = 60; // 60 = 0011 1100
	        int b4 = 13; // 13 = 0000 1101
	        a4 &= b4;     // 12 = 0000 1100
	        
	        // bitwise OR operator (|)
	        int a5 = 60; // 60 = 0011 1100
	        int b5 = 13; // 13 = 0000 1101
	        a5 |= b5;     // 61 = 0011 1101
	        
	        // bitwise exclusive OR operator - XOR (^)
	        int a6 = 60; // 60 = 0011 1100
	        int b6 = 13; // 13 = 0000 1101
	        a6 ^= b6;     // 49 = 0011 0001
	        
	        // bitwise complement operator (~)
	        int a7 = 60; //  60 = 0011 1100
	        int b7 = ~a7; // -61 = 1100 0011

	}
}
