:load Imports.scala

val A = Matrix((1, 3, 2), (4, 0, 1)) * Matrix((1, 3), (0, 1), (5, 2))
// A: scalala.tensor.dense.DenseMatrix[Int] = 
// 11  10  
// 9   14  

A.domain
// res1: scalala.tensor.domain.TableDomain = TableDomain(2,2)

Matrix((1, 3), (2, 5)) * Matrix((0, 1), (3, 2))
// res2: scalala.tensor.dense.DenseMatrix[Int] = 
// 9   7   
// 15  12  

val data = Matrix((1, 2104), (1, 1416), (1, 1534), (1, 852))
// data: scalala.tensor.dense.DenseMatrix[Int] = 
// 1  2104  
// 1  1416  
// 1  1534  
// 1  852   

val hypotheses = Matrix((-40.0, 200.0, -150.0), (0.25, 0.1, 0.4))
// hypotheses: scalala.tensor.dense.DenseMatrix[Double] = 
// -40.0000    200.000   -150.000   
//  0.250000   0.100000   0.400000  

data * hypotheses
// res3: scalala.tensor.dense.DenseMatrix[Double] = 
//  486.000   410.400   691.600  
//  314.000   341.600   416.400  
//  343.500   353.400   463.600  
//  173.000   285.200   190.800  
