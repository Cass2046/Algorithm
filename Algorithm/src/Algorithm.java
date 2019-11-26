
public class Algorithm {
	public static void main(String[] args) {
		int[] input0 = new int[] {2};
		int[] input1 = new int[] {1,1};
		int[] input2 = new int[] {1, 2, 1, 4, 2};
		int[] input3 = new int[] {1};
		int[] input4 = new int[] {1, 1, 9};
		
		System.out.println(pizza(input0));
			System.out.println(pizza(input1));
		System.out.println(pizza(input2));
		System.out.println(pizza(input3));
		System.out.println(pizza(input4));
	}

		  // Case 1: buy one today, get one tomorrow (left++)
		  // Case 2: buy two today
		  private static boolean pizza(int[] input) {
		      int left = 0;
		      for (int i = 0; i < input.length - 1; i++) {
		        if (left > input[i]) {
		          return false;
		        }
		        // check how many left yesterday
		        input[i] -= left;
		        left = 0;
		        while (input[i] != 0) {
		          if (input[i] % 2 == 0) { // Case 2
		            input[i] -= 2;
		          } else {
		           input[i] = input[i] - 1;  // Case 1          
		           left++;
		          }
		        }
		      }
		     int last = input[input.length - 1];      
		     if (left == last || (last - left) % 2 == 0) {      
		        return true;
		      } else {
		        return false;
		      } 
		    }
	}

