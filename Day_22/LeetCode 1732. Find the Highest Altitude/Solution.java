//"https://leetcode.com/problems/find-the-highest-altitude/"

public Solution{
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        int highestAltitude = largestAltitude(gain);
        System.out.println("Highest Altitude: " + highestAltitude); 
    }
    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        
        for (int altitudeGain : gain) {
            currentAltitude += altitudeGain;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        
        return maxAltitude;
    }
}