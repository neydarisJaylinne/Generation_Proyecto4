
public class IntegerSet {

	public boolean[] array;

	public IntegerSet() {
		this.array = new boolean[101];
	}
	
	public void insertElement(int k) {
		array[k]=true;
	}
	public void deleteElement(int k) {
		array[k]=false;
	}
	public IntegerSet join(IntegerSet integerSet) {
		IntegerSet result = new IntegerSet();
		for(int i = 0; i<array.length; i++) {
			if(array[i]||integerSet.getElement(i)) {
				result.insertElement(i);
			}
		}
		return result;
	}
	public IntegerSet intersect(IntegerSet integerSet) {
		IntegerSet result = new IntegerSet();
		for(int i = 0; i<array.length; i++) {
			if(array[i]&&integerSet.getElement(i)) {
				result.insertElement(i);
			}
		}
		return result;
	}
	public boolean getElement(int k) {
		return array[k];
	}
	public boolean equalTo(IntegerSet integerSet) {
		for(int i = 0; i<array.length; i++) {
			if(array[i] != integerSet.getElement(i)) {
				return false;
			}
		}
		return true;
	}
	
	public String toSetString(IntegerSet integerSet) {
		String string = "";
		for(int i = 0; i<array.length; i++) {
			if(array[i]) {
				string+=i; 
				if(i!=array.length) {
					string+=" ";
				}
			}
		}
		if (string=="") {
			string="-";
		}
		return string;
	}
	
}
