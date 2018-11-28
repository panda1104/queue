package code;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		MyQueue<Integer> n_val = new MyQueue<Integer>(10);
		for(int i = 0; i<11;i++) {
			n_val.insert(i);
		}
		assertEquals(11,n_val.size());
		//fail("Not yet implemented");
	}

}
