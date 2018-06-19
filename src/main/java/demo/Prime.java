package demo;

import java.util.Arrays;

public class Prime {

	public static void main(String[] args) {

		//printPrime(20);
		//chechPrime(23);
		//printFabocci(10);
		//stringRev("string");
		//checkStringPalindrome("Nitin");
		//checkNumberPallindrome(454);
		
		/*int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + 
                                                 result);*/
		/*int arr[] = {4,10,40,2,3,5};
		bubbleSort(arr);*/
		
		/*String str = rev("Nitin");
		System.out.println(str);*/
		
		
		
		getSort("afserfdv");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	public static void printPrime(int cnt)
	{
		int n = cnt;
		for(int i=1;i<=n;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime==true)
			{
				System.out.println(" "+i);
			}
		}
	}

	public static void chechPrime(int num)
	{
		boolean isPrime=true;

		for(int j=2;j<=num/2;j++)
		{
			if(num%j==0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime==true)
		{
			System.out.println("Nu is Prime  "+num);
		}
		else
		{
			System.out.println("Nu is not Prime");
		}
	}

	public static void printFabocci(int cnt)
	{
		int n1=0;
		int n2=1;
		int n3;
		System.out.print(n1+ " "+n2);
		for(int i=2;i<cnt;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;

		}

	}

	public static String stringRev(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);

		}
		System.out.print(rev);
		return rev;
	}

	public static String rev(String str)
	{
		if(str==null || str.length()<=1)
		{
			return str;
		}
		else
		{
			return rev(str.substring(1))+str.charAt(0);
		}
	}
 
	
	public static void checkStringPalindrome(String str)
	{
		String str1=stringRev(str);

		if(str1.equals(str))
		{
			System.out.println("          String is Pallindrome");
		}
		else
		{
			System.out.println("         String is not pallindrome");
		}
	}

	public static void checkNumberPallindrome(int n)
	{
		int r;
		int sum=0;
		int temp=n;

		while(n>0)
		{
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");    
	}  

	public static int binarySearch(int[]arr, int l, int r, int key)
	{
		int mid = (l+r)/2;
		
		if(arr[mid]==key)
		{
			return mid;
		}
		if(key<arr[mid])
		{
			return binarySearch(arr, l, mid-1, key);
		}
		if(key>arr[mid])
		{
			return binarySearch(arr, mid+1, r, key);
		}
		return -1;
	}
	
	public static void swap(int x,int y)
	{
		int temp;
		temp=y;
		y=x;
		x=temp;
	}

	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp;
					temp=arr[j];
					arr[j] = arr[i];
					arr[i]=temp;
					//swap(arr[i], arr[j]);
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void selectionSort(int[] arr)
	{
		
		int small = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(small<arr[i])
			{
				//arr[i] = small = ;
				
			}
			
		}
		
		
		
		
		
		
		
		
		
	}


	public static void getSort(String str)
	{
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
	}























}