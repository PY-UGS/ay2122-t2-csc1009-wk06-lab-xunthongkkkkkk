import java.util.*;

import java.util.Scanner;

public class DataManipulation {

	public static void addAndSort(LinkedList<Integer> list, int value) {		if(list.size() == 0) {

			list.add(value);

		}

		else {

			int i = 0;

			while (list.get(i) < value) {

				i++;

			}

			list.add(i, value);

		}

		

		System.out.println("Linked List After Adding : " + list  + "\n");

	}

	public static void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo) {

		int i1 = list.indexOf(indexOne);

		int i2 = list.indexOf(indexTwo);

		

		if (i1 == -1 || i2 == -1) {

			return;

		}

		

		list.set(i1, indexTwo);

		list.set(i2, indexOne);

		

		System.out.println("Linked List After Swapping: " + list  + "\n");

	}

	public static void findValue(LinkedList<Integer> list, int searchVal) {

		int position = -1;

		for(int i = 0; i < list.size(); i++) {

			if(list.get(i) == searchVal) {

				position = i;

				break;

			}

		}

		System.out.println(position);

	}

	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		Scanner input=new Scanner(System.in); 

        

		LinkedList linkedList = new LinkedList<Integer>();

		

		linkedList.add(1);

		linkedList.add(3);

		linkedList.add(5);

		linkedList.add(7);

		linkedList.add(9);

		linkedList.add(11);

		

		System.out.println("Linked List Before Adding : " + linkedList);

		System.out.printf("Enter a new integer to be inserted into list : ");

        int newValue = input.nextInt();

        

        addAndSort(linkedList, newValue);

		

		linkedList.remove(linkedList.indexOf(newValue));

		

		System.out.println("Linked List Before Swapping : " + linkedList);

		System.out.printf("Enter the first integer to be swapped into list : ");

        int index1 = input.nextInt();

        

        System.out.printf("Enter the second integer to be swapped into list : ");

        int index2 = input.nextInt();

        

        swapValues(linkedList, index1, index2);

        

        LinkedList randomList = new LinkedList<Integer>();

        

        for(int i = 0; i < 500; i++) {

        	int random = new Random().nextInt(9000) + 1000;

        	randomList.add(random);

        }

        

        System.out.printf("Enter an integer (1000 - 9999) : ");

        int search = input.nextInt();

        

        findValue(randomList, search);

	}

}
