//package com.company;

public class ErrorLog {

    private String machineId;
    private String description;

    /** Precondition: message is a valid Error log entry */
    public ErrorLog(String message) {
        int colon = message.indexOf(":");
        machineId = message.substring(0,colon);
        description = message.substring(colon+1);
        /* part a */
    }

    /** Returns true if the description in this error log entry
     * contains keyword; false otherwise.
     */
    public boolean containsKey(String keyword) {
        int key = description.indexOf(keyword);
        int len1 = keyword.length();
        int len2 = description.length();
        if (key != -1){
            if (key==0 && description.charAt(len1) == (' ')){
                return true;
            }
            if (key+len1 == len2 && description.charAt(key-1) == (' ')){
                return true;
            }
            return (description.charAt(key-1) == (' ') && description.charAt(key+len1) == (' '));
        }
        /* part b */
        return false;   // replace this
    }


    public String getMachineId() { return machineId;}
    public String getDescription() { return description; }

    public static void main(String[] args) {
        ErrorLog er1 = new ErrorLog("CLIENT2:security alert");
        ErrorLog er2 = new ErrorLog("Webserver:disk offline");
        ErrorLog er3 = new ErrorLog("SERVER22:file not found on disk3");
        ErrorLog er4 = new ErrorLog("SERVER15:read error on disk DSK7");
        ErrorLog er5 = new ErrorLog("SERVER22:write error on disk");
        ErrorLog er6 = new ErrorLog("Webserver:error on /dev/disk");

        System.out.println("message 1 " + er1.containsKey("disk"));
        System.out.println("message 2 " + er2.containsKey("disk"));
        System.out.println("message 3 " + er3.containsKey("disk"));
        System.out.println("message 4 " + er4.containsKey("disk"));
        System.out.println("message 5 " + er5.containsKey("disk"));
        System.out.println("message 6 " + er6.containsKey("disk"));


    }

}