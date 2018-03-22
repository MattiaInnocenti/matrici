package matrici;

public class MatriceLib {
	
	public static double[][] sommaMatrici(double[][] a, double[][] b){
		if(!(a.length == b.length && a[0].length == b[0].length))
			return null;
		
		double[][] res = new double[a.length][a[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				res[i][j] = a[i][j] + b[i][j];
			}
		}
		return res;
	}
	
	public static void stampaMatrice(double[][] a) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				sb.append(a[i][j]);
				if(j == a[0].length-1)
					sb.append("\n");
				else 
					sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}
	
	public static double[][] prodottoMatrici(double[][] a, double[][] b){
		if(!(a[0].length == b.length))
			return null;
		
		double[][] res = new double[a.length][b[0].length];
		
		for (int i = 0; i < res.length; i++) {
			for(int j = 0; j < res[0].length; j++) {
				for(int k = 0; k < b.length; k++) {
					res[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return res;
	}
	
}
