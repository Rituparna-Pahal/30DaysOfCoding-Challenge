//"https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/"

public class Solution {
    public static void main(String[] args){
        String[] w1={"sentence","s"};
        String[] w2={"sent","ences"};
        System.out.println(arrayStringsAreEqual(w1,w2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String c1 = "";
       for (String s : word1) {
           c1 += s;
       }
       String c2 = "";
       for (String s : word2) {
           c2 += s;
       }
       return c1.equals(c2);
   }
}
