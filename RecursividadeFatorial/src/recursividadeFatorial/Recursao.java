package recursividadeFatorial;

public class Recursao {
	
	long total;
	
	public long contar(long n) {
		
		if(n == 0) {
			return 1;
		}
		
		System.out.println("Pilha -> " + n);
		
		total = n * contar(n-1);
		
		System.out.println("Desmonatagem da pilha -> " + total);
		
		return total;
	}
}