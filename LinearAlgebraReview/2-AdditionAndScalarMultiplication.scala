:load Imports.scala

Matrix((1, 0), (2, 5), (3, 1)) + Matrix((4, 0.5), (2, 5), (0, 1))
// <console>:36: error: V is not a scalar value
//               DenseMatrix((1, 0), (2, 5), (3, 1)) + DenseMatrix((4, 0.5), (2, 5), (0, 1))
//                                                                ^

// OOPS! This is a cryptic error, but it means we're trying to mix Ints and Doubles
// in the same matrix. If we force all our Ints to be doubles, then we're fine.

Matrix((1, 0), (2, 5), (3, 1)) + Matrix((4.0, 0.5), (2.0, 5.0), (0.0, 1.0))
// res1: scalala.tensor.dense.DenseMatrix[Double] = 
//  5.00000   0.500000  
//  4.00000   10.0000   
//  3.00000   2.00000   

Matrix((1, 0), (2, 5), (3, 1)) + Matrix((4.0, 0.5), (2.0, 5.0))
// scalala.tensor.domain.DomainException: Incompatible domain: TableDomain(2,2) for TableDomain(3,2)
//  at scalala.tensor.DomainFunction$class.checkDomain(DomainFunction.scala:54)
//  at scalala.tensor.dense.DenseMatrix.checkDomain(DenseMatrix.scala:45)
//  at scalala.tensor.Tensor$$anon$15.joinEitherNonZero(Tensor.scala:612)
//  at scalala.tensor.Tensor$$anon$4.apply(Tensor.scala:688)
//  at scalala.operators.NumericOps$class.$colon$plus(Ops.scala:39)
//  at scalala.tensor.dense.DenseMatrix.$colon$plus(DenseMatrix.scala:45)
//  at scalala.operators.NumericOps$class.$plus(Ops.scala:121)
//  at scalala.tensor.dense.DenseMatrix.$plus(DenseMatrix.scala:45)
//  at .<init>(<console>:36)

3 * Matrix((1, 0), (2, 5), (3, 1))
// <console>:36: error: overloaded method value * with alternatives:
//   (x: Double)Double <and>
//   (x: Float)Float <and>
//   (x: Long)Long <and>
//   (x: Int)Int <and>
//   (x: Char)Int <and>
//   (x: Short)Int <and>
//   (x: Byte)Int
//  cannot be applied to (scalala.tensor.dense.DenseMatrix[Int])
//               3 * DenseMatrix((1, 0), (2, 5), (3, 1))
//                 ^

// OOPS! Ints don't know how to multiply themselves against matrices.
// We can use the :* operator, or we can flip the order of the operands.

val A = 3 :* Matrix((1, 0), (2, 5), (3, 1))
// A: scalala.tensor.dense.DenseMatrix[Int] = 
// 3  0   
// 6  15  
// 9  3   

val A = Matrix((1, 0), (2, 5), (3, 1)) * 3
// A: scalala.tensor.dense.DenseMatrix[Int] = 
// 3  0   
// 6  15  
// 9  3   

A.domain
// res5: scalala.tensor.domain.TableDomain = TableDomain(3,2)

Matrix((4, 0), (6, 3)) / 4
// res6: scalala.tensor.dense.DenseMatrix[Int] = 
// 1  0  
// 1  0  

// OOPS! We have to be careful with Java's integer division. If we force
// 4 to be a double we get the expected result.

Matrix((4, 0), (6, 3)) / 4.0
// res7: scalala.tensor.dense.DenseMatrix[Double] = 
//  1.00000   0.00000   
//  1.50000   0.750000  

val x = Vector(1, 4, 2) * 3 + Vector(0, 0, 5) - Vector(3, 0, 2) / 3.0
// x: scalala.tensor.dense.DenseVectorCol[Double] = 
//  2.00000
//  12.0000
//  10.3333

x.domain
// res9: scalala.tensor.domain.IndexDomain = IndexDomain(3)
