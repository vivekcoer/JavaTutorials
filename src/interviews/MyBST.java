package interviews;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class MyBST {
	
	
	private class Node{
		Node _left;
		Node _right;
		int _data;
		
		Node(Node left, Node right, int data){
			_left = left;
			_right = right;
			_data = data;
		}
	}
	
    public static void main(String args[]){
    	ArrayList<String> myList = new ArrayList<String>();
    	Scanner sc = new Scanner(System.in);
    	while (sc.hasNext()){
    		String s = sc.next();
    		if(s.equals("Q")) break;
    		myList.add(s);
    	}
    	
    	String s = StringUtils.join(myList, ",");
    	System.out.println(s);
    }
}
