import java.util.*;

public class Hash {

		public static void addAndSort(HashMap hashMap, int value) {

		if(hashMap.isEmpty()) {

			hashMap.put(0, value);

		}

		else {

			int i = 0;

			while((int)hashMap.get(i) < value) {

				i ++;

			}

			int j = hashMap.size() - 1;

			while(j >= i) {

				hashMap.put(j + 1, hashMap.get(j) );

				j --;

			}

			hashMap.put(i, value);

		}

		

		System.out.println("HashMap After Adding : " + hashMap.values()  + "\n");

	}

	public static void swapValues(HashMap hashMap, int indexOne, int indexTwo) {

		int k1 = -1;

		int k2 = -1;

		for(int i = 0; i < hashMap.size(); i++) {

			if((int)hashMap.get(i) == indexOne) {

				k1 = i;

			}

			if((int)hashMap.get(i) == indexTwo) {

				k2 = i;

			}

		}

		if (k1 == -1 || k2 == -1) {

			return;

		}

		hashMap.put(k1, indexTwo);

		hashMap.put(k2, indexOne);

		

		System.out.println("HashMap After Swapping: " + hashMap.values()  + "\n");

	}

	

	public static void findValue(HashMap hashMap, int search) {

		int position = -1;

		for(int i = 0; i < hashMap.size(); i++) {

			if((int)hashMap.get(i) == search) {

				position = i;

				break;

			}

		}

		System.out.println(position);

	}

	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in); 

		

		HashMap hashMap = new HashMap();

		hashMap.put(0, 1);

		hashMap.put(1, 3);

		hashMap.put(2, 5);

		hashMap.put(3, 7);

		hashMap.put(4, 9);

		hashMap.put(5, 11);

		

		System.out.println("HashMap Before Adding : " + hashMap.values());

		System.out.printf("Enter a new integer to be inserted into hashMap : ");

        int newValue = input.nextInt();

        

        addAndSort(hashMap, newValue);

		

        hashMap.clear();

        

        hashMap.put(0, 1);

		hashMap.put(1, 3);

		hashMap.put(2, 5);

		hashMap.put(3, 7);

		hashMap.put(4, 9);

		hashMap.put(5, 11);

		

		System.out.println("HashMap Before Swapping : " + hashMap.values());

		System.out.printf("Enter the first integer to be swapped into hashMap : ");

        int index1 = input.nextInt();

        

        System.out.printf("Enter the second integer to be swapped into hashMap : ");

        int index2 = input.nextInt();

        

        swapValues(hashMap, index1, index2);

        

        hashMap.clear();

        for(int i = 0; i < 500; i++) {

        	int random = new Random().nextInt(9000) + 1000;

        	hashMap.put(i, random);

        }

        

        System.out.printf("Enter an integer (1000 - 9999) : ");

        int search = input.nextInt();

        

        findValue(hashMap, search);

	}

}

 
