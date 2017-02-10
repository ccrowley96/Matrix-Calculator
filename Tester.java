import java.io.IOException;
import java.util.Scanner;


public class Tester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two 3x3 square matrices to perform matrix calculation tests\n\n"
				+ "Tests: Determinant, Addition, Subtraction, Transpose, Matrix Multiplication\n"
				+ "Scalar Multiplication, File Read, File Write, Matrix Inverse\n");
		Matrix m = new Matrix();
		Matrix n = new Matrix();
		System.out.println("Determinant of input matrix (1): "+m.determinant());
		System.out.println("Determinant of input matrix (2): "+n.determinant());
		Matrix result = m.add(n);
		result.printConsole("Matrices Added");
		result = m.subtract(n);
		result.printConsole("Matrices Subtracted");
		result = m.transpose();
		result.printConsole("Matrix (1) Transposed");
		result = m.multiply(n);
		result.printConsole("Matrices Multiplied");
		System.out.println("Example of scalar multiplication\nEnter scalar value to multiply last result by");
		double scalar = in.nextDouble();
		result = result.multiply(scalar);
		result.printConsole("Scalar Multiplication");
		
		m = new Matrix("example.mat");
		m.printConsole("Matrix from file");
		System.out.println("Utilized toString() Method to format print");
		System.out.println("Enter Array to write to 'output.txt'");
		m = new Matrix();
		m.print("output.txt");
		
		System.out.println("Enter Square Matrix to find inverse: 1x1,2x2,3x3");
		Matrix x = new Matrix();
		Matrix z = x.inverse();
		z.printConsole("Inverse Matrix");
		
		System.out.println("\n\n---------Tests Complete--------\n\n");
		
		
		
	}

}
