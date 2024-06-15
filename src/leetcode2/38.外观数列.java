import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 *
 * If you define many classes, but you must have a class named Main and a public property.
 * The Main class should be the only public class.
 * The Main class must contain a static method (function) named "main" 
 * Do not add any package, like "package main"
 *
 * The TestCase is shown below
 * Input : 1 2
 * Output : 3
 */

class Main {
	
	public static void main(String[] args) {
	
		int a[][]={{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
        int path = 0;
		int min = Integer.MAX_VALUE;
		deepSearch(a, 0, 0,123, path, min); 

		System.out.println(min);
	}
	
	public static void deepSearch(int[][] n, int i, int j, int num ,int path, int min) {
		int cur = n[i][j];
		min = Math.min(min, path);

		if(i==n.length-1 && j ==n.length-1) {
			return;
		}
		
		path = path + cur * 10;
		if (j<2) {
			deepSearch(n, i, j+1, num, path, min);
		}
		deepSearch(n, i, j, num,path,min);
		if(i<2) {
			deepSearch(n, i+1, j, num,path, min);
		}
	}

}