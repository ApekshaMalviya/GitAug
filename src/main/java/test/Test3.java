package test;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {54,78,10,20,63,96,74,25};
		int max=a[0];
		
		for(int i=1;i<=a.length;i++ ) {
			
		if(max<a[i]) {
			max=a[i];
		}
			
		}
		System.out.println("max number is"+max);
	}

}
