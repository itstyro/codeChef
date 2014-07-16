package practice.codeChef;

public class TestGeneratePrimeNumbers {

	public static void main(String[] args) {
		
		GeneratePrimeNumbers prime=new GeneratePrimeNumbers();
		try{
			System.out.println(prime.getPrimeNumbers(100));
		}catch(InvalidInput e){
			System.out.println(e.toString());
		}

	}

}
