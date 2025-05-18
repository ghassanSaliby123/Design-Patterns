# Interface-segregation-principle
- Clients should not be forced to depend upon interfaces that they do not use.
- Sings to have interface pollution:
1- Classes have empty methods implementation.
2- Methods implementations throw UnsupportedOperationException (or similar).
3- Methds implementations return null or default/dummy values.
