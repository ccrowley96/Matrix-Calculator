# Matrix-Calculator
###Java matrix calculator made by Cory Crowley###

##Methods:##

###Constructors:###
* Constructor to create a matrix given m and n
* Constructor to read a matrix from a user using terminal or popups 
* Constructor to read a matrix from a .mat file. The file starts with the size of the matrix using two integers (m and n) separated by a comma. 
###Getters###
* int getN() : Getters methods for n.
* int getM() : Getters methods for m.
* double get(int i, int j) : A method to get the value stored in i and j entry of the matrix
###Operations:###
* Matrix add(Matrix m) : Add this matrix to matrix m and return the result
* Matrix subtract(Matrix m) : Subtract matrix m from  this matrix and return the result
* Matrix multiply(Matrix m) : Matrix multiplication between this matrix and matrix m. Return the result.
* Matrix multiply(double x) : Multiply scalar x by this matrix and return the result.
* Matrix divide(Matrix m) : Matrix division of this matrix on matrix m. Return the result.
* double determinant() : return the determinant of the current matrix (matrix has to be square and of size 1x1, 2x2 or 3x3)
* Matrix inverse() : return the inverse of the current matrix (matrix has to be square and of size 1x1, 2x2 or 3x3)
* boolean isSquare() : return true if the matrix is square
* Matrix transpose() : return the transpose of the current matrix
###Other###
* String toString(): to return a string representation of the matrix. 
* void print(String filename): create a file and write the matrix in it. 
* Matrix identity(int size): Static method to create an Identity square matrix of size size
