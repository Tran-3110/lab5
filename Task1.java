package main;

import java.util.Arrays;

public class Task1 {
	// add 2 matrices 
	public static int[][] add(int[][] a, int[][] b) { 
		if(a.length != b.length || a[0].length != b[0].length) return null;
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[i][j] +b[i][j];
			 }
		}
	return result; 
	}
	
	// subtract 2 matrices 
	public static int[][]subtract(int[][] a, int[][] b) { 
		if(a.length != b.length || a[0].length != b[0].length) return null;
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[i][j] - b[i][j];
			 }
		}
	return result; 
	}
	
	// multiply 2 matrices 
	public static int[][] multiply(int[][] a, int[][] b) { 
		if(a[0].length != b.length) return null;
		int[][] result = new int[a.length][b[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = multiplyHelp(a, b, i, j);
			}
		}
	return result; 
	}
	
	public static int multiplyHelp(int[][] a, int[][] b, int row, int col) {
		int result = 0;
		for (int i = 0; i < b.length; i++) {
			result += a[row][i]*b[i][col];
		}
		return result;
	}
	
	// tranpose a matrix 
	public static int[][] transpose(int[][] a) { 
		int[][] result = new int[a[0].length][a.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = a[j][i];
			}
		}
	return result; 
	} 
	
	
	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] a = new int[][] {{7, 2},
			                     {5, 3}};
		int[][] b = new int[][] {{2, 1}, 
			                     {3, 1}};
		print(add(a, b));
		print(subtract(a, b));
		System.out.println("=====");
		print(multiply(a, b));
		System.out.println("=====");
		print(transpose(a));
	}

}
