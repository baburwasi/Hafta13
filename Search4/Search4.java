package Search4;
public class Search4 {
	public static void main (String []args) {
		int [] numbers = {65,4,78,26,90,53};
		int []numbers2= {11,4,18,23,35,47};
		
		int index =binarySearchR(numbers2,35,0,numbers2.length-1);
		
		if (index!=-1)
			System.out.println("Eleman�n indeksi:"+index);
		
		else 
			System.out.println("Eleman bulunamad�");
}
public static int binarySearchR(int []numbers,int target,int min,int max) {
	
	if (min>max)
		return -1;
	
	else {
		int mid =(min+max)/2;
	
		if (numbers[mid]==target)
return mid ;
		else if (numbers[mid]<target)
			return binarySearchR(numbers,target,mid+1,max);
					
			else 
				return binarySearchR(numbers,target,min,mid-1);
	
	}
	








}
}