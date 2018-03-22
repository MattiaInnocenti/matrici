package matrici;

public class MatriceTestMain {

	public static void main(String[] args) {
		double[][] m1 = new double[][] { { 1, 0, 0 }, { 0, 1, 0 },{ 0, 0, 1 } };
		double[][] m2 = new double[][] { { 2, 1, 0 }, { 0, 1, 3 },{ 0, 0, 1 } };
		double[][] res = MatriceLib.prodottoMatrici(m1, m2);
		
		MatriceLib.stampaMatrice(res);
	}

}
