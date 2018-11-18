package aasignmen2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NewArrayList extends ArrayList{
	int array[]=new int[10];
    int l=array.length;
	int temp[];
	Scanner sc=new Scanner(System.in);
	
	
	public int size() {
		int l=(int)((array.length)*1.5);
		return l;
	}
	
public void add(int a) {
	
	for (int i=0;i<l;i++) {
		
		 if((array[i]!=0)&&(i==l-1)) {
			 l=array.length;
			 temp=new int[l];
			 for(int j=0;j<array.length;j++) {
					temp[j]=array[j];
					}
			 array=new int[size()];
		 
			    for(int j=0;j<l;j++) {
						array[j]=temp[j];
						}
			    array[l]=a;
		 }  
		  else if (array[i]==0) {
	    	array[i]=a;
	    	}
			 
             }
	}



public void delete(int r) {
	int i;
	for(i=0;i<l;i++) {
		 if(array[i]==r)
			 break;
	}
	if(i<l){
		l=l-1;
		for(int j=i;j<l-1;j++){
		    array[j]=array[j+1];
				 }
	}
	
}


void printElements() {
	l=array.length;
	//for(int i=0;i<l;i++) {
		System.out.print(l);
	//}
}


}
	
public class a10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int element;
		NewArrayList a=new NewArrayList();
		
			System.out.println("enter 10 elements");
			for(int i=0;i<10;i++) {
			element=a.sc.nextInt();
			a.add(element);
			
			}
			a.printElements();
			a.add(20);
			a.delete(3);
			a.printElements();
	}

}


		
		
	