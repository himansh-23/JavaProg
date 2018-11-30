/**
 * Compilation javac CouponNumber.java
 * Execution java com.javaprog.Functional.CouponNumber
 * Purpose: Generate N Distinct Coupon Number Given By User Using Random Number
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */

package com.javaprog.functional;
import com.javaprog.Utilities.*;
import java.util.Vector;

public class CouponNumber {
	public static void main(String args[])
	{
		Utility input=new Utility();
		System.out.println("How Many Number You Want To Generate");
		int N=input.getInt();
		int count=Utility.FindDistinctNumber(N);
		System.out.println(count);
	}

}
