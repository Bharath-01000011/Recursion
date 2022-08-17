public class dec_to_bin {
    static int recursion(int num)
    {
        if(num == 0)
        {
            return 0;
        }
        else
        {
            return num%2 + 10*recursion(num/2);
        }
    }
    public static void main(String[] args) {
        int decimal = 10;
        System.out.println("Binary format of "+decimal+" is : "+recursion(decimal));
    }   
}
