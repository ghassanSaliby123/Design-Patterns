# Composite design pattern
- We have a part-whole relationship or hierarchy of objects, and we want to be able to treat all objects in this hierarchy uniformly.
- This is not a simple composition from object-oriented programming but a further enhancement to that principle.
- Think of composite pattern when dealing with tree structure of objects.
- Role-Component: Defines behaviour to all classes and includes methods to access children.
- Role-Leaf: Represents lead objects and behaviour of primitive objects.
- Role-Composite: Stores child components.
- Role-Client: Works with object hierarchy using component interface only.

# Implementing Composite:
- We start by creating an abstract class or interface for component.
- Component must declare all methods that are applicable to both leaf and composite.
- We have to choose who defines the children management operations, component or composite.
- Then we implement the composite. An operation invoked on composite is propagated to all its children.
- In lead nodes we have to handle the non-applicable operations like add/remove a child if they are defined in component.
- In the end. A composite pattern implementation will allow you to write algorithms without worrying about whether node is lead or composite.

# Design considerations:
- You can provide a method to access parent of a node. This will simplify traversal of the entire tree.
- You can define the collection field to maintain children in base component instead of composite but again that field has no use in lead class.
- If leaf object can be repeated in the hierarchy, then shared lead nodes ca be used to save memory and initialisation costs. But again, the number of nodes is major deciding factor as using a cache for small total number of nodes may cost more.
- Decision need to be made about where child management operations are defined, defining them on component provides transparency but lead nodes are forced to implement those methods. Defining them on composite is safer but client needs to be made aware of composite.
- Overall goal of design should be to make client code easier to implement when using composite. This is possible if client code can work with component interfaces only and doesn’t need to worry about leaf-composite distinction.

# Pitfalls:
- Difficult to restrict what is added to hierarchy. If multiple types of leaf nodes are present in system, the client code ends up doing runtime checks to ensure the operation is available on a node.
- Creating the original hierarchy can still be complex implementation especially if you are using caching reuse nodes and number of nodes are quite high.
