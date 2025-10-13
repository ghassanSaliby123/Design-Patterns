# Adapter design pattern
- We have an existing object which provides the functionality that client needs, but client code can’t use this object because it expects an object with different interface.
- Using adapter design pattern, we make this existing object work with client by adapting the object to client’s expected interface.
- This pattern is also called as wrapper as it wraps existing object.
- This pattern could be design through making the adapter extends the adaptee class (class adapter) or by adding the adaptee object to the adapter class (object adapter), the latter is the preferred way.
- Role-Adaptee: Our existing class providing a needed functionality.
- Role-Adapter: Adapts existing functionality to target interface.
- Role-Target interface: Interface extended by the client.

# Implementing Adapter:
- We start by creating a class adapter which must implements the interface that expected by the client.
- As for the class adapter implementation, we are going to forward the method to another method inherited from adaptee.
- As for the object adapter, we are going to implement the target interface and accept adaptee as constructor argument in adapter (use composition). For this pattern the adapter should take adaptee as a constructor argument or as less preferred, we can instantiate it in the constructor thus tightly coupling with a specific adaptee.

# Design considerations:
- How much work the adapter does depends on the differences between the target interface add the object being adapted. If method arguments are same or similar adapter has very less work to do.
- Using class adapter allows us to override some of the adapter’s behaviour, but this has to be avoided as we end up with adapter that behaves differently than adaptee. Fixing defects in not easy anymore.
- Using object adapter allows us to potentially change the adaptee object to one of its subclasses.
- In java a class adapter may not be possible if both target and adaptee are concrete classes. In such case the object adapter is the only solution. Alson since there is no private inheritance in java, it is better to stick with object adapter.
- A class adapter is also called two-way adapter, since it can stand in for both the target interface and for adaptee. That is, we can use object adapter where either target interface is expected as well as where an adaptee object is expected.

# Pitfalls:
- Using target interface and adaptee class to extend our adapter we can create a class adapter in java. However, it creates an object which exposes unrelated methods in parts of our code and polluting it. Avoid class adapters.
- It is tempting to do a lot of things in adapter besides simple interface translation. But this can result in an adapter showing different behaviour than the adapted object.