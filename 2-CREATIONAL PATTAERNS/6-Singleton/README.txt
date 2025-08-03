# Singleton design pattern
- A singleton class has only one instance, accessible globally through a single point (via a method/filed).
- Main problem this pattern solves is to ensure that only a single instance of this class exists.
- Any state you add in your singleton becomes part of (global state) of your application.
- Role-singleton: Responsible for creating unique instance. It provides static method to get the instance.

# Implementing a Singleton:
- Control instance creation: The class constructors must be not accessible globally and subclassing must not be allowed.
- Keep tracking of instance: Class itself is a good place to track the instance.
- Giving access to the singleton instance: A public static method is a good choice or we can expose the instance as final public static field, but it will not work for all singleton implementations.
- There are two options for implementing a singleton: 
- Early initialization- Eager singleton: create singleton as soon as class is loaded.
- Lazy initialization- Lazy singleton: create singleton when it is first required.


# Design considerations: 
- Early/Eager initialization is the simplest and preferred way. Always try to use this approach first.
- The classic singleton pattern implementation uses double check locking and volatile field.
- The lazy initialization holder idiom provides best of both worlds; you don’t deal with synchronization issues directly and is easy to implement.
- You can also implement singletons using Enums. However, due to pre-conceptions about what an Enum is, it may be a hard sell during code review especially if singleton has mutable fields. 
- Singleton creation does not need any parameters. IF you find yourself in need of support for constructor arguments, you need a simple factory or factory method pattern instead.
- Make sure that your singletons are not carry a lot of mutable global state.

# Pitfalls:
- Singleton pattern can deceive us about true dependencies since they are globally accessible, it is easy to miss dependencies.
- Hard to unit test.
- Most common way to implement singletons in java through static variables and they are held per class loader and not per JVM. So, they may not be truly singleton across several JVM’s.
- A singleton carrying around a large mutable global state is a good indication of abused singleton pattern.