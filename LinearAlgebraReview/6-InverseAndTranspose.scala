:load Imports.scala

3 * math.pow(3, -1) == 1.0
// res0: Boolean = true

12 * math.pow(12, -1) == 1.0
// res1: Boolean = true

math.pow(0, -1)
// res2: Double = Infinity

val A = Matrix((3, 4), (2, 16))
// A: scalala.tensor.dense.DenseMatrix[Int] = 
// 3  4   
// 2  16  

val A_inv = Matrix((0.4, -0.1), (-0.05, 0.075))
// A_inv: scalala.tensor.dense.DenseMatrix[Double] = 
//  0.400000   -0.100000   
// -0.0500000   0.0750000  

A * A_inv
// res3: scalala.tensor.dense.DenseMatrix[Double] = 
//  1.00000  -5.55112e-17  
//  0.00000   1.00000      

A_inv * A
// res4: scalala.tensor.dense.DenseMatrix[Double] = 
//  1.00000       0.00000  
// -2.77556e-17   1.00000  

inv(A)
// res5: scalala.tensor.dense.DenseMatrix[Double] = 
//  0.400000   -0.100000   
// -0.0500000   0.0750000  

val inverseOfA = inv(A)
// inverseOfA: scalala.tensor.dense.DenseMatrix[Double] = 
//  0.400000   -0.100000   
// -0.0500000   0.0750000  

A * inverseOfA
// res6: scalala.tensor.dense.DenseMatrix[Double] = 
//  1.00000   0.00000  
//  0.00000   1.00000  

inverseOfA * A
// res7: scalala.tensor.dense.DenseMatrix[Double] = 
//  1.00000   0.00000  
//  0.00000   1.00000  

val A = Matrix((1, 2, 0), (3, 5, 9))
// A: scalala.tensor.dense.DenseMatrix[Int] = 
// 1  2  0  
// 3  5  9  

val A_t = A.t
// A_t: scalala.tensor.mutable.Matrix[Int] = 
// 1  3  
// 2  5  
// 0  9  

A.domain
// res8: scalala.tensor.domain.TableDomain = TableDomain(2,3)

A.t.domain
// res9: scalala.tensor.domain.TableDomain = TableDomain(3,2)

A.t(0, 1) == A(1, 0)
// res10: Boolean = true

A.t(2, 1) == A(1, 2)
// res11: Boolean = true
