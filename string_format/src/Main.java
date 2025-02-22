public class Main {
    public static void main(String[] args) {
        String origin = " abcde FGHIJ ABC abc FG ";
        String O1 = origin.toLowerCase();
        String O2 = origin.toUpperCase();
        String O3 = origin.trim();
        String O4 = origin.substring(3);
        String O5 = origin.substring(2, 4);
        String O6 = origin.replace("a", "m");
        int O7 = origin.indexOf("abc");
        int O8 = origin.lastIndexOf("abc");

        System.out.println("Origin: " + origin);
        System.out.println("LowerCase: " + O1);
        System.out.println("UpperCase: " + O2);
        // remove space start and end
        System.out.println("Trim: " + "-" +O3 + "-");
        System.out.println("SubString(2): " + O4);
        System.out.println("SubString(2, 4): " + O5);
        System.out.println("replace('a', 'm'):" + O6);
        System.out.println("indexOf:" + O7);
        System.out.println("lastIndexOf:" + O8);


        String s = "Mikael Carvalho de Barros";

        String[] vect = s.split(" ");
        String word0 = vect[0];
        String word1 = vect[1];
        String word2 = vect[2];
        String word3 = vect[3];

        System.out.println(word0);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);



    }
}