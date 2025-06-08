# Factory Method design pattern
- Move the object creation logic from our code to a separate class.
- We use this pattern when we do not know in advance which class we may need to instantiate beforehand and to allow new classes to be added to system and handle their creation without affecting client code.
- We let subclasses decide which object to instantiate by overriding the factory method.
- Role-product: A base class or interface of products created by factory method.
- Role-concrete product: Implements the product interface or class.
- Role-creator: Declares the abstract factory method and use it to create the product.
- Role-concrete creator: Implements factory method and returns one of concrete product instance.


# Implementing Factory method:
- We start by creating a class for our creator which it can be concrete if it can provide a default object or it can be abstract. Other implementation will override the method and return an object.

