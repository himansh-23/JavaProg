/**
 * Compilation javac Utility.java
 * Execution java com.javaprog.Utilities.Utility
 * 
 * Purpose: For Providing Helper Method And Function
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */
package com.javaprog.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.function.BiFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.*;
import org.json.simple.parser.*;
import org.codehaus.jackson.*;

import java.math.BigInteger;
import java.text.SimpleDateFormat;

public class Utility {

	// Scanner class Object Creation
	public Scanner sc = new Scanner(System.in);

	/**
	 * To get Integer Input
	 * 
	 * @return int
	 */
	public int getInt() {
		int i = sc.nextInt();
		return i;
	}

	/**
	 * To get Long Input
	 * 
	 * @return long
	 */
	public long getLong() {
		long i = sc.nextLong();
		return i;
	}

	/**
	 * To get String Without Space's
	 * 
	 * @return String
	 */

	public String getString() {
		String i = sc.next();
		return i;
	}

	/**
	 * To get String with Space's
	 * 
	 * @return String
	 */
	public String getLine() {
		String i = sc.nextLine();
		return i;

	}

	/**
	 * To get Byte as Input
	 * 
	 * @return byte
	 */
	public byte getByte() {
		byte i = sc.nextByte();
		return i;
	}

	/**
	 * To get Double as Input
	 * 
	 * @return byte return this == that;
	 */
	public double getDouble() {
		double d = sc.nextDouble();
		return d;
	}

	/**
	 * Purpose-Changing the String user name with actual username
	 * 
	 * @param s1
	 * @return String
	 */
	public static String stringTemplateReplace(String s1) {
		String s = "Hello <<UserName>>, How are you?";
		s = s.substring(0, 6) + s1 + s.substring(19);
		return s;
	}

	/**
	 * Purpose-Finding % of Head and Tails in n Flips
	 * 
	 * @param n
	 * @return double
	 */
	public static double percentageOfHeadTail(int n) {
		int head = 0;
		for (int i = 0; i < n; i++) {
			double temp = Math.random();
			if (temp < .5) {
				head++;
			}
		}
		System.out.println("No of heads is "+head);
		
		return head / (n * 1.0);
	}

	/**
	 * Purpose-Check Whether A Year is LeapYear Or Not
	 * 
	 * @param n -(int Type)
	 * @return boolean
	 */
	public static boolean isLeapYear(int n) {
		String s = n + "";

		if (s.charAt(2) == '0' && s.charAt(3) == '0') {
			if (n % 400 == 0)
				return true;

			else
				return false;
		} else {
			if (n % 4 == 0)
				return true;
			else
				return false;
		}

	}

	/**
	 * Purpose-Print Table of 2 till n if n if less than 31
	 * 
	 * @param n
	 * @return void
	 */
	public static void TableOfTwo(int n) {
		int start = 0;
		int i = 1;
		while (start <= n ) {
			System.out.print(i + " ");
			i *= 2;
			start++;
		}
	}

	/**
	 * Purpose:-It gives Sum Till Nth Harmonic Number
	 * 
	 * @param n
	 * @return int
	 */
	public static void NHarmonic(int n) {
		float quotient = 1;
		float dividor = 1;
		int increment = 1;
		while (n-- > 1) {
			increment++;
			quotient = increment * quotient + dividor;
			dividor = dividor * increment;

		}
		int x = 2;
		while (x < dividor / 2) {
			while (quotient % x == 0 && dividor % x == 0) {
				quotient = quotient / x;
				dividor = dividor / x;
			}
			x++;
		}

		System.out.println(quotient/dividor);
	}

	/**
	 * Purpose-For Finding Prime Factorization of N
	 * 
	 * @param Ncom.bridgelabz.algo.Utility;
	 * @return void
	 */
	public static void primeFactors(int N) {
		while (N % 2 == 0) {
			System.out.print("2 ");
			N /= 2;
		}
		int i=3;
		while(i*i<=N)
		{
			while(N%i==0)
			{
				System.out.print(i + " ");
				N=N/i;
			}
			i=i+2;
		}
		if (N > 2) {
			System.out.println(N);
		}
	}

	/**
	 * Purpose-Finding Win and Loss Percentage And Win Count
	 * 
	 * @param stack
	 * @param goal
	 * @param n
	 */
	public static void gambler(int stack, int goal, int n) {
		
		
		while(n-- >0)
		{
			int count = 0;
			int win = 0;
			int loss = 0;
			int stacktemp=stack;
			int goaltemp=goal;
			while (stacktemp != 0 && stacktemp != goaltemp) 
			{
				if (Math.random() > .5) 
				{
					stacktemp--;
					loss++;
				}
				else 
				{
					stacktemp++;
					win++;
				}
				count++;
			}
			
			System.out.println("No Of Times Win " + win+" No Of Times "+count);
			System.out.println("Win Percentage " + (win * 100 / count));
			System.out.println("loss Percentage " + (loss * 100 / count));
		}

		
	}

	/**
	 * Purpose-It is Use to Count In How Many Times All distinct Number Receiver
	 * From Random Number.
	 * 
	 * @param N
	 * @param v1
	 * @return int
	 */
	public static int FindDistinctNumber(int N)
	{
		List<Integer> v2 = new ArrayList<>();
		Random r = new Random();
		int count = 0;
		int number = 0;
		while (number < N) 
		{
			int temp = r.nextInt(1000);
			if (!v2.contains(temp))
			{
				v2.add(temp);
				number++;
			}
			count++;
		}
			
		return count;
	}

	/**
	 * Purpose-Printing The Integer Array
	 * @param arr
	 * @return void
	 */
	public static void printArray(int[][] arr) {
		PrintWriter re = new PrintWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				re.print(arr[i][j] + " ");
				re.flush();
			}
			re.println();
			re.close();
		}
	}

	/**
	 * Purpose- For Finding number Of Distinct Triplets and Triplets
	 * 
	 * @param arr
	 * @return int Number Of Triple Whose Sum is Zero
	 */
	public static void printNoOfTriple(int[] arr) {
		int count = 0;
		Vector<String> s1 = new Vector<String>();

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						count++;
						String s = "" + arr[i] + "," + arr[j] + "," + arr[k];
						if (!s1.contains(s)) {
							s1.add(s);

						}
					}
				}
			}
		}
		System.out.println(count);
		for (int i = 0; i < s1.size(); i++) {
			System.out.println(s1.elementAt(i));
		}
	}

	/**
	 * purpose- Use To Find EucledeanDistance From Two points
	 * 
	 * @param x
	 * @param y
	 * @return double
	 */
	public static double euclideanDistance(int x, int y) {
		return Math.sqrt(x * x + y * y);
	}
	
	/**
	 * purpose- For calculating all possible permutation of the String
	 * 
	 * @param str
	 * @return void
	 */
	public static void permutation(String str, int lower, int upper) 
	{
		if (lower == upper)
		{
			System.out.println(str);
			return;
		}
		for (int i = lower; i <= upper; i++) {
			str = swap(str, lower, i);
			permutation(str, lower + 1, upper);
			str = swap(str, lower, i);
		}

	}
	
	/**
	 * purpose-Helping the permutation function by changing the string
	 * 
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swap(String str, int lower, int upper) {
		char temp;
		char[] arr = str.toCharArray();
		temp = arr[lower];
		arr[lower] = arr[upper];
		arr[upper] = temp;
		return String.valueOf(arr);
	}

	/**
	 * Purpose-Returning Current System Time In MilliSeconds
	 * 
	 * @param void
	 * @return long
	 */
	public static long stopWatch() {
		return Instant.now().toEpochMilli();
	}

	/**
	 * Purpose- To Fill Matrix With User And Computer Chance
	 * 
	 * @param C
	 * @param arr
	 * @return void
	 */
	public static void fill(char C, char arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = C;
			}
		}
	}

	/**
	 * Purpose-Showing The Fill Matrix After Every Chance
	 * 
	 * @param arr
	 * @return void
	 */
	public static void show(char arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Purpose-Checking Who Wins After Every Chance
	 * 
	 * @param C
	 * @param arr
	 * @return (Boolean Value)
	 */
	public static boolean winCheck(char C, char arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] == C && arr[i][1] == C && arr[i][2] == C) {
				return true;
			} else if (arr[0][i] == C && arr[1][i] == C && arr[2][i] == C) {
				return true;
			}
		}
		if (arr[0][0] == C && arr[1][1] == C && arr[2][2] == C)
			return true;
		else if (arr[2][0] == C && arr[1][1] == C && arr[0][2] == C)
			return true;

		return false;
	}

	/**
	 * Purpose-Finding Roots Of Quadratic Equation
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void root(double a, double b, double c) {
		double delta = (b * b) - (4 * a * c);
		System.out.println(delta);
		double d = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
		System.out.println("Root 1st is " + d);
		d = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
		System.out.println("Root 2st is " + d);

	}

	/**
	 * Purpose-Finding Wind Flow
	 * 
	 * @param t
	 * @param v
	 * @return (Double Value)
	 */
	public static double wind(double t, double v) {
		return 35.74 + .6215 * t + (.4275 * t - 35.75) * Math.pow(v, .16);
	}

	/**
	 * Purpose-To Find Two String are anagram or not
	 * 
	 * @param first
	 * @param second
	 * @return boolean
	 */
	public static boolean anagram(String first, String second)
	{
		first=first.replaceAll(" ", "");
		second=second.replaceAll(" ", "");
		
		first=Utility.StringSort(first);
		second=Utility.StringSort(second);
	//	System.out.println(first);
	//	System.out.println(second);
		return first.equals(second);
	}
	
	public static String StringSort(String str)
	{	
		char c[]=str.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		return new String(c);
	}

	/**
	 * Purpose-Count Prime Number from 0 to n and return all by storing in vector.
	 * @param n
	 * @return Vector Array
	 */
	public static Vector<Integer> primeCount(int n) {
		if (n < 2) {
			System.out.println("No prime till this range");
		}
		else {
			Vector<Integer> v1 = new Vector<>();
			v1.add(2);
			for (int i = 3; i <= n; i = i + 2) {
				boolean flag = true;
				for (int j = 0; j < v1.size(); j++) {
					if (i % v1.elementAt(j) == 0) {
						flag = false;
					}
				}
				if (flag == true) {
					v1.add(i);
				}
			}
			return v1;
		}
		return null;
	}

	/**
	 * Purpose For Finding Palindrome Anagram Between Prime Numbers .
	 * 
	 * @param n
	 * @return void
	 */
	public static void anagramPrimeCheck(int n) {
		Vector<Integer> v1 = Utility.primeCount(n);
	//	System.out.println(v1);
		Vector<String> s1 = new Vector<>();
		int arr1[] = new int[10];
		int arr2[] = new int[10];
		for (int i = 0; i < v1.size(); i++) 
		{
			int x = v1.elementAt(i).intValue();
			int xvalue = x;
			int count1 = 0;
			if (x <= 9) {
				continue;
		} 
		else 
		{
			while (x > 0) 
			{
				int temp1 = x % 10;
				x = x / 10;
				arr1[temp1]++;
				count1++;
			}
		}
			for (int j = i + 1; j < v1.size(); j++) 
			{
				int x2 = v1.elementAt(j).intValue();
				int x2value = x2;
				int count2 = 0;
				if (x2 <= 9 || x2value == xvalue) 
				{
					continue;
				} 
				else 
				{
					while (x2 > 0) 
					{
						int temp2 = x2 % 10;
						x2 = x2 / 10;
						arr2[temp2]++;
						count2++;
					}

					if (count1 == count2) 
					{
						int k = 0;
						for (k = 0; k < 10; k++) 
						{
							if (arr1[k] != arr2[k])
								break;
						}
						if (k == 10) {
							StringBuffer checking = new StringBuffer(xvalue + "");
							String scheck = checking.toString();
							String scheck2 = checking.reverse().toString();
							if (scheck.equals(scheck2))
								s1.add(xvalue + "");
						}
					}
				}
				Arrays.fill(arr2, 0);
			}
			Arrays.fill(arr1, 0);
		}
		System.out.println(s1);
	}

	/**
	 * Purpose-Sort Integer Array Using Insertion Sort.
	 * 
	 * @param arr
	 * @return void
	 */
	public static void insertionSortInt(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int index = i;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[index] < arr[j]) {
					int temp = arr[index];
					arr[index] = arr[j];
					arr[j] = temp;
					index = j;
				}
			}
		}
		//for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr[i]);
		
	}

	/**
	 * Purpose-Sort Strings Using Insertion Sort.
	 * 
	 * @param s
	 * @return void
	 */
	public static void insertionSortString(String s[]) {
		for (int i = 1; i < s.length; i++) {
			int index = i;
			for (int j = i - 1; j >= 0; j--) {
				if (s[index].compareTo(s[j]) > 0) {
					String temp = s[index];
					s[index] = s[j];
					s[j] = temp;
					index = j;

				}
			}
		}
	}

	/**
	 * Purpose-Bubble Sort For Integer Array
	 * 
	 * @param arr
	 * @return void
	 */
	public static void bubbleSortInt(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * Purpose-Bubble Sort For String
	 * 
	 * @param arr
	 * @return void
	 */
	public static void bubbleSortString(String s[]) {
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length - 1 - i; j++) {
				if (s[j].compareTo(s[j + 1]) > 0) {
					String temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}

	}

	/**
	 * Purpose-Searching A string in String array
	 * 
	 * @param s
	 * @param search
	 * @return void
	 */
	public static boolean binarySearchString(String s[], String search) {
		bubbleSortString(s);

		int lb = 0;
		int ub = s.length;
		int mid = 0;
		while (lb <= ub) {
			mid = (lb + ub) / 2;
			if (mid == s.length) {
				return false;
			}
			if (s[mid].equals(search)) {
			//	System.out.println("Element Found At " + mid);
				return true;
			} else if (s[mid].compareTo(search) > 0) {
				ub = mid - 1;
			} else {
				lb = mid + 1;
			}
		}
		//System.out.println("Element Not Found");
		return false;
	}

	/**
	 * Purpose-Searching A integer in integer array
	 * 
	 * @param arr
	 * @param search
	 * @return void
	 */
	public static void binarySearchInteger(int arr[], int search) {
		bubbleSortInt(arr);
		int lb = 0;
		int ub = arr.length;
		int mid = 0;
		while (lb < ub) {
			mid = (lb + ub) / 2;
			if (arr[mid] == search) {
			//	System.out.println("Element Found At " + mid);
				return;
			} else if (arr[mid] > search) {
				ub = mid - 1;
			} else {
				lb = mid + 1;
			}

		}
		System.out.println("Element Not Found");

	}

	/**
	 * Purpose-Finding a Number By Asking That choose number Between Range or Not
	 * 
	 * @param Range
	 * @return Answer
	 */
	public static int findNumber(int Range) {
		int lower = 0;
		int upper = Range - 1;
		Utility input = new Utility();
		int Answer = 0;
		while (lower <= upper) {
			int mid = (lower + upper) / 2;
			System.out.println("Is Your Number Between " + lower + " " + mid);
			String s = input.getString();

			if ((upper == lower || lower + 1 == upper) && s.equals("true")) {
				Answer = lower;
				break;
			} else if ((upper == lower || lower + 1 == upper) && s.equals("false")) {
				Answer = lower + 1;
				break;
			}
			if (s.equals("false")) {
				lower = mid + 1;
			} else if (s.equals("true")) {
				upper = mid - 1;
			}
		}
		return Answer;
	}

	/**
	 * Purpose-Finding A String In A File Where String Are Seprated By a character
	 * If Not Found Then Add That String To File
	 * 
	 * @param search
	 * @throws IOException
	 * @throws NoSuchElementException
	 * @return Void
	 */
	public static boolean searchInFile(String search, String c) throws IOException, NoSuchElementException {
		FileInputStream fis = new FileInputStream("SearchFileForString.txt");
		Scanner sc = new Scanner(fis);
		String stringarray = sc.nextLine();
		stringarray += c;
		sc.close();
		String s1[] = stringarray.split(c);

		boolean flag = Utility.binarySearchString(s1, search);
		for (int i = 0; i < s1.length; i++)
			System.out.println(s1[i]);

		FileOutputStream fos = new FileOutputStream("SearchFileForString.txt");
		boolean flagcoma = false;
		if (flag == true) {
			for (int i = 0; i < s1.length; i++) {
				if (s1[i].equals(search)) {
					if (i == 0) {
						flagcoma = true;
					}
					continue;
				}

				if (i == 0) {
					fos.write(s1[i].getBytes());
				} else if (i < s1.length) {
					if (flagcoma == true) {
						fos.write(s1[i].getBytes());
						flagcoma = false;
						continue;
					}
					s1[i] = c + s1[i];
					fos.write(s1[i].getBytes());
				}
			}
		} else {
			for (int i = 0; i < s1.length; i++) {
				if (i == 0) {
					fos.write(s1[i].getBytes());

				} else {
					s1[i] = c + s1[i];
					fos.write(s1[i].getBytes());
				}
			}
			search = c + search;
			fos.write(search.getBytes());
		}
		fis.close();
		fos.close();
		return flag;
	}

	/**
	 * Purpose-Sorting String Array Using Merge Sort Algo.
	 * 
	 * @param StringArray
	 * @param lowerbound
	 * @param upperbound
	 */
	public static void mergeSortOfString(String StringArray[], int lowerbound, int upperbound) {
		int mid = (lowerbound + upperbound) / 2;
		if (lowerbound < upperbound) {

			Utility.mergeSortOfString(StringArray, lowerbound, mid);
			Utility.mergeSortOfString(StringArray, mid + 1, upperbound);
			Utility.merging(StringArray, lowerbound, mid, upperbound);

		}
	}

	/**
	 * Purpose- Merge Two Sorted Array Helping Method For MergeSort
	 * 
	 * @param StringArray
	 * @param lowerbound
	 * @param mid
	 * @param upperbound
	 */
	public static void merging(String StringArray[], int lowerbound, int mid, int upperbound) {
		String[] arr = new String[upperbound - lowerbound + 1];

		int lowerstart = lowerbound;
		int upperstart = mid + 1;
		int fill = 0;
		while (lowerstart <= mid && upperstart <= upperbound) {

			if (StringArray[lowerstart].compareTo(StringArray[upperstart]) <= 0) {
				arr[fill] = StringArray[lowerstart];
				lowerstart++;
				fill++;
			} else {
				arr[fill] = StringArray[upperstart];
				upperstart++;
				fill++;
			}
		}
		while (lowerstart <= mid) {
			arr[fill] = StringArray[lowerstart];
			lowerstart++;
			fill++;
		}

		while (upperstart <= upperbound) {
			arr[fill] = StringArray[upperstart];
			upperstart++;
			fill++;
		}
		for (int kx = 0; kx < fill; kx++) {
			StringArray[lowerbound] = arr[kx];
			lowerbound++;
		}
	}

	/**
	 * Purpose-Finding Minimun Number Of Notes Required To Form That Price.
	 * 
	 * @param Price
	 * @return void
	 */
	public static void minCoinCounter(int Price) {
		int NoteType[] = { 1, 2, 5, 10, 50, 100, 500, 1000 };
		int NoteCount[] = new int[NoteType.length];
		for (int start = NoteType.length - 1; start >= 0; start--) 
		{
			NoteCount[start] = Price / NoteType[start];
			Price = Price % NoteType[start];
		}

		for (int start = NoteType.length - 1; start >= 0; start--)
		{
			System.out.println(NoteType[start] + "-->" + NoteCount[start]);
		}
	}

	/**
	 * Purpose-Finding The Day Of Week
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static int dayOfWeek(int m, int d, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		return d0;
	}

	/**
	 * Purpose-Conversion Of Temperature From Celsius To Fahrenheit And Fahrenheit
	 * To Celsius
	 * 
	 * @param temperature
	 * @param flag
	 * @return (Converted Temperature)
	 */
	public static int temperatureConversion(int temperature, boolean flag) {
		if (flag) {
			return (temperature * 9) / 5 + 32;
		} else {
			return (temperature - 32) * 5 / 9;
		}
	}

	/**
	 * Purpose-Finding Compound Interest For Principle Amound Which Compunded
	 * Monthly.
	 * 
	 * @param Payment
	 * @param Year
	 * @param Rate
	 * @return Payment
	 */
	public static double monthlyPayment(double Payment, double Year, int Rate) {
		double n = 12 * Year;
		int n1 = (int) n;
		for (int i = 0; i < n1; i++) 
		{
			Payment = Payment + Payment * 5 / 100;
		}
		return Payment;
	}

	/**
	 * Purpose- Finding Square Root A Number
	 * 
	 * @param Number
	 * @return t(square Root)
	 */
	public static double SquareRoot(double Number) {
		double t = Number;
		while (Math.abs(t - Number / t) > .000000000000001*t) 
		{
			t = (t + Number / t) / 2;
		}
		return t;
	}

	/**
	 * Purpse-Convert Any Number To Binary String
	 * 
	 * @param Number
	 * @return s1(String)
	 */
	public static String binaryOfNumber(int Number)
	{
		String s = "";
		while (Number >= 1) {
			s += Number % 2;
			Number = Number / 2;
		}
		
		String s2 = "";
		if(s.length()<8)
		{
			String s3="00000000";
			s2=s3.substring(0, 8-s.length());
			
		}
		
		for (int start = s.length() - 1; start >= 0; start--) {
			s2 += s.charAt(start);
		}
		return s2;
	}

	/**
	 * Purpose-Swapping 4-bits(Nibble) Of A Number.
	 * 
	 * @param Number
	 * @return ChangeNumber
	 */
	public static int nibbleSwap(int Number) {
		String binaryString = binaryOfNumber(Number);
		int x=0;

		String s = "";
	
		String firstnibble = binaryString.substring(0, 4);
		String secondnibble = binaryString.substring(4);
		binaryString = secondnibble + firstnibble;
		s += "0";
		x = 1;
		int changeNumber = 0;
		for (int start = binaryString.length() - 1; start >= 0; start--) 
		{
			changeNumber = changeNumber + (Integer.parseInt(binaryString.charAt(start) + "")) * x;
			x = x * 2;
		}
		return changeNumber;
	}

	/**
	 * Purpose-Check A String is Palindrome Or not using Deque As DataStructure
	 * 
	 * @param s
	 * @return (boolean)
	 */
	public static boolean palindromeChecker(String s) {
		Deque<Character> D = new Deque<>();
		int index = 0;
		while (index < s.length()) {
			D.addRear(s.charAt(index));
			index++;
		}
		while (D.size() > 1) {
			Character c1 = D.removeFront();
			Character c2 = D.removeRear();
			if (c1 != c2) {
				return false;
			}
		}
		return true;
	}
	
	public static void UnorderedListSearching(String search)
	{
		try {
		UnorderedList<String> list=new UnorderedList<String>();
		FileInputStream fis=new FileInputStream("/home/administrator/Desktop/SearchString.txt");
		Scanner sc=new Scanner(fis);
		while(sc.hasNext())
		{
		list.add(sc.next());
		}
		boolean b=list.search(search);
		if(!b)
		{
			list.add(search);
		}
		else
		{
			list.remove(search);
		}
		FileOutputStream fos=new FileOutputStream("/home/administrator/Desktop/SearchString.txt");
		while(!list.isEmpty())
		{
			fos.write((list.pop(0)+" ").getBytes());
		}
		sc.close();
		fis.close();
		fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Purpose-Adding And Removing Search Number 
	 * @param search
	 * @return void
	 */
	public static void orderedListSearching(int search)
	{
		try {
			OrderedLinkedList<Integer> list=new OrderedLinkedList<Integer>();
			FileInputStream fis=new FileInputStream("/home/administrator/Desktop/SearchNumber.txt");
			Scanner sc=new Scanner(fis);
			while(sc.hasNext())
			{
			list.add(Integer.parseInt(sc.next()));
			}
			
			boolean b=list.search(search);

			if(!b)
			{
				list.add(search);
			}
			else
			{
				list.remove(search);
			}
			FileOutputStream fos=new FileOutputStream("/home/administrator/Desktop/SearchNumber.txt");
			
			while(!list.isEmpty())
			{
				fos.write((list.pop(0)+" ").getBytes());
			}
			sc.close();
			fis.close();
			fos.close();
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	/**
	 * Purpose-Checking Whether a Euation is correct of not
	 * @paran String
	 * @return boolean
	 */
	public static boolean parenthesesMatching(String s)
	{
		Stack<Character> stk=new Stack<>();
		int i=0;
		while(i<s.length())
		{
			Character c='d'; 
			if(s.charAt(i)=='('  || s.charAt(i)=='{'  || s.charAt(i)=='[' )
				stk.push(s.charAt(i));
			else if (s.charAt(i)==')'  || s.charAt(i)=='}'  || s.charAt(i)==']' )
				c=stk.pop();
			if(c==null)
			{
				return false;
			}
			i++;
		}
		if(stk.isEmpty())
			return true;
		else
		{
			return false;
		}
	}
	
	/**
	 * Purpose:Simulation Of Banking QueueLine For Withdraw and Deposit Amount
	 * 
	 * @param n
	 * @return int(Remaining Amount)
	 */
	public static int simulateBanking() 
	{	
		Utility input=new Utility();
		int Amount = 10000;
		Queue<Integer> q = new Queue<>();
		int answer=0;
		do{
			System.out.println("Enter 1 For Insert A Person");
			System.out.println("Enter 2 For Remove A Person");
			System.out.println("Enter 3 for Exit");
			answer=input.getInt();
			switch(answer)
			{
				case 1: 
				System.out.println("Enter 1 For Deposit");
				System.out.println("Enter 2 For Withdraw");
				
				int answer2=input.getInt();
				if(answer2==1)
				{
				System.out.println("Enter Amount");
				int amt=input.getInt();
				Amount+=amt;
				System.out.println("Amount Added");
				q.enqueue(amt);
				}
				else
				{
					System.out.println("Enter Amount");
					int amt=input.getInt();
					if(amt>Amount)
					{
						System.out.println("Insufficient Balance");
					}
					else
					{
						Amount-=amt;
						System.out.println("Amount Deduct");				
					}
					q.enqueue(amt);
				}
				break;
				
				case 2:
					if(q.isEmpty())
					{
						System.out.println("No Person In Queue");
					}
					else
					{
						System.out.println("Person Deleted From Queue");
					q.dequeue();
					}
				break;
				}
			}while(answer!=3);
		return Amount;
		}
	/**
	 * Purpose-Show Calender Of A Particular month and Year
	 * 
	 * @param month
	 * @param year
	 */
	public static void calenderShow(int month, int year) {

		String s[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		int arr[][] = new int[6][7];
		int start = dayOfWeek(month, 1, year);
		int fill = 1;
		int max = 0;
		if (month == 2) {
			boolean b = Utility.isLeapYear(year);
			if (b) {
				max = 29;
			} else {
				max = 28;
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			max = 31;
		} else {
			max = 30;
		}
		outer: for (int i = 0; i < 6; i++) {
			for (int j = start; j < 7; j++) {
				if (fill <= max) {
					arr[i][j] = fill;
					fill++;
				} else {
					break outer;
				}
			}
			start = 0;
		}
		System.out.println(s[month - 1] + " " + year);
		System.out.println("S  M  T  W  T  F  S");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] == 0) {
					System.out.print("   ");
				} else if (arr[i][j] > 9) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print(arr[i][j] + "  ");
				}
			}
			System.out.println();
		}

	}

	/**
	 * Purpose-Finding Prime Number Range Wise.
	 * 
	 * @param limit
	 * @return void
	 */
	public static int[][] array2DOfPrime(int limit) {
		
		int arrtemp[]=new int[500];
		int tempsize=1;
		arrtemp[0]=2;
		for(int i=3;i<=limit;i=i+2)
		{
			boolean flag=true;
			for(int j=tempsize-1;j>=0;j--)
			{
				if(i%arrtemp[j]==0)
				{
					flag=false;
					break;
				}
				
			}
			if(flag)
			{
				arrtemp[tempsize++]=i;
			}
		}
		int arr[][]=new int[10][50];
		//int range1=0;
		int range2=100;
		int fill1=0;
		int fill2=0;
		for(int i=0;i<tempsize;)
		{
			while(i<tempsize && arrtemp[i]<=range2)
			{
				arr[fill1][fill2]=arrtemp[i];
				fill2++;
				i++;
			}
			if(arrtemp[i]>range2)
			{
				range2+=100;
				fill1++;
				fill2=0;
			}
		}
		return arr;
	}
	
	/**
	 * Purpose-Finding no of binary tree which can be formed with given Range.
	 * @param n
	 * @return void
	 */
	public static void binaryTreeNumber(int n) 
	{
		
		// Use of BigIntger As Int and Long variable not able to store large value
		int temp = 2 * n;
		BigInteger x = new BigInteger(temp + "");
		x = factorial(temp);
		temp = n + 1;
		BigInteger y = new BigInteger(temp + "");
		y = factorial(temp);
		BigInteger z = factorial(n);

		y = y.multiply(z);
		BigInteger values = x.divide(y); 
		values = values.mod(BigInteger.valueOf(100000007));
		System.out.println(values);

	}
	/**
	 * Purpose-Find Factorial of A Number.
	 * 
	 * @param y
	 * @return BigInteger
	 */
	public static BigInteger factorial(long y)
	{
		BigInteger value = new BigInteger("1");
		while (y >= 1) {
			value = value.multiply(BigInteger.valueOf(y));
			y--;
		}
		return value;
	}
	/**
	 *Purpose- 
	 * @param limit
	 */
	public static void primeAnagramList(int limit) 
	{
		int arrtemp[]=new int[500];
		int tempsize=1;
		arrtemp[0]=2;
		for(int i=3;i<=limit;i=i+2)
		{
			boolean flag=true;
			for(int j=tempsize-1;j>=0;j--)
			{
				if(i%arrtemp[j]==0)
				{
					flag=false;
					break;
				}
				
			}
			if(flag)
			{
				arrtemp[tempsize++]=i;
			}
		}
	
		int arr1[] = new int[10];
		int arr2[] = new int[10];
		int Arr1[][] = new int[10][50];
		int Arr2[][] = new int[10][50];
		int primefill1=0,primefill2=0,nonprimefill1=0,nonprimefill2=0;
		int limitcheck=100;
		for (int i=0;i<tempsize; i++) 
			{	
			boolean flag=false;
				int x = arrtemp[i];
				int xvalue = x;
				int count1 = 0;
				if (x <= 9) {	
					continue;
				} 
				else 
				{
					while (x > 0) {
						int temp1 = x % 10;
						x = x / 10;
						arr1[temp1]++;
						count1++;
					}
				}
				
				inner:for (int k = 0;k< tempsize; k++) 
				{
					if(xvalue<=0) {
						break inner;
					}
					int x2 = arrtemp[k];
					// System.out.println(x2+"t");
					int x2value = x2;
					int count2 = 0;
					if (x2 <= 9 || x2value == xvalue)
					{
						continue;
					}

					else 
					{
						while (x2 > 0)
						{
							int temp2 = x2 % 10;
							x2 = x2 / 10;
							arr2[temp2]++;
							count2++;
						}
						if(xvalue>limitcheck)
						{
							primefill1++;
							primefill2=0;
							nonprimefill1++;
							nonprimefill2=0;
							limitcheck+=100;
							
							}
						if (count1 == count2) 
						{
							int k1 = 0;
							for (k1 = 0; k1 < 10; k1++) 
							{
								if (arr1[k1] != arr2[k1])
									break;
							}
							if (k1 == 10)
							{
								Arr1[primefill1][primefill2]=xvalue;
								primefill2++;
								flag=true;
								Arrays.fill(arr2, 0);
								break inner;
								}
							}
						}
					Arrays.fill(arr2, 0);
					}
				if(flag==false)
				{
					if(xvalue>limitcheck)
					{
						primefill1++;
						primefill2=0;
						nonprimefill1++;
						nonprimefill2=0;
						limitcheck+=100;
						if(limitcheck>limit)
						{
							limitcheck=limit;
						}
						
					}
					Arr2[nonprimefill1][nonprimefill2]=xvalue;
					nonprimefill2++;
				}
				Arrays.fill(arr1, 0);
				}
				
		int inr = 1;
		int enr = 100;
		
		System.out.println("Number Who Are Anagram");
		for (int i = 0; i <= nonprimefill1; i++) 
		{
			System.out.print("Range " + inr + "-->" + enr + "  ");
			for (int j = 0; Arr1[i][j]!=0; j++) 
			{
				System.out.print(Arr1[i][j]+ " ");
			}
			inr = inr + 100;
			if (enr + 100 > limit) 
			{
				enr = limit;
			} 
			else
			{
				enr = enr + 100;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("Number Who Are Not Anagram");
		inr = 1;
		enr = 100;
		for (int i = 0; i <= nonprimefill1; i++) 
		{
			System.out.print("Range " + inr + "-->" + enr + "  ");
			for (int j = 0;  Arr2[i][j]!=0; j++) 
			{
				System.out.print(Arr2[i][j] + " ");
			}
			inr = inr + 100;
			if (enr + 100 > limit) 
			{
				enr = limit;
			}
			else 
			{
				enr = enr + 100;
			}
			System.out.println();
		}
	}

	/**
	 * Purpose-Finding Prime Number Upto 1000 Who Anagram With Other Prime Number
	 * And Store In A Stack
	 * 
	 * @return Stack<Integer>
	 */
	public static Stack<Integer> primeAnagramStack() {
		int arr[] = new int[500];
		arr[0] = 2;
		int size = 1;
		for (int i = 3; i < 1000; i++) {
			boolean flag = true;
			for (int j = size - 1; j >= 0; j--) {
				if (i % arr[j] == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				arr[size] = i;
				size++;
			}
		}
		Stack<Integer> s1 = new Stack<Integer>();

		int arr1[] = new int[10];
		int arr2[] = new int[10];

		for (int i = 0; i < size; i++) {
			int x = arr[i];
			int xvalue = x;
			int count1 = 0;
			if (x <= 9) {
				continue;
			} else {
				while (x > 0) {
					int temp1 = x % 10;
					x = x / 10;
					arr1[temp1]++;
					count1++;
				}
			}
			for (int j = 0; j < size; j++) {
				int x2 = arr[j];
				if (j == i || x2 <= 9) {
					continue;
				}
				int x2value = x2;
				int count2 = 0;
				while (x2 > 0) {
					int temp2 = x2 % 10;
					x2 = x2 / 10;
					arr2[temp2]++;
					count2++;
				}

				if (count1 == count2) {
					int k1 = 0;
					for (k1 = 0; k1 < 10; k1++) {
						if (arr1[k1] != arr2[k1])
							break;

					}
					if (k1 == 10) {
						s1.push(xvalue);
						break;
					}
				}
				Arrays.fill(arr2, 0);
			}
			Arrays.fill(arr1, 0);
		}
		return s1;

	}

	/**
	 * Purpose-Finding Prime Number Upto 1000 Who Anagram With Other Prime Number
	 * And Store In A Queue
	 * 
	 * @return Queue<Integer>
	 */
	public static Queue<Integer> primeAnagramQueue() {
		int arr[] = new int[500];
		arr[0] = 2;
		int size = 1;
		for (int i = 3; i < 1000; i++) {
			boolean flag = true;
			for (int j = size - 1; j >= 0; j--) {
				if (i % arr[j] == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				arr[size] = i;
				size++;
			}
		}
		Queue<Integer> q1 = new Queue<Integer>();

		int arr1[] = new int[10];
		int arr2[] = new int[10];

		for (int i = 0; i < size; i++) {
			int x = arr[i];
			int xvalue = x;
			int count1 = 0;
			if (x <= 9) {
				continue;
			} else {
				while (x > 0) {
					int temp1 = x % 10;
					x = x / 10;
					arr1[temp1]++;
					count1++;
				}
			}
			for (int j = 0; j < size; j++) {
				int x2 = arr[j];
				if (j == i || x2 <= 9) {
					continue;
				}
				int x2value = x2;
				int count2 = 0;
				while (x2 > 0) {
					int temp2 = x2 % 10;
					x2 = x2 / 10;
					arr2[temp2]++;
					count2++;
				}

				if (count1 == count2) {
					int k1 = 0;
					for (k1 = 0; k1 < 10; k1++) {
						if (arr1[k1] != arr2[k1])
							break;

					}
					if (k1 == 10) {
						q1.enqueue(xvalue);
						break;
					}
				}
				Arrays.fill(arr2, 0);
			}
			Arrays.fill(arr1, 0);
		}
		return q1;
	}

	/**
	 * Purpose-Printing The Calendar Of Random Month and Year Using Queue
	 * @param month
	 * @param year
	 * @return void
	 */
	public static void calenderQueue(int month, int year) {
		String s[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		Queue<String> q1 = new Queue<>();
		int start = dayOfWeek(month, 1, year);

		int fill = 1;
		int max = 0;
		if (month == 2) {
			boolean b = Utility.isLeapYear(year);
			if (b) {
				max = 29;
			} else {
				max = 28;
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			max = 31;
		} else {
			max = 30;
		}
		while (start != 0) {
			q1.enqueue("   ");
			start--;
		}

		while (fill <= max) {
			if (fill <= 9)
				q1.enqueue(fill + "  ");
			else
				q1.enqueue(fill + " ");
			fill++;
		}

		System.out.println(s[month - 1] + " " + year);
		System.out.println("S  M  T  W  T  F  S");
		fill = 1;
		while (!q1.isEmpty()) {
			System.out.print(q1.dequeue());
			if (fill % 7 == 0) {
				System.out.println();
			}
			fill++;
		}
	}

	/**
	 * Purpose-Printing The Calendar Of Random Month and Year Using Stack
	 * 
	 * @param month
	 * @param year
	 * @return void
	 */
	public static void calenderStack(int month, int year) {
		String s[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		Stack<String> s1 = new Stack<>();
		Stack<String> s2 = new Stack<>();
		int start = dayOfWeek(month, 1, year);
		int fill = 1;
		int max = 0;
		if (month == 2) {
			boolean b = Utility.isLeapYear(year);
			if (b) {
				max = 29;
			} else {
				max = 28;
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			max = 31;
		} else {
			max = 30;
		}
		while (start != 0) {
			s1.push("   ");
			start--;
		}

		while (fill <= max) {
			if (fill <= 9)
				s1.push(fill + "  ");
			else
				s1.push(fill + " ");
			fill++;
		}
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		System.out.println(s[month - 1] + " " + year);
		System.out.println("S  M  T  W  T  F  S");
		fill = 1;
		while (!s2.isEmpty()) {
			System.out.print(s2.pop());
			if (fill % 7 == 0) {
				System.out.println();
			}
			fill++;
		}

	}
	/**
	 * Puspose-Use of Hashing for search a number in a file.
	 * @param search
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static boolean hasingSearch(int search) throws FileNotFoundException,IOException
	{
		FileInputStream fis=new FileInputStream("/home/administrator/Desktop/Hashing.txt");
		UnorderedList<Integer> arr[]=new UnorderedList[11];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new UnorderedList<Integer>(); 
		}
		Scanner sc=new Scanner(fis);
		while(sc.hasNext())
		{
			int value=Integer.parseInt(sc.next());
		
			int temp_val=value%11;
			
			arr[temp_val].add(value);
		}
		sc.close();
		System.out.println();
		
		int value=search%11;
		boolean flag=arr[value].search(search);
		if(flag)
		{
			arr[value].remove(search);
		}
		else
		{
		arr[value].add(search);
		}
		
		FileOutputStream fos=new FileOutputStream("/home/administrator/Desktop/Hashing.txt");
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			while(!arr[i].isEmpty())
			{
				fos.write((arr[i].pop()+" ").getBytes());
			}
		}
	//	fos.close();
		fis.close();
		return flag;
	}
	
	/**Purpose-Reading a .json File and Printing it same on Console 
	 * @param void
	 * @return void
	 */
	@SuppressWarnings("unchecked")
	public static void jsonFileRead() 
	{
		try {
		FileReader file2=new FileReader("/home/administrator/Desktop/jsonFile1.json");
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(file2);
		JSONArray jsonarr=(JSONArray) obj;

		jsonarr.stream().forEach(item ->System.out.println(item));
		jsonarr.stream().forEach(i ->
		{
			JSONObject s=(JSONObject)i;
			int x1=(int)((Long)s.get("Price")).intValue();
			int x2=(int)((Long)s.get("Weight")).intValue();
			
			System.out.println("Total Of "+s.get("Inventory")+" "+(x1*x2));
		});
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	
	}
	
	/**
	 * Purpose-Reading Data From .json File ABout Stock Report and calculating and total value of each stock and total evaluation of stock market
	 * and printing those date on console.
	 * @param Void
	 * @ return void
	 */
	@SuppressWarnings("unchecked")
	public static void stockReportShow()
	{
		//Utility input=new Utility();

	//For Creating A JSONArray File 	
	/*	try {
		 FileWriter file=new FileWriter("/home/administrator/Desktop/StockReport.json");
		 System.out.println("Enter No of Stock");
		 int n=input.getInt();
		JSONArray arr=new JSONArray();

		 for(int i=0;i<n;i++)
		 {
			 JSONObject obj=new JSONObject();
			 System.out.println("Enter Stock Name");
			 String s=input.getString();
			 obj.put("Stock Name", s);
			 System.out.println("Enter Number Of Share");
			 int x=input.getInt();
			 obj.put("Number Of Share", x);
			 System.out.println("Enter Share Price");
			 x=input.getInt();
			 obj.put("Share Price", x);
			 arr.add(obj);
		}
		file.write(arr.toJSONString());
		file.close();
		}
		catch(IOException e)
		{
			
		}*/
		try
		{
		FileReader file=new FileReader("/home/administrator/Desktop/StockReport.json");

		System.out.println("Stock Name   Stock Number    Stock Price     Total Value");
		JSONParser parser=new JSONParser();
		Object ob=parser.parse(file);
		JSONArray arr=(JSONArray)ob;
		arr.stream().forEach(i ->
		{
			int number=0;
			int price=0;
			JSONObject jobj=(JSONObject)i;
			number=(int)(long)(Long)jobj.get("Number Of Share");
			price=(int)(long)(Long)jobj.get("Share Price");
			
			System.out.println(jobj.get("Stock Name")+"             "+jobj.get("Number Of Share")+"               "
								+jobj.get("Share Price")+"          "
								+number*price);
		});
		int total=0;
		for(int i=0;i<arr.size();i++)
		{
		JSONObject s=(JSONObject)arr.get(i);
		total+=((int)(long)(Long)(s.get("Number Of Share")))*((int)(long)(Long)(s.get("Share Price")));
		}
		System.out.println("Total is  "+total);
		
		}
		catch(ParseException|IOException e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *Purpose-For Formatting A String Template To User Name and Phone Number 
	 *@param Void
	 *@return void
	 */
	public static void regexDemo()
	{
		try
		{
			String searchArray[]= {"<<name>>","<<full name>>","­-xxxxxxxxxx","01/01/2016"};
			String replaceArray[]=new String[4];
			FileInputStream file=new FileInputStream("/home/administrator/Desktop/regex.txt");
			byte b[]=new byte[10];
			int x=file.read(b);
			String Template="";
			while(x!=-1)
			{
				
				Template+=new String(b);
				x=file.read(b);
			}
			
			//Creating Utility Object For Taking input From User.
			Utility input=new Utility();
		//	System.out.print(Template);
			file.close();
			System.out.println("Enter Your First Name");
			replaceArray[0]=input.getString();
			System.out.println("Enter Your Last Name");
			replaceArray[1]=replaceArray[0]+" "+input.getString();
			System.out.println("Enter Mobile Number");
			replaceArray[2]=input.getString();
		// Formattig Date And Time in dd/MM/yyyy format.	
			
			Date d=new Date();
			SimpleDateFormat a=new SimpleDateFormat("dd/MM/yyyy");
			//a.format(d);
			replaceArray[3]=a.format(d);
			
			//Creating Pattern And Matcher Reference.
			Pattern p;
			Matcher m;
			for(int i=0;i<searchArray.length;i++)
			{
				p=Pattern.compile(searchArray[i]);
				m=p.matcher(Template);
				Template=m.replaceAll(replaceArray[i]);
			}
			System.out.println(Template);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static String[][] cardDistribute()
	{
		String arr[][]=new String[4][13];
		cardInsert(arr);
		cardShuffle(arr);
		
		String playercard[][]=new String[4][9];
		for(int i=0;i<playercard.length;i++)
		{
			for(int j=0;j<playercard[i].length;j++)
			{
				playercard[i][j]=arr[i][j];
			}
		}
		return playercard;
	}
	
	public static void cardInsert(String arr[][])
	{
		String Suits[]= {"Clubs","Diamonds","Hearts","Spades"};
		String Rank[]= {"2","3","4","5","6","7","8","9","10","Jack","King","Queen","Ace"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Suits[i]+" "+Rank[j];
			}
		}
	}
	public static void cardShuffle(String arr[][])
	{
		Random r1=new Random();
		for(int i=0;i<150;i++)
		{
			int x1=r1.nextInt(4);
			int x2=r1.nextInt(13);
			int x3=r1.nextInt(4);
			int x4=r1.nextInt(13);
			swap(arr,x1,x2,x3,x4);
			
		}
	}
	
	public static void swap(String arr[][],int x1,int x2,int x3,int x4)
	{
		String temp=arr[x1][x2];
		arr[x1][x2]=arr[x3][x4];
		arr[x3][x4]=temp;
	}
	
	public static Queue<Queue<String>> cardSort(String playercard[][])
	{
		Queue<Queue<String>> sortedcard=new Queue<>();
		
		String rank[]= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		int arr[]=new int[9];
		int index=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<9;j++)
			{
				
				String temp[]=(playercard[i][j]+" ").split(" ");
				for(int k=0;k<13;k++)
				{
					if(temp[1].equals(rank[k]))
					{
						
						arr[index]=k;
						index++;
					}
				}
			}
			System.out.println();
			index=0;
			for(int k1=0;k1<arr.length-1;k1++)
			{
				for(int k2=k1+1;k2<arr.length;k2++)
				{
					if(arr[k1]>arr[k2])
					{
						int temp=arr[k1];
						arr[k1]=arr[k2];
						arr[k2]=temp;
						
						String temp1=playercard[i][k1];
						playercard[i][k1]=playercard[i][k2];
						playercard[i][k2]=temp1;
						
					}
				}
			}
		
		}
		
		for(int i=0;i<playercard.length;i++)
		{
			Queue<String> temp=new Queue<>();
			for(int j=0;j<playercard[i].length;j++)
			{
				temp.enqueue(playercard[i][j]);
			}
			sortedcard.enqueue(temp);
		}
		
		return sortedcard;
	}
}
