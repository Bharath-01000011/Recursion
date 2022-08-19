public class isUppercase {

    static char first(String str)
    {
        if(Character.isUpperCase(str.charAt(0)))
        {
            return str.charAt(0);
        }
        else
        {
            return first(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "helloThEre";
        System.out.println("First Upper case letter present in "+str+" is : "+first(str));
    }
}
