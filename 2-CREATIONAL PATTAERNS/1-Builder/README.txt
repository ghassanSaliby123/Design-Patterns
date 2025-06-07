# Builder design pattern
- Use this pattern when we have a complex process to construct an object which requires multiple steps.
- In builder we remove the logic related to object construction from the client code.
- Role-Product: Final complex object that we want to create.
- Role-Builder: Provides interface for creating parts of the product.
- Role-Concrete Builder: Constructs parts and assembles final product and keeps track of product it creates.
- Role-Director: Uses builder to construct object and it knows the steps and their sequence to build the product.

# Implementing a builder: We start by creating a builder that is:
- Identify the parts of the products and provide methods to create parts.
- Provides a method to assemble or build the product.
- Provides a way to get fully object out. Optionally build can keep reference to a product which it has built so the same can be returned in future.
- A director can be a separate class, or client can play the role of director.
