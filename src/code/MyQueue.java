package code;

import java.util.Iterator;

public class MyQueue<T> {
	T[] queue;
	private int max_size;
	private int nElement;

	public MyQueue(int max_s) {
		max_size = max_s;
		queue = (T[]) new Object[max_size];
		nElement = 0;
	}

	public void insert(T obj) {
		if (nElement < max_size) {
			for (int i = nElement; i >= 1; i--) {
				queue[i] = queue[i - 1];
			}
			queue[0] = obj;
			nElement++;
		} else {
			max_size += nElement;
			T[] tmp = (T[]) new Object[max_size];
			for (int i = 0; i < queue.length; i++) {
				tmp[i] = queue[i];
			}
			queue = tmp;
			this.insert(obj);
		}
	}

	public int size() {
		return nElement;
	}

	public void remove() {
		queue[nElement] = null;
		nElement--;
	}

	public void print() {
		for (int i = 0; i < nElement; i++) {
			System.out.println(queue[i]);
		}
	}

	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private int len = nElement;
			private int index = 0;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return (index < len);
			}

			@Override
			public T next() {
				// TODO Auto-generated method stub
				return queue[index++];
			}

		};
	}
}
