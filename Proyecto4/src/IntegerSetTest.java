import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntegerSetTest {

	public boolean[] array = new boolean[101];
	IntegerSet integerSet = new IntegerSet();	
	
	@Test
	void testInsertElement() {
		int k= 1;
		integerSet.insertElement(k);
		assertEquals(false,array[k]);
	}

	@Test
	void testDeleteElement() {
		int k= 1;
		integerSet.deleteElement(k);
		assertEquals(false,array[k]);
	}

	@Test
	void testJoin() {
		IntegerSet result = new IntegerSet();
		for(int i = 0; i<array.length; i++) {
			testInsertElement();
		}
		assertEquals(result, integerSet.join(result));
	}

	@Test
	void testIntersect() {
		IntegerSet result = new IntegerSet();
		for(int i = 0; i<array.length; i++) {
			testInsertElement();
		}
		assertEquals(result, integerSet.intersect(result));
	}

	@Test
	void testGetElement() {
		int k=1;
		array[k]=true;
		assertEquals(false, integerSet.getElement(k));
	}

	@Test
	void testEqualTo() {
		for(int i = 0; i<array.length; i++) {
			array[i]= integerSet.getElement(i);
		}
		assertEquals(true, integerSet.equalTo(integerSet));
	}

	@Test
	void testToSetString() {
		String string = "";
		for(int i = 0; i<array.length; i++) {
			array[i]=true;
			i=array.length;
			}
		assertEquals(string, integerSet.toSetString(integerSet));
		}

}
