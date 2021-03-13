package k_day14constructorstatickeywordarrays;

import java.util.Arrays;

public class MyClass {

	public static void main(String[] args) {
		
		double d [] = new double[3];
		d[0]=2.3;
		d[1]=3.5;
		d[2]=9.8;
		
		d[2]=6.7;
		System.out.println(d[2]);
		for(int i = 0 ; i<d.length ; i++) {
			System.out.print(d[i]+"-");
		}
		double sum =0;
		for(int i = 0 ; i<d.length ; i++) {
			sum += d[i];
		}
		System.out.println();
		System.out.println(sum);
		
		for(int i = 0 ; i<d.length ; i++) {
			d[i]=9;
		}
		System.out.println(Arrays.toString(d));
		
		for (int i = 0; i < d.length; i++) {
			if(i%2==0) {
				System.out.println(d[i]);
			}
		}
		
		String s = "aatbbbyyyysyyuuu";
		String a[] = s.split("");
		Arrays.sort(a);
		int counter=0;
		for(int i = 1 ; i<a.length ; i++) {
			if(a[i-1].equals(a[i])) {
				counter++;
			}else {
				System.out.println(a[i-1] + " is repeated " + (counter+1) + " times in the String");
			    counter = 0;
			}
			if(i==a.length-1) {
				System.out.println(a[i] + " is repeated " + (counter+1) + " times in the String");
			}
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
	}

}
