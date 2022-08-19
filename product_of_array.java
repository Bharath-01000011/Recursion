public class product_of_array {
    

    static int prod(int a[], int n)
    {
        if(n == 0)
        {
            return a[n];
        }

        else
        {
            return a[n] * prod(a, n-1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println("Product of array using recursion : "+prod(arr, arr.length-1));
    }
}
