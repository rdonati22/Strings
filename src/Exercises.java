public class Exercises {

    public static String scroll(String s1){
        char c1 = s1.charAt(0);
        String s2 = s1.substring(1);
        return s2 + c1;
    }

    public static String convertName(String s1){
        int len = s1.length();
        int comma = s1.indexOf(",");
        String s2 = s1.substring(comma+2);
        String s3 = s1.substring(0,comma);
        return s2 + " " + s3;
    }

    public static String negative(String s1){
        String s2 = s1;
        String s3 = s1.replaceAll("0", "1");
        s3 = s2.replaceAll("1", "0");
        return s3;
    }

    public static String dateString(String dateStr){
        dateStr = dateStr.replaceAll("/", "-");
        String month = dateStr.substring(0,2);
        String day = dateStr.substring(3,5);
        dateStr = dateStr.replace(dateStr.substring(0,2), day);
        String dateStr2 = dateStr.replace(dateStr.substring(3,5), month);
        String dateStr3 = dateStr2.replace(dateStr2.substring(0,2), day);
        return dateStr3;
    }

    public static String dateString2(String s){
        return s;
    }

    public static boolean startsWith(String s, String prefix){
        return true;
    }

    public static boolean endsWith(String s, String suffix){
        return false;
    }

    public static String removeTag(String s, String tag){
        return "progress";
    }

    public static void main(String[] args) {
        //System.out.println(scroll("Hello World"));

        System.out.println(convertName(" Reubenstein, Lori Renee     "));

        System.out.println(negative("0010111001"));

//        System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));
//
//        System.out.println("04/20/2014 becomes " + dateString2("04/20/2014"));
//        System.out.println("4/20/2014 becomes " + dateString2("4/20/2014"));
//        System.out.println("04/2/2014 becomes " + dateString2("04/2/2014"));
//        System.out.println("4/2/2014 becomes " + dateString2("4/2/2014"));
//
//        System.out.println("\nstartsWith");
//        System.out.println(startsWith("architecture", "arch"));
//        System.out.println(startsWith("architecture", "a"));
//        System.out.println(startsWith("arch", "architecture"));
//        System.out.println(startsWith("architecture", "rch"));
//        System.out.println(startsWith("architecture", "architecture"));
//
//        System.out.println("\nendsWith");
//        System.out.println(endsWith("astronomy", "nomy"));
//        System.out.println(endsWith("astronomy", "y"));
//        System.out.println(endsWith("astronomy", "nom"));
//        System.out.println(endsWith("nomy", "astronomy"));
//        System.out.println(endsWith("astronomy", "astronomy"));
//
//        System.out.println("\nremoveTag");
//        System.out.println(removeTag("<b>Hello World</b>", "b"));
//        System.out.println(removeTag("Hello World</b>", "b"));
//        System.out.println(removeTag("<b>Hello World", "b"));
//        System.out.println(removeTag("</b>Hello World<b>", "b"));
//        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
//        System.out.println(removeTag("<b>Hello World</b> Happy Birthday", "b"));
//        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}