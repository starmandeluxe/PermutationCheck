import java.util.Arrays;

//determine if array is a permutation (has all the numbers in the range of the array, any order)
public class PermutationCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[]{4,1,3,2}));
		System.out.println(solution(new int[]{4,1,3}));
		System.out.println(solution(new int[]{1,1}));
	}
	
	//check if A is a permutation
	public static int solution(int[] A) {
        int[] check = new int[A.length];
		
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] > A.length)
			{
				return 0;
			}
			if (check[A[i]-1] == 0)
			{
				//System.out.println("check: " + check[A[i]-1]);
				check[A[i]-1] = A[i];
				//System.out.println("placed at " + i + ": " + check[A[i]-1]);
			}
			else
			{
				//this means that it's already there
				return 0;
			}
		}

		if (Arrays.asList(check).contains(Integer.valueOf(0)))
			return 0;
		else
			return 1;
    }

}
