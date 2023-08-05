package firstPackage;

public class EmployeeInfo {
    public static void main(String[] args) {
        String info="David,SDET,Chicago";
        System.out.println((info.substring(0,5)+"\n"+info.substring(6,10)+"\n"+info.substring(11,18)).toUpperCase());



    }
}
