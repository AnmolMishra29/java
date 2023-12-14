/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training;

/**
 *
 * @author mishr
 */
//public class JaggedArray {
//	public static void main(String[] args)
//	{
//		
//		int arr[][] = new int[2][];
//		arr[0] = new int[3];
//
//		
//		arr[1] = new int[2];
//
//		
//		int count = 0;
//		for (int i = 0; i < arr.length; i++)
//			for (int j = 0; j < arr[i].length; j++)
//				arr[i][j] = count++;
//
//		
//		System.out.println("2D Jagged Array");
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++)
//				System.out.print(arr[i][j] + " ");
//			System.out.println();
//		}
//	}
//
//                        
//
//    
//}

public class JaggedArray {
public static void main(String... original) {
String[] copy = new String[original.length];

if(original.length > 0){
    for(int i =0; i< original.length;i++){
        copy[i] = original[i];
    }
    System.out.println(copy.length + " " + copy[0]); 
}
else{
    System.out.println("Original array is empty");
}
}
}
