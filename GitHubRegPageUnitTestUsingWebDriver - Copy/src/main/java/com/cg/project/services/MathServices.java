package com.cg.project.services;

import com.cg.project.exceptions.InvalidNumberRangeException;

public interface MathServices {
	int add(int n1, int n2)throws InvalidNumberRangeException;
	int sub(int n1, int n2)throws InvalidNumberRangeException;
	int div(int n1, int n2)throws InvalidNumberRangeException;
	
}
