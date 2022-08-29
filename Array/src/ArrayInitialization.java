
public class ArrayInitialization 
   {
    static int arr[] = { 50, 100, 150, 200 , 250 };
 
    // method for sum of elements in an array
    static int sum()
    {
        int sum = 0; // initialize sum
        int i;
 
        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
 
        return sum;
    }
 
    // Driver method
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is "
                           + sum());
    }
}