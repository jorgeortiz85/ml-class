ml-class
========

[Stanford's Machine Learning class][0] is open to enrollment from the public.

I'll be using [Scalala][1], a linear algebra library for Scala, to work through the exercises and assignments for this class. I'll make as much work as possible available here, within the bounds of the Honor Code.

Why Scalala?
------------

Scalala is a Matlab-like (and Octave-like) library for linear algebra and plotting in Scala. The similarities to Matlab/Octave will make it easy to port the course content from Octave to Scalala. The upside is access to the full power of a general-purpose programming language (Scala), a rock-solid and production-ready runtime environment (the JVM), and high-performance numerical libraries (MTJ and BLAS). While these advantages may not be significant for the course itself, they would certainly come in handy for real-world applications of the machine learning concepts learned in the class.

Prerequisites
-------------

The only prerequisite is installing sbt 0.11 on your machine. If you do not already have sbt 0.11 installed, [follow these instructions][2] to install it. sbt will take care of downloading Scala, Scalala, and whatever other libraries are necessary to use this code.

Usage
-----

Once sbt is installed, use `sbt console` to get access to a Scala console. Once in the Scala console, use `:load Imports.scala` to import the Scalala libraries. You now have a fully featured Scalala console with which to work.

The files in this project are presented as console sessions. You can load them into the console if you wish (e.g., `:load LinearAlgebraReview/1-MatricesAndVectors.scala`), but it's probably more useful to read through the transcript line-by-line as you're watching the corresponding lecture video. I'd encourage you to type in each line into your own console session as you watch.

Gotchas
-------

### 1-indexed vs 0-indexed

The lectures, Matlab, and Octave use 1-based indexes for vectors and matrices, whereas Scalala uses 0-based indexes. This will probably be a frequent source of mistakes when porting course materials to Scalala.

### Int vs Double

Java (and thus Scala) has different primitive types for Ints vs Doubles. Scalala usually does the Right Thing when it comes to Ints vs Doubles, but there's a few corner cases to be aware of:

## constructing matrices

Mixing Ints and Doubles in a Matrix constructor (e.g., `Matrix((1, 1.0))`) will result in a cryptic message: `error: V is not a scalar value`. The fix is to use Doubles everywhere (e.g., `Matrix((1.0, 1.0))`).

## integer division

Additions, multiplications, etc between Ints and Doubles will be upcast appropriately. However, division of Ints by Ints will NOT be upcast, and will instead result in integer division, which is probably not what you want.

### Vector/Matrix operations on Scalars

Trying to use Vector/Matrix operations on scalars (e.g., `scalar * vector` or `scalar * matrix`) can fail because scalars are defined in Scala and the operators in the standard library can clash with those defined by Scalala. There are two work-arounds: use the colon-prefixed operator (e.g., `scalar :* matrix`) or flip the order of the operands (e.g., `matrix * scalar`).

### Scalala Vector vs Scala Vector

If you're familiar with Scala, you'll know there's a collection type called scala.collection.immutable.Vector. This is not related at all to Scalala's scala.tensor.mutable.Vector type. In this project, we'll use "Vector" to mean the latter type unless otherwise noted.

[0]: http://www.ml-class.org/
[1]: https://github.com/scalala/Scalala
[2]: https://github.com/harrah/xsbt/wiki/Setup
