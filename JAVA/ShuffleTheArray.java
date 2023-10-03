import java.util.Random;

public class ShuffleTheArray {

	public static void main(String[] args) {

	  int[] array = {1,2,3,4,5,6,7};

		Random rd = new Random();
    for (int i = array.length - 1; i > 0; i--)
    {
      int ind = rd.nextInt(i + 1);
      int temp = array[ind];
      array[ind] = array[i];
      array[i] = temp;
    }

    for(int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
	}
}