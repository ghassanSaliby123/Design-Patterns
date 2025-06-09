# Abstract factory design pattern
- It is used when we have 2 or more objects which work together forming a kit or a set and there can be multiple sets or kits that can be created by client code.
- So, we separate client code from concrete objects forming such a set and form the code which creates their sets.
- Role-Abstract Factory: Interface that defines operations to create products
- Role-Concrete factory: Implements factory and create products form a particular family.
- Role-Abstract product: Interface for a type of product.
- Role-Concrete product: Implements the product interface or class.
- Role-Client: uses abstract factory and abstract product.

# Implementing a prototype:
- We start by studying the product sets. Then create an abstract factory as an abstract class or interface which defines abstract methods for creating a product. Then implement the factory for each set of products.
- Abstract factory makes use if factory method pattern. You can think of abstract factory as an object with multiple factory methods.

# Design considerations: 
- Factories can be implemented as singletons; we typically ever need one instance of it anyway.
- Adding a new product type requires changes to the base factory as well as all implementations of factory.
- We provide the client code with concrete factory so that it can create objects.
- When we want to constrain object creations so that they all work together abstract factory is a good design pattern.
- Abstract factory uses factory method pattern.
- If objects are expensive to create then you can transparently switch factory implementations to use prototype design pattern to create objects.





