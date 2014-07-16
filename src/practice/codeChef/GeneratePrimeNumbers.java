package practice.codeChef;

import java.util.ArrayList;
import java.util.List;


public class GeneratePrimeNumbers {
	
	public List<Integer> getPrimeNumbers(int till) throws InvalidInput{
		
		List<Integer> primeNumbers=new ArrayList<Integer>();
		int flag=0;
		if(till>1){
			primeNumbers.add(2);
			for(int i=3;i<=till;i++){
				flag=0;
				for (Integer s : primeNumbers){
					if(i%s==0){
						flag=1;
						break;
					}
				}
				if(flag==0){
					primeNumbers.add(i);
				}
				
				
			}
			
		}else{
			throw new InvalidInput(till + " is not a valid input");
		}
		return primeNumbers;
		
	}

}
