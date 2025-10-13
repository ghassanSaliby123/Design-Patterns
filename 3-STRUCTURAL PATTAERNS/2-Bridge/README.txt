# Bridge design pattern
- Our implementations and abstractions are generally coupled to each other in normal inheritance.
- Using bridge pattern, we can decouple then so they can both change without affecting each other.
- We achieve this feat by creating t2o separate inheritance hierarchies; one for implementation and another for abstraction.
- We use composition to bridge these two hierarchies.
- Role-Abstraction: Defines abstraction interface and has reference to implementor.
- Role-Refine Abstraction: More specified abstraction.
- Role-Implementor: Base interface for implementation classes where methods are unrelated t abstraction and typically represent smaller steps that are needed.
- Role-Concrete Implementor: Implements implementor methods.


# Implementing Bridge:
- We start by defining out abstraction as needed by client.
- We determine common base operations and define them in abstraction.
- We can optionally also define a refined abstraction and provide more specialised operations.
- Then we define our implementor next. Implementor methods do not have to match with abstractor. However, abstraction can carry out its work by using implementor methods.
- Then we write one or more concrete implementor providing implementation.
- Abstractions are created by composing them with an instance of concrete implementor which is used by methods in abstraction. 

# Design considerations:
- Bridge provides great extensibility by allowing us to change abstraction and implementor independently. You can build and package them separately to modularise overall system.
- By using abstraction factory pattern to create abstraction objects with correct implementation you can decouple concrete implementors from abstraction.


# Pitfalls:
- It is complex to understand and implement bridge design pattern.
- You need to have a well thought out and comprehensive design before you can decide to use it.
- Needs to be designed up front. Adding bridge to legacy code is difficult. Even for ongoing project adding bridge ate later time in development may require fair amount of rework.