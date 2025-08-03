package com.coffeepoweredcrew.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {

	private LazyRegistryIODH() {

	}

	private static class RegistryHHolder {
		static final LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
	}

	public static LazyRegistryIODH getInstance() {
		return RegistryHHolder.INSTANCE;
	}

}
