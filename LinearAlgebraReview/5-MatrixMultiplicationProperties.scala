:load Imports.scala

3 * 5 == 5 * 3
// res0: Boolean = true

val m1 = Matrix((1, 1), (0, 0))
// m1: scalala.tensor.dense.DenseMatrix[Int] = 
// 1  1  
// 0  0  

val m2 = Matrix((0, 0), (2, 0))
// m2: scalala.tensor.dense.DenseMatrix[Int] = 
// 0  0  
// 2  0  

m1 * m2
// res1: scalala.tensor.dense.DenseMatrix[Int] = 
// 2  0  
// 0  0  

m2 * m1
// res2: scalala.tensor.dense.DenseMatrix[Int] = 
// 0  0  
// 2  2  

m1 * m2 == m2 * m1
// res3: Boolean = false

(3 * 5) * 2 == 3 * (5 * 2)
// res4: Boolean = true

1 * 8 == 8 * 1
// res5: Boolean = true

8 * 1 == 8
// res6: Boolean = true

Matrix.eye[Int](2, 2)
// res7: scalala.tensor.dense.DenseMatrix[Int] = 
// 1  0  
// 0  1  

Matrix.eye[Int](3, 3)
// res8: scalala.tensor.dense.DenseMatrix[Int] = 
// 1  0  0  
// 0  1  0  
// 0  0  1  

Matrix.eye[Int](4, 4)
// res9: scalala.tensor.dense.DenseMatrix[Int] = 
// 1  0  0  0  
// 0  1  0  0  
// 0  0  1  0  
// 0  0  0  1

val I = Matrix.eye[Int](2, 2)
// I: scalala.tensor.dense.DenseMatrix[Int] = 
// 1  0  
// 0  1  

m1 * I == I * m1
// res10: Boolean = true

I * m1 == m1
// res11: Boolean = true
