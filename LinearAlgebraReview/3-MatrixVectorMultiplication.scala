:load Imports.scala

val A = Matrix((1, 3), (4, 0), (2, 1)) * Vector(1, 5)
// A: scalala.tensor.dense.DenseVectorCol[Int] = 
// 16
// 4
// 7

A.domain
// res1: scalala.tensor.domain.IndexDomain = IndexDomain(3)

val A = Matrix((1, 2, 1, 5), (0, 3, 0, 4), (-1, -2, 0, 0))
// A: scalala.tensor.dense.DenseMatrix[Int] = 
// 1   2   1  5  
// 0   3   0  4  
// -1  -2  0  0  

val x = Vector(1, 3, 2, 1)
// x: scalala.tensor.dense.DenseVectorCol[Int] = 
// 1
// 3
// 2
// 1

A.domain
// res2: scalala.tensor.domain.TableDomain = TableDomain(3,4)

x.domain
// res3: scalala.tensor.domain.IndexDomain = IndexDomain(4)

val y = A * x
// y: scalala.tensor.dense.DenseVectorCol[Int] = 
// 14
// 13
// -7

y.domain
// res4: scalala.tensor.domain.IndexDomain = IndexDomain(3)

def h(x: Int) = -40 + 0.25*x
// h: (x: Int)Double

val data = Matrix((1, 2104), (1, 1416), (1, 1534), (1, 852))
// data: scalala.tensor.dense.DenseMatrix[Int] = 
// 1  2104  
// 1  1416  
// 1  1534  
// 1  852   

val parameters = Vector(-40, 0.25)
// parameters: scalala.tensor.dense.DenseVectorCol[Double] = 
// -40.0000
//  0.250000

val prediction = data * parameters
// prediction: scalala.tensor.dense.DenseVectorCol[Double] = 
//  486.000
//  314.000
//  343.500
//  173.000
