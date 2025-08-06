# Object pool design pattern
- In our system if cost creating an instance of a class is high and we need many objects of this class for short duration, then we can use an object pool (such as threads, connections)
- Here we either pre-create objects of the class or collect unused instances in the memory cache. When code needs an object of this class we provide it from this cache.
- One of the most complicated patterns to implement efficiently (threads handling).
- Role-Abstract reusable product: Abstract product defining operations.
- Role-Concrete reusable product: Implementation of reusable product with state.
- Role-Object pool: Caches instances of reusable product and provides them.
- Role-Client: Uses object pool to get instances of reusable product.


# Implementing an Object Pool:
- We start by creating class for object pool: A thread safe caching of objects should be done in pool. Methods to acquire and release objects should be provided and pool should reset cached objects before giving them out.
- The reusable object must provide methods to reset its state upon release by code.
- We have to decide whether to create new pooled objects when pool is empty pr to wait until an object becomes available, this choice is influenced by whether the object is tied to a fixed number of eternal resources.


# Design considerations: 
- Resetting object state should not be costly operation otherwise you may end up losing our performance savings.
- Pre-caching objects meaning creating objects in advanced can be helpful as it won’t slow down the code using these objects. However, it may add up start time and memory consumption.
- Object pool synchronization should consider the reset time needed and avoid resetting in a synchronized context, if possible, because the resting will block the client from acquiring the object.
- Object pool can be parameterized to cache and return multiple objects and the acquire method can provide selection criteria. So, we can have a pool with different object types.
- Pooling objects is only beneficial if they involve costly initialization because of initialization of external resource like a connection or a thread. Don’t pool objects just to save memory, unless you are running into out of memory issues.
- Do not pool long lived objects or only to save frequent call to new. Pooling may negatively impact performance in such cases.

# Pitfalls:
- Successful implementation on correct use by the client code. Releasing objects back to pool can be vital for correct working.
- The reusable object needs to take care of resetting its state in efficient way. Some may not be suitable for pooling due to this requirement.
- Difficult to use in refactoring legacy code as the client code and reusable object both need to be aware of the object pool.
- You have to decide what happens when pool is empty and there is a demand for the object. You can either wait for an object to become free or create a new object. Both options have issues. Waiting can have sever negative impact on performance.
- If you create new objects when code asks for an object and none are available, then you have to do additional work to maintain of trim the pool size or else you will end up with very large pool.