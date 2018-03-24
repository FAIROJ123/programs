
package com.bridgeit.utillity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.StandardSocketOptions;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import com.bridgeit.datastructures.OrderedNode;
import com.bridgeit.datastructures.StackImpl;
import com.bridgeit.functional.Flipcoin;
import com.bridgeit.functional.Replacestring;

public class Util {
	private Scanner sc;
	public static final String BinarySearchString = null;
	private boolean running;
	private long startTime;
	private long stopTime;

	

	BufferedReader br,rf = null;

	//Utility constructor for creating object for BufferedReader
	public Util(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	//input string
	public String inputString(){
		try{
			return br.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}
	
	//input Integer
	public int inputInteger(){
		try{
			return Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return 0;
	}

	//input double
	public double inputDouble(){
		try{
			return Double.parseDouble(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}new BufferedReader(new InputStreamReader(System.in));
		return 0.0;
	}


	//input boolean
	public boolean inputBoolean(){
		try{
			return Boolean.parseBoolean(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return false;
	}

	//taking integer array input
	public Integer[] inputIntArray(int size){
		Integer array[] = new Integer[size];
		for(int i=0;i<size;i++){
			System.out.print("Please enter Element at "+(i+1)+" position: ");
			array[i] = this.inputInteger();
		}
		return array;
}

	/*public Integer[] inputIntArray(int size) throws NumberFormatException, IOException {
		Integer array[] = new Integer[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Please enter Element at " + (i + 1) + " position: ");
			array[i] = this.inputInteger();
		}
		return array;
	}*/

	// taking String array input
	public String[] inputStringArray(int size) {
		String array[] = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Please enter String at " + (i + 1) + " position: ");
			array[i] = this.inputString();
		}
		return array;
	}

	// Array Printing(one dimentional) Generic type
	public <T> void printArray(T[] inputArray) {
		for (T i : inputArray)
			System.out.print(i + " ");

		System.out.println();
	}

	// Array printing(two dimentional) Generic type
	public <T> void printArray(T[][] inputArray, int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(inputArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	// reading file
	public String readFile(File file) {

		try {
			BufferedReader rf = new BufferedReader(new FileReader(file));
			return rf.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// Writing into file into Data
	public void writeFile(File file, int data) {
		try {
			String str = this.readFile(file);
			str = str.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(str + data + " ");
			wr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// writing into file String data
	public void writeFile(File file, String data) {
		try {
			String string = this.readFile(file);
			string = string.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(string + " " + data);
			wr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Clear the Data inside the file
	public void clearFile(File f) {
		try {
			String s = this.readFile(f);
			BufferedWriter wr = new BufferedWriter(new FileWriter(f));
			wr.write(" ");
			wr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Determine percentage of tails and heads.
	public void flip(int n) {

		int i = 1;
		double result;
		double heads = 0.0;

		while (i <= n) {

			result = Math.random();
			if (result < 0.5) {
				System.out.println("result is heads:");
				heads++;
			} else
				System.out.println("result is tails:");
			i++;

		}

		double percentHeads = heads / n * 100;
		double percentTails = (n - heads) / n * 100;
		System.out.println("percentage of head is:" + percentHeads);
		System.out.println("percentage tail is:" + percentTails);

	}

	// replace the string with new string.

	public int replace() {
		String st = "Hello <<username>>,How r u?";
		String replaceString = st.replace("<<username>>", "fairu");
		System.out.println(replaceString);

		return 0;

	}

	// find the given year is leap year or not.

	public boolean isLeapYear(int n) {
		boolean leap = false;

		if (n % 4 == 0) {
			if (n % 100 == 0) {

				if (n % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;

		if (leap)
			System.out.println(n + " is a leap year.");
		else
			System.out.println(n + " is not a leap year.");
		return leap;
	}

	// determine the power of 2
	public int power(int n) {
		int power = 1;
		int i = 0;
		System.out.println("Powers of 2 that are less than 2^" + n);

		while (i <= n) {
			System.out.println("2^" + i + " = " + power);
			power = power * 2;
			i++;
		}

		return power;

	}

	// print the nth hormonic number.
	public void hormonic(int n) {
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum = sum + 1.0 / i;
		}

		System.out.println(sum);

	}

	// Computes the prime factorization of N using brute force.

	public void prime(int n) {
		int i = 2;
		while (n >= i * i)// instead of i<=n
		{
			if (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			} else
				i++;
		}
	}

	// Simulates a gambler who start with $stake and place fair $1 bets until he/she
	// goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
	// times he/she wins and the number of bets he/she makes. Run the experiment N
	// times, averages the results, and prints them out.

	public void game(int a, int goal, int n) {

		int bets = 0;
		int wins = 0;
		int trials = n;
		int stake = a;

		for (int t = 0; t < trials; t++) {

			int cash = stake;

			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5) {
					cash++;

				} else {
					cash--;
				}
				if (cash == goal)
					wins++;
			}

			System.out.println(wins + " wins of " + trials);
			System.out.println("Percent of games won = " + 100.0 * wins / trials);
			System.out.println("Avg of bets           = " + 100.0 * bets / trials);
		}
	}

	// coupon number program.

	public static int getCoupon(int n) {
		return (int) (Math.random() * n);
	}

	public static int collect(int n) {
		boolean[] isCollected = new boolean[n];
		int count = 0;
		int distinct = 0;

		while (distinct < n) {
			int value = getCoupon(n);
			count++;
			if (!isCollected[value]) {
				distinct++;
				isCollected[value] = true;
			}
		}
		return count;
	}

	// Two Diamentional array creation.

	public static void display(int row, int col) {

		int arr[][] = new int[row][col];
		System.out.println("The array elements are:\n");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

	// Sum of three Integer adds to ZERO

	public static void findTriplets(int[] arr, int n) {
		boolean temp = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.print(arr[i]);
						System.out.print(" ");
						System.out.print(arr[j]);
						System.out.print(" ");
						System.out.print(arr[k]);
						System.out.print("\n");
						temp = true;
					}
				}
			}
		}

		if (temp == false) {
			System.out.println("irt is not a tripplet");
		}

	}

	// Write a program Distance.java that takes two integer command-line arguments x
	// and y and prints the Euclidean distance from the point (x, y) to the origin
	// (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power
	// function

	public static void distance(int x, int y) {
		double dist = Math.sqrt(x * x + y * y);

		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	}

	// Write static functions to return all permutation of a String using iterative
	// method and Recursion method. Check if the arrays returned by two string
	// functions are equal.

	// 1. by using recursion

	public static String swap(String st, int i, int j) {
		char[] ch = st.toCharArray();
		char temp;
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);

	}

	public void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	// Stopwatch program.

	public long getElapsedTime() {
		return stopTime - startTime;
	}

	public double getElapsedTimeSecs() {
		double elapsed;
		elapsed = ((double) (stopTime - startTime)) / 1000;
		return elapsed;
	}

	public double start() {
		return startTime = System.currentTimeMillis();
	}

	public double stop() {
		return stopTime = System.currentTimeMillis();

	}

	public void stop1() {
		stopTime = System.currentTimeMillis();
		System.out.println(" StopWatch elapsed time in millisec: " + getElapsedTime() + " milliseconds.");
		System.out.println(" StopWatch elapsed time in seconds: " + getElapsedTimeSecs() + " seconds.");

	}

	// Cross game.

	public static String checkWinner(String[] board, String turn) {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
				break;
			} else if (a == 8)
				return "draw";
		}

		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}

	public static void printBoard(String[] board) {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}

	public static void populateEmptyBoard(String[] board) {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a + 1);
		}
	}

	// Quadratic.java

	public void getQuadratic(int a, int b, int c) {
		System.out.println("Given quadratic equation:" + a + "x^2 + " + b + "x + " + c);

		int d = b * b - 4 * a * c;

		if (d > 0)

		{

			System.out.println("Roots are real and unequal");

			int root1 = (int) ((-b + Math.sqrt(d)) / (2 * a));

			int root2 = (int) ((-b - Math.sqrt(d)) / (2 * a));

			System.out.println("First root is:" + root1);

			System.out.println("Second root is:" + root2);

		}

		else if (d == 0)

		{

			System.out.println("Roots are real and equal");

			int root1 = (int) ((-b + Math.sqrt(d)) / (2 * a));

			System.out.println("Root:" + root1);

		}

		else

		{

			System.out.println("Roots are imaginary");

		}

	}

	// WildChill.java

	public double getWild(double t, double v) {

		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("Temperature = " + t);
		System.out.println("Wind speed  = " + v);
		System.out.println("Wind chill  = " + w);
		return w;

	}

	// Anagram or not.

	public boolean isAnagram(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;
		else {
			for (int i = 0; i < s1.length(); i++) {
				if (s2.indexOf(s1.charAt(i)) == -1)
					return false;
			}
		}

		return true;

	}

	// prime numbers between the range 1-1000.

	public void primeNumbers() {
		int i = 0;
		int num = 0;
		String primeNumbers = "";

		for (i = 1; i <= 1000; i++) {
			int count = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {

				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 1000 are :");
		System.out.println(primeNumbers);

	}

	// find the number is Palindrome or not

	public boolean isPalindrome(int n) {
		int temp = n;
		int sum = 0;
		int r;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;

	}

	// prime palindrome

	public static void primepalindrome()

	{
		boolean isPrime;
		int rem, temp, reversed;
		for (int number = 1; number <= 1000; number++) {
			isPrime = true;
			if (number >= 2) {
				for (int i = 2; i <= (number / 2); i++) {
					if ((number % i) == 0)
						isPrime = false;
				}
				if (isPrime) {
					temp = number;
					reversed = 0;
					while (temp != 0) {
						rem = temp % 10;
						reversed = (reversed * 10) + rem;
						temp /= 10;
					}
					if (reversed == number) {
						System.out.print(number + " ");
					}
				}
			}
		}
		System.out.println();
	}

	// prime Anagram.

	public void primeAnagram() 
	{
		
		
   }

	// Binarsearch for searchiong a word..

	public static int searchWord(String[] arr, String key) {
		int first = 0;
		int last = arr.length;

		while (first < last) {
			int mid = (first + last) / 2;
			if (key.compareTo(arr[mid]) < 0) {
				last = mid;
			} else if (key.compareTo(arr[mid]) > 0) {
				first = mid + 1;
			} else {
				return mid;
			}
		}
		return -(first + 1);
	}

	// Bubblesort using generics.

	public <E> void bubbleSort(E[] arr) {
		for (int iter = 1; iter < arr.length; iter++) {
			for (int i = 0; i < (arr.length - iter); i++) {
				if ((((Comparable) (arr[i])).compareTo(arr[i + 1])) > 0) {
					E tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}
		}
	}

	public static <E> void display(E[] arr) {
		for (E i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// insertionsort by using generics.

	public static <E extends Comparable<? super E>> void insertionSortGenerics(E[] arr) {
		for (int i = 1; i < arr.length; i++) {
			E key = arr[i];
			int position = i;
			while (position > 0 && arr[position - 1].compareTo(key) > 0) {
				arr[position] = arr[position - 1];
				position--;
			}

			arr[position] = key;
		}
	}

	// Binarysearch by using generics

	public <T extends Comparable<T>> int binarySearch(T[] array, T a, int lo, int hi) {
		if (lo > hi)
			return -1;
		if (a == null)
			return -1;

		int mid = (lo / 2) + (hi / 2);
		int cmp = array[mid].compareTo(a);
		if (cmp < 0)
			return binarySearch(array, a, lo, mid - 1);
		else if (cmp > 0)

			return binarySearch(array, a, mid + 1, hi);
		else

			return mid;

	}

	// Binary search for integers.

	public int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}

		return -1;
	}

	// Insertion sort for string.

	public static void insertionSort(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String key = arr[i];
			int position = i;
			while (position > 0 && arr[position - 1].compareTo(key) > 0) {
				arr[position] = arr[position - 1];
				position--;
			}

			arr[position] = key;
		}
	}

	// BubbleSort integers.

	public void bubbleSorting(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {

					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	// Merge Sort of Strings.

	public static void mergeSort(String[] names) {
		if (names.length > 2) {
			String[] left = new String[names.length / 2];
			String[] right = new String[names.length - names.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = names[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = names[i + names.length / 2];
			}

			mergeSort(left);
			mergeSort(right);
			merge(names, left, right);
		}
	}

	public static void merge(String[] names, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = left[a];
				a++;
			} else {
				names[i] = right[b];
				b++;
			}
		}
	}

	// Find a number.
/*
	public static int search(int low, int power) {

		if (low < power) {
			return -1;
		}
		if (low == power) {
			return low;
		}
		int middle = (low + power) / 2;
		System.out.println("your number between " + low + "to" + middle);

		boolean rs = true;
		System.out.println("if yes means type true or no means type false");
		if (rs == inputBoolean()) {
			power = middle;
		} else {
			low = middle + 1;
		}
		return search(low, power);
	}*/

	// Vending Machine.
	static int total = 0;

	public static void function(int value) {

		if (value >= 1000) {
			value = value - 1000;
			System.out.println("1000");
			total++;
			function(value);
		} else if (value >= 500) {
			value = value - 500;
			System.out.println("500 ");
			total++;
			function(value);
		} else if (value >= 100) {
			value = value - 100;
			System.out.println("100 ");
			total++;
			function(value);
		} else if (value >= 50) {
			value = value - 50;
			System.out.println("50 ");
			total++;
			function(value);
		} else if (value >= 10) {
			value = value - 10;
			System.out.println("10 ");
			total++;
			function(value);
		} else if (value >= 5) {
			value = value - 5;
			System.out.println("5 ");
			total++;
			function(value);
		} else if (value >= 2) {
			value = value - 2;
			System.out.println("2 ");
			total++;
			function(value);
		} else if (value >= 1) {
			value = value - 1;
			System.out.println("1 ");
			total++;
			function(value);
		}

		System.out.println("Total No. of notes: " + total);
	}

	// calender program

	public void dayOfWeek(int month, int day, int year) {

		int m = month + 12 * ((14 - month) / 12) - 2;

		if (month <= 2) {
			year--;
		}
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

		int d = (day + x + 31 * m / 12) % 7;
		System.out.println("day of the week is(sun=0,mon=1,tues=2,wed=3,thur=4.friday=5,sat=6):" + d);

	}

	// Temparature convertion.

	public void convertionintoCelsius(double t) {
		double temperatue = ((t - 32) * 5) / 9;
		System.out.println("Temperatue in Celsius = " + temperatue);
	}

	public void covertionintoFahrenheit(double t) {
		double temparature = 9 * t / 5 + 32;
		System.out.println("Temperatue in Fahrenheit = " + temparature);
	}

	// Monthly payment.
	public void payment(int loan, int years, double rate) {
		double n = 12 * years;

		double c = rate / (12.0 * 100.0);

		double payment = loan * c / (Math.pow(1 + c, n) - 1);
		System.out.println("payment = $" + payment);
	}

	// Square root.
	public void squareroot(double c) {
		double epsilon = 1e-15; // relative error tolerance
		double t = c;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}

		System.out.println(t);
	}

	// Decimal to binary convertion.(32bits)

	public void convertBinary(int num) {
		String s = " ";
		for (int i = 0; i < 32; i++) {
			if (num % 2 == 1) {
				s = '1' + s;
			}
			if (num % 2 == 0) {
				s = '0' + s;
			}
			num = num / 2;
		}
		System.out.println("Binary equivalent is:" + s);

	}

	// integer converting in to Binary(8bits)

	public void integerBinary(int num) {
		String s = " ";
		for (int i = 0; i < 8; i++) {
			if (num % 2 == 1) {
				s = '1' + s;
			}
			if (num % 2 == 0) {
				s = '0' + s;
			}
			num = num / 2;
		}
		System.out.println("Binary equivalent is:" + s);

	}

	// Swap nibbles.

	public int swapNibbles(int num) {
		return ((num & 0x0F) << 4 | (num & 0xF0) >> 4);

	}

	// checking power of 2 or not
	public static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	
	

	
	


//prime anargram numbers added into the stack.



	
	
}
	
