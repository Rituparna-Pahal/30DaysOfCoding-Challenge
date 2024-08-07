//"https://leetcode.com/problems/defanging-an-ip-address/"

public class Solution {
    public static void main(String[] args){
        String s="24.34.56.1111";
        System.out.println(defangIPaddr(s));
    }
    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
