package com.revature.simple;

public class JavaSimpleSolution implements JavaSimple {

	@Override
	public int castToInt(double n) {
		return (int) n;
	}

	@Override
	public byte castToByte(short n) {
		return (byte) n;
	}

	@Override
	public double divide(double operandOne, double operandTwo) throws IllegalArgumentException {
		if(operandTwo == 0) {
			throw new IllegalArgumentException();
		}
		
		else {			
			return operandOne / operandTwo;
		}
		
	}

	@Override
	public boolean isEven(int n) {
		
		return false;
	}

	@Override
	public boolean isAllEven(int[] array) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double average(int[] array) throws IllegalArgumentException {
		if(array == null) {
			throw new IllegalArgumentException();
		}
		
		else if(array.length == 0) {
			return 0;			
		}
		
		else {
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			
			return sum / array.length;
		}
		
	}

	@Override
	public int max(int[] array) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int fibonacci(int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] sort(int[] array) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int factorial(int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] rotateLeft(int[] array, int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String isPrime(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean balancedBrackets(String brackets) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return false;
	}
	
}
