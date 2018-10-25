package assignment2;

public class wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int l=a.length;
		int i=0;
		System.out.println("The given array is:" );
		for ( i = 0; i <l; i++) {
			System.out.print(a[i]+" ");
		}
		i=0;
		while(i<l){
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			i=i+2;
		}
		System.out.println();
		System.out.println("new array is:" );
		for ( i = 0; i < l; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
