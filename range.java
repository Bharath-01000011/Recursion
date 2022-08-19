public class range {
    static int range(int num)
    {
        if(num == 0)
        {
             return num;
        }
        else 
        {
            return num + range(num-1);
        }

    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Sum of the all the numbers within the given range : "+range(num));

    }
}
