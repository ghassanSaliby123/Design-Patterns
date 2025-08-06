package com.objectpool;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

	private BlockingDeque<T> availablePool;

	public ObjectPool(Supplier<T> supplier, int poolSize) {
		this.availablePool = new LinkedBlockingDeque<>();
		for (int i = 0; i < poolSize; i++) {
			availablePool.offer(supplier.get());
		}
	}

	public T get() {
		try {
			return availablePool.take();
		} catch (InterruptedException e) {
			System.out.println( "Interrupted while waiting for an object");
		}
		return null;
	}

	public void release(T object) {
		object.reset();
		try {
			availablePool.put(object);
		} catch (InterruptedException e) {
			System.out.println( "Interrupted while waiting for an object");
		}

	}
}
