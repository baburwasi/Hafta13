package Search1;
public class Search1 {
	public static void main (String []args) {
		int [] numbers = {65,78,26,90,53};
		
		
		int index =indexOf(numbers,90);
		
		if (index!=-1)
			System.out.println("Elemanýn indeksi:"+index);
		
		else 
			System.out.println("Eleman bulunamadý");
	}
	
	public static int indexOf(int []numbers,int target) {
		for (int i =0;i<numbers.length;i++) {
			if (numbers[i]==target)
				return i;
		}
		return -1;
			
	}

}
