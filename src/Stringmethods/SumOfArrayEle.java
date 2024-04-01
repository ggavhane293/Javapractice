package Stringmethods;

import java.util.Arrays;

public class SumOfArrayEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {45,3,23,3,4,22,34};
		
		long sum=Arrays.stream(a).summaryStatistics().getSum();
		System.out.println(sum);
		long min=Arrays.stream(a).summaryStatistics().getMin();
		System.out.println(min);
		long max=Arrays.stream(a).summaryStatistics().getMax();
		System.out.println(max);
		long count =Arrays.stream(a).summaryStatistics().getCount();
		System.out.println(count);
	}

}
