# Simple factory design pattern
- Move the instantiation logic to a separate class and most commonly to a static method of this class.
- Some do not consider simple factory to be a design pattern, as it is simply a method that encapsulates object instantiation, nothing complex goes on in that method.
- We use this pattern when we have more than one option when instantiating object and a simple logic is used to choose the correct class that we instantiate from.

# Implementing a simple factory:
- We start by creating a separate class for our simple factory.
- Add a method that returns the desired object instance. This method is typically static and will accept some argument to decide which class to instantiate. We can also provide additional arguments which will be used to instantiate objects.
