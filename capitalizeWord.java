public class capitalizeWord {

    static String recursion(String str)
    {
        if(str.isEmpty())
        {
            return str;
        }
        char chr = str.charAt(str.length()-1);

        if(str.length() == 1)
        {
            return Character.toString(Character.toUpperCase(chr));
        }
        if(str.substring(str.length()-2, str.length()-1).equals(" "))
        {
            chr = Character.toUpperCase(chr);
        }

        return recursion(str.substring(0, str.length()-1)) + Character.toString(chr);
    }
    public static void main(String[] args) {
        String str = "i am alright";

        System.out.println(recursion(str));
        
    }    
}
