class _3_operators {
    	static int age; // This is a class variable. We have to declare it as a static.
    	
	public static void main(String[] args) {
	   int number1 = 12;
	   int number2 = 6;
	   int number3;
	   
	   // addition
	   System.out.println(number1 + number2); // 12+6=18
	   number3 = number2 + 6;
	   System.out.println(number1 + number3); // 12+12=24
	   number3 += 6; // first adds 6 and then prints the code
	   System.out.println(number1 + number3); // 12+18=30
	   //Java doesn't have =+ operator.
	   
	   // substraction
	   System.out.println(number1 - number2); // 12-6=6
	   number3 -= 6; // first subtracts 6 and then prints the code
	   System.out.println(number1 + number3); // 12+12=24
	   
	   // multiplication
	   System.out.println(number1 * number2); // 12*6=72 
	   number3 *= 2;
	   System.out.println(number1 + number3); // 12+24=36
	   
	   // division
	   System.out.println(number1 / number2); // 12/6=2
	   number3 /= 6;
	   System.out.println(number1 + number3); // 12+4=16
	   
	   // remainder (modulo/modulus)
	   System.out.println(number1 % number2); // 12%6=0
	   number3 %= 2;
	   System.out.println(number1 + number3); // 12+0=12
	   
	   // is equel to
	   System.out.println(number1 == number2); // number1 is not equel to number2, answer is false
	   
	   // is not equel to
	   System.out.println(number1 != number2); // number1 is not equel to number2, answer is true
	   
	   // is greater than
	   System.out.println(number1 > number2); // number1 is greater than number2, answer is true
	   
	   // is less than
	   System.out.println(number1 < number2); // number1 is not less than number2, answer is false
	   
	   // is greater than or equel to
	   System.out.println(number1 >= number2); // number1 is greater than or equel to number2, answer is true
	   
	   // is less than or equel to
	   System.out.println(number1 <= number2); // number1 is less than or equel to number2, answer is false
	}
}
