package java_fundamentals;
import java.util.Scanner;
import java.io.*;

import java.text.*;
import java.util.*;
import java.util.regex.*; 
import java.math.*;
import java.util.Arrays;


public class LongestCommonPrefix {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter space-separated strings:");
	        String input = scanner.nextLine();
	        scanner.close();

	        String[] words = input.split("\\s+");

	        if (words.length == 0) {
	            System.out.println("NONE");
	            return;
	        }

	        Arrays.sort(words);

	        String first = words[0];
	        String last = words[words.length - 1];
	        StringBuilder commonPrefix = new StringBuilder();

	        for (int i = 0; i < first.length(); i++) {
	            if (i < last.length() && first.charAt(i) == last.charAt(i)) {
	                commonPrefix.append(first.charAt(i));
	            } else {
	                break;
	            }
	        }

	        String result = commonPrefix.toString();
	        System.out.println(result.isEmpty() ? "NONE" : result);
	    }
	/**public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.next();
		}
		StringBuilder s=new StringBuilder(arr[0]);
		for(int i=1;i<n;i++){
		    if(s.length()==0){
		        System.out.println("NONE");
		        return;
		    }
		    int m=Math.min(s.length(),arr[i].length());
		    String a=arr[i];
		    int j=0;
		    for(;j<m;j++){
		        if(s.charAt(j)==a.charAt(j))continue;
		        else break;
		    }
		    for(;j<s.length();j++){
		        s.deleteCharAt(j);
		    }
		}
		System.out.println(s);
	}*/
}
