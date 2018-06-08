package com.cg.project.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cg.project.exceptions.InvalidNumberRangeException;
import com.cg.project.services.MathServices;
import com.cg.project.services.MathServicesImpl;
public class MathServicesTest {
	private static MathServices mathServices ;

	private int validN1,validN2;
	private int inValidN1,inValidN2;
	@BeforeClass 
	public static void setUpTestEnv() {
		mathServices = new MathServicesImpl();
	}

	@Before
	public void setUpTestData() {
		validN1=100;
		validN2=200;
		inValidN1=-29;
		inValidN2=-32;
	}

	@Test(expected=InvalidNumberRangeException.class)
	public void testAddForFirstInvalidNO() throws InvalidNumberRangeException{
		mathServices.add(inValidN1, validN2);
	}

	@Test(expected=InvalidNumberRangeException.class)
	public void testAddForSecondInvalidNO() throws InvalidNumberRangeException{
		mathServices.add(inValidN1, inValidN2);
		
	}
	
	@Test()
	public void testAddForBothvalidNO() throws InvalidNumberRangeException{
		int acutalAns=mathServices.add(validN1,validN2);
		int expectedAns=300;
		Assert.assertEquals(expectedAns, acutalAns);
	
	}
	@AfterClass 
	public static void tearDownTestEnv() {
		mathServices =null;
	}

}
