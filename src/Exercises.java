public class Exercises {

    public static String scroll(String s1){
        char c1 = s1.charAt(0);
        String s2 = s1.substring(1);
        return s2 + c1;
    }

    public static String convertName(String s1){
        int comma = s1.indexOf(",");
        String s2 = s1.substring(comma+2);
        s2 = s2.trim();
        String s3 = s1.substring(0,comma);
        s3 = s3.trim();
        return s2 + " " + s3;
    }

    public static String negative(String s1){
        s1 = s1.replace("1","2");
        s1 = s1.replace("0", "9");
        s1 = s1.replace("2", "0");
        s1 = s1.replace("9","1");
        return s1;
    }

    public static String dateString(String dateStr){
        String month = dateStr.substring(0,2);
        String day = dateStr.substring(3,5);
        String year = dateStr.substring(6);
        return day + "-" + month + "-" + year;
    }

    public static String dateString2(String dateStr){
        int d = dateStr.indexOf("/");
        int m = dateStr.indexOf("/", d+1);
        String month = dateStr.substring(0,d);
        String day = dateStr.substring(d+1,m);
        String year = dateStr.substring(m+1);
        if (day.length()<2){
            day = "0" + day;
        }
        if (month.length()<2){
            month = "0" + month;
        }
        return day + "-" + month + "-" + year;
    }

    public static boolean startsWith(String s, String prefix){
        int len1 = s.length();
        int len2 = prefix.length();
        return (!(len1<len2) && s.substring(0,len2).equals(prefix));
    }

    public static boolean endsWith(String s, String suffix){
        int len1 = s.length();
        int len2 = suffix.length();
        return (!(len1<len2) && s.substring(len1-len2).equals(suffix));
    }

    public static String removeTag(String s, String tag){
        int x = s.indexOf("<"+tag+">");
        int y = s.indexOf("</"+tag+">");
        if(x != -1 && y != -1 && x<y){
            return (s.substring(x+3,y));
        }
        else {
            return s;
        }
    }

    public static void main(String[] args) {
        System.out.println(scroll("Hello World"));

        System.out.println(convertName(" Reubenstein, Lori Renee     "));

        System.out.println(negative("0010111001"));

        System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));

        System.out.println("04/20/2014 becomes " + dateString2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + dateString2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + dateString2("04/2/2014"));
        System.out.println("4/2/2014 becomes " + dateString2("4/2/2014"));

        System.out.println("\nstartsWith");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));

        System.out.println("\nendsWith");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));

        System.out.println("\nremoveTag");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</b>Hello World<b>", "b"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b> Happy Birthday", "b"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}