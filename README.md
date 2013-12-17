monoid
======

A Java implementation of the [Monoid](http://en.wikipedia.org/wiki/Monoid) algebraic structure.

# APIs

 * [0.0.1](http://trudeau.github.io/monoid/0.0.1/)

# Usage

A `org.nnsoft.trudeau.math.monoid.Monoid<E>` is a [Monoid](http://en.wikipedia.org/wiki/Monoid) model and offers the following methods:

 * `E identity()` that returns the identity value;

 * `E append( E e1, E e2 )` that returns the result of the associative binary operation between two elements of the monoid;

 * `E inverse( E element )` that returns the inverse of the input element.

A `org.nnsoft.trudeau.math.monoid.OrderedMonoid<E>` is a `org.nnsoft.trudeau.math.monoid.Monoid<E>` able to order the elements.

## Known default Monoids

 * `org.nnsoft.trudeau.math.monoid.primitive.BigDecimalWeightBaseOperations`
 * `org.nnsoft.trudeau.math.monoid.primitive.BigIntegerWeightBaseOperations`
 * `org.nnsoft.trudeau.math.monoid.primitive.DoubleWeightBaseOperations`
 * `org.nnsoft.trudeau.math.monoid.primitive.FloatWeightBaseOperations`
 * `org.nnsoft.trudeau.math.monoid.primitive.IntegerWeightBaseOperations`
 * `org.nnsoft.trudeau.math.monoid.primitive.LongWeightBaseOperations`