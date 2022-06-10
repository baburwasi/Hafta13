package Search3;
public class Search3 {
	public static void main (String []args) {
		int [] numbers = {65,78,26,90,53};
		int []numbers2= {11,18,23,35,47};
		
		int index =binarySearch(numbers2,35);
		
		if (index!=-1)
			System.out.println("Elemanın indeksi:"+index);
		
		else 
			System.out.println("Eleman bulunamadı");
		
		
	}

	public static int binarySearch(int []numbers,int target) {
		int min =0;
		int max =numbers.length-1;
	
		while (min<=max) {
			int mid =(max+min)/2;
			if (numbers [mid]==target) 
				return mid ;
			
			else if (numbers[mid]<target) 
				

min =mid+1;
			else 
				max =mid-1;
		}
			return -1;
		
}}