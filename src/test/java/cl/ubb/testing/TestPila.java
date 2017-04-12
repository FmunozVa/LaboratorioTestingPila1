package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPila {

	@Test
	public void StackIsEmpty() {
		Pila pila=new Pila();
		int result=pila.TamaņoPila();
		assertEquals(0,result);
				
	}
	@Test
	public void AddThreeStackIsNotEmpty() {
		Pila pila=new Pila();
		pila.add(3);
		int result= pila.TamaņoPila();
		assertEquals(1,result);
				
	}
		@Test
	public void AddOneTwoStackIsNotEmpty() {
		Pila pila=new Pila();
		pila.add(1);
		pila.add(2);
		boolean result= StackEmpty(pila.TamaņoPila());
		
		assertEquals(false,result);
				
	}
}
