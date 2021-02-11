package main;

import operators.Arithmetic;
import operators.Assignment;
import operators.Bitwise;
import operators.Logical;
import operators.Misc;
import operators.Relational;

public class Main {

	public static void main(String[] args) {
		
Arithmetic math = new Arithmetic(); 

int addition;

addition = math.add(2, 3);
int number5 = 5;
int number4 = 4;

int subtraction;
subtraction = (number5 - number4);

System.out.println(subtraction);

System.out.println(addition);

int multiplication;
int number10 = 10;
int number1 = 1;
multiplication = (number1 * number10);

System.out.println(multiplication);

int division;
int number12 = 12;
int number2 = 2;
division = (number12 / number2);

System.out.println(division);


Assignment assign = new Assignment();

Bitwise bit = new Bitwise();

Logical logic = new Logical();

Misc hello = new Misc();

Relational relation = new Relational();


	}

	
	}


