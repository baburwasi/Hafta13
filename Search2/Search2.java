package Search2;
public class Search2 {
public static void main (String []args) {
	int [] numbers = {65,78,26,90,53};
	int []numbers2= {11,18,23,35,47};
	
	int index =indexOf2(numbers2,23);
	
	if (index!=-1)
		System.out.println("Elemanın indeksi:"+index);
	
	else 
		System.out.println("Eleman bulunamadı");
}
//target=aradıgımız deger
public static int indexOf2(int []numbers,int target) {
	int i=0;
	while(i<numbers.length && numbers[i]<=target) {
		if (numbers[i]==target)
			return i;
	}
	return -1;
}
public static int indexOf(int [] numbers,int target) {
	

for (int i =0;i<numbers.length;i++) {
		if (numbers[i]==target)
			return i;			
	}
	return -1;
}
}
