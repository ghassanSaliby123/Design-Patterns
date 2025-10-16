# Decorator design pattern
- When we want to enhance behaviour of our existing object dynamically as and when required then we can use decorator design pattern.
- Decorator wraps an object within itself and provides same interface as the wrapped object. So, the client of the original object doesn’t need to change.
- A decorator provides alternative to subclassing for extending functionality of existing classes.
- Role-Component: Defines interface used by client.
- Role-Concrete Component: Plain object which can be decorated.
- Role-Decorator: Provides additional behaviour and maintains reference to component.

# Implementing Decorator:
- We start without component which defines interface needed r already used by client.
- Concrete component implements the component.
- We define our decorator. Decorator implements component and needs reference to concrete component.
- In decorator methods we provide additional behaviour on top that provided by concrete component instance.
- Decorator can be abstract as well and depends on subclassed to provided functionality.


# Design considerations:
- Since we have decorators and concrete classed extending from common component, avoid large state in this class as decorators may not need all that state.
- Pay attention to equals and hashCode methods of decorator. When using decorators, you have to decide if the decorated object is equal to same instance without decorator.
- Decorators support recursive composition, and so this pattern lends itself to creation of lots of small objects that add just a little bit functionality, Code using these objects   becomes difficult to debug.
- Decorators are more flexible and powerful than inheritance, Inheritance is static, but decorators allow you to dynamically compose behaviour using objects at runtime.
- Decorators should act like additional skin over you object. They should add helpful small behaviours to objects’ original behaviour. Do not change meaning of operations.


# Pitfalls:
- Often results in large number of classes being added to system, where each class adds a small amount of functionality. You often end up with lots of objects, one nested inside another and so on.
- Decorator is not a replacement of inheritance, think of decorators as a thin skin over exiting object that offers a small additional behaviour.