public class StringMutation {
    public static void main(String[] args) {
        String str1 = "a method";
        String str2 = "to my MADNESS";
        //to form: to my MADNESS a method (a1)
        String tmMam = str2+" "+str1;
        //to formL a method to my MADNESS (a2)
        String amtmM =str1 + " " + str2;//names are abbreviations of the sentences.
        //to form b
        char h = str1.charAt(5);
        //to form c
        String etho = str1.substring(3, 7);
        //to form d
        String mad = str2.substring(6, 9);
        //to form e
        String yes = (str2.charAt(4) + str2.substring(10,12)).toUpperCase();
        //to form f
        int eight = str1.length();
        String twoStr = str1.substring(0,2);
        int two = twoStr.length();
        int ten = eight + two;

        //to form g
        String tmbad = str2.replace("MAD", "BAD");

        System.out.printf("a1 = %s\na2 = %s\nb = %s\nc = %s\nd = %s\ne = %s\nf = %d\ng = %s", tmMam, amtmM, h, etho, mad, yes, ten, tmbad);
    }
}
/*
Construct one expression involving str1 and ( or) str2 that evaluates to the following values.
a1) "to my MADNESS A method"` and a2) "A method to my MADNESS"
b) 'h' // Single quote denotes char type and not a string type
c) "etho"
d) "MAD"
e) "YES" // Only use str1 and str2. Look for toUpperCase() method
f) 10 // Its an integer
g) "to my BADNESS" //Look for replace() method
 */
