package com.cg.project.services;

import com.cg.project.exceptions.InvalidNumberRangeException;

public class MathServicesImpl implements MathServices {

	@Override
	public int add(int n1, int n2) throws InvalidNumberRangeException {
		return n1+n2;
	}
	@Override
	public int sub(int n1, int n2) throws InvalidNumberRangeException {
		return n1-n2;
	}
	@Override
	public int div(int n1, int n2) throws InvalidNumberRangeException {
		return n1/n2;
	}

	

}
