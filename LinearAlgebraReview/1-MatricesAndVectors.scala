:load Imports.scala

val A = Matrix((1402, 191), (1371, 821), (949, 1437), (147, 1448))
// A: scalala.tensor.dense.DenseMatrix[Int] = 
// 1402  191   
// 1371  821   
// 949   1437  
// 147   1448

val B = Matrix((1, 2, 3), (4, 5, 6))
// B: scalala.tensor.dense.DenseMatrix[Int] = 
// 1  2  3  
// 4  5  6  

A.domain
// res2: scalala.tensor.domain.TableDomain = TableDomain(4,2)

B.domain
// res3: scalala.tensor.domain.TableDomain = TableDomain(2,3)

val A = Matrix((1402, 191), (1371, 821), (949, 1437), (147, 1448))
// A: scalala.tensor.dense.DenseMatrix[Int] = 
// 1402  191   
// 1371  821   
// 949   1437  
// 147   1448

def Aij(i: Int, j: Int) = A(i, j)
// Aij: (i: Int, j: Int)Int

A(1, 1)
// res4: Int = 821

// OOPS! Scalala is 0-indexed, not 1-indexed

A(0, 0)
// res5: Int = 1402

A(0, 1)
// res6: Int = 191

A(2, 1)
// res7: Int = 1437

A(3, 0)
// res8: Int = 147

A(3, 2)
// scalala.tensor.domain.DomainException: Index (3,2) out of range.  Size is 4x2
//  at scalala.tensor.MatrixLike$class.checkKey(Matrix.scala:52)
//  at scalala.tensor.dense.DenseMatrix.checkKey(DenseMatrix.scala:45)
//  at scalala.tensor.dense.DenseMatrix.index(DenseMatrix.scala:68)
//  at scalala.tensor.dense.DenseMatrix.apply(DenseMatrix.scala:82)
//  at .<init>(<console>:37)

val y = Vector(460, 232, 315, 178)
// y: scalala.tensor.dense.DenseVectorCol[Int] = 
// 460
// 232
// 315
// 178

y.domain
// res10: scalala.tensor.domain.IndexDomain = IndexDomain(4)

def yi(i: Int) = y(i)
// yi: (i: Int)Int

y(0)
// res11: Int = 460

y(1)
// res12: Int = 232

y(2)
// res13: Int = 315
