import java.util.Arrays;

public class MergeArr {

   public static void main(String[] args) {
      int arr1[] = {10, 20, 30, 40, 50};
      int arr2[] = {4, 14, 22, 36, 44};
      int newArray[] = new int[arr1.length + arr2.length];
      for(int i=0; i<arr1.length; i++) {
         newArray[i] = arr1[i];
      }
      for(int i=0, j=arr1.length; j<(arr1.length + arr1.length); 
         j++, i++) {
         newArray[j] = arr2[i];
      }
      System.out.println("Array1 = " + Arrays.toString(arr1));
      System.out.println("Array2 = " + Arrays.toString(arr2));
      System.out.println("Merged Array = "  + Arrays.toString(newArray));                    
   }
}