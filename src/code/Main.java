package code;

import java.io.IOException;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		MyQueue<Integer> a = new MyQueue<Integer>(10);
		a.insert(5);
		a.insert(6);
		a.insert(7);
		a.remove();
		Iterator<Integer> it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//a.print();
	}
}
