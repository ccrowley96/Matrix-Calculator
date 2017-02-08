import java.io.IOException;
import java.util.Scanner;


public class Tester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Example of Addition & Subtraction -- Enter Square Matrices");
		Matrix m = new Matrix();
		Matrix n = new Matrix();
		Matrix result = m.add(n);
		result.printConsole("Matrices Added");
		result = m.subtract(n);
		result.printConsole("Matrices Subtracted");
		System.out.println("Example of scalar multiplication\nEnter scalar value to multiply result by");
		double scalar = in.nextDouble();
		result = result.multiply(scalar);
		result.printConsole("Scalar Multiplication");
		System.out.println("Example of Matrix Multiplication -- \nEnter Matrices with same inner size AxB *BxC");
		m = new Matrix();
		n = new Matrix();
		result = m.multiply(n);
		result.printConsole("Matrices Multiplied");
		System.out.println("Enter Matrix to transpose");
		m = new Matrix();
		result = m.transpose();
		result.printConsole("Matrix Transposed");
		System.out.println("Example of determinant, Enter square matrix (1x1,2x2,3x3):");
		m = new Matrix();
		System.out.println("Determinant of input matrix: "+m.determinant());
		m = new Matrix("MatrixData.txt");
		m.printConsole("Matrix from file");
		System.out.println("Utilized toString() Method to format print");
		System.out.println("Enter Array to write to 'output.txt'");
		m = new Matrix();
		m.print("output.txt");
		
		System.out.println("\n\n---------Tests Complete--------\n\n");
		
		Matrix m = new Matrix();
		Matrix x = m.inverse();
		x.printConsole("Inverse Matrix");
		
	}

}
