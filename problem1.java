package project_euler;

public class problem1 {
	public static void main(String[] args) {
		System.out.print(multip_3_5());
	}
	
	public static int multip_3_5() {
		int count = 3;
		int toplam = 0;
		while(count < 1000) {
			if(count%3 == 0 && count%5 == 0) {
				toplam +=count;
			}else if(count%3 == 0) {
				toplam +=count;
			}else if(count%5 == 0) {
				toplam += count;
			}
			count++;
		}
		return toplam;
	}
		
}
