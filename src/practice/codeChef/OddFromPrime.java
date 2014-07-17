/* you will provide an odd number greater than 61 and the program will represent that odd number using three prime x,y,z numbers such that:
 * 
 * x+y*y+z*z*z=odd number
 * 
 * if no such numbers exist then program will return 0 0 0
 * 
 * */


package practice.codeChef;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddFromPrime {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> result=new ArrayList<Integer>();
		System.out.println("Enter an odd number > 65");
		int num=scan.nextInt();
		double temp=(float)num;
		if(num<65){
			System.out.println("please enter an odd number greater than 65");
			System.exit(0);
		}
		List<Integer> list=null;
		try{
			list=new GeneratePrimeNumbers().getPrimeNumbers(num);
		}catch(InvalidInput e){
			System.out.println(e);
		}
		for(int i=0;i<list.size();i++){
			if(Math.pow(list.get(i),3)>temp){
				result.add(list.get(i-1));
				temp=temp-Math.pow(list.get(i-1),3);
				break;
			}
		}
		for(int i=0;i<list.size();i++){
			if(Math.pow(list.get(i),2)>temp){
				if(i!=0){
					result.add(list.get(i-1));
					temp=temp-Math.pow(list.get(i-1),2);
				}
				break;
			}
		}
		for(int i=0;i<list.size();i++){
			if(list.get(i)==temp){
				result.add(list.get(i));
				temp=temp-list.get(i);
				break;
			}
		}
		//System.out.println(temp);
		if(result.size()==3){
			for(int i=result.size()-1;i>=0;i--)
				System.out.print(result.get(i) + " ");
		}
		else{
			System.out.println("0 0 0");
		}
		
		scan.close();

	}

}
