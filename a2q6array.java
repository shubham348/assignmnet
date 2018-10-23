package assignment2;

public class a2q6array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,1,1,1,0,0,1,0};
int l=a.length;
int k=0;
for(int i=0;i<l;i++){
	if(a[i]==0){
		 k++;
	}
}
for(int i=0;i<l;i++){
	if(k>0){
		a[i]=0;
		System.out.print(a[i]);
	k--;
	}
	else{
		a[i]=1;
		System.out.print(a[i]);
	}
	
}

	}

}
