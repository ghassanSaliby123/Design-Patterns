# Prototype design pattern
- We have a complex object that is costly to create. To create more instances of such a class, we use an existing instance as our prototype.
- Prototype will allow us to make copies of existing object and save us from having to recreate objects from scratch.
- Role-prototype: Declares a method for cloning itself.
- Role-concrete prototype: Implements cloning method
- Role-client: Creates new instance using prototype clone method.

# Implementing a prototype:
- We start by creating a class which will be a prototype. This class must implement cloneable interface.
- Class should override the clone method and return a copy of itself.
- The method should declare CloneNotSupportedException to give subclasses a chance to decide on whether to support cloning.
- Clone method implementation should consider the deep and shallow copy and choose which one is applicable.
- Make sure to reset the mutable state of object before returning the prototype. It’s a good idea to implement this in method to allow subclasses to initialize themselves.
- Clone method is protected in Object class and must be overridden to be public to be callable from outside the class.

# Design considerations: 
- Prototypes are useful when you have large objects where majority of state is unchanged between instances and you can easily identify that state.
- A prototype registry is a class where you can register various prototypes which other code can access to clone instances. This solves the issue of getting access to initial instance.



