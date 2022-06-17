public class Solution {

    public int getSolution(int n) {
        int currentGapSize = 0;
        int maxGapSize = 0;
        String binaryString = Integer.toBinaryString(n);
        System.out.println(binaryString);

        for(int i = 1; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '0') {
                currentGapSize++;

            }else {
                if(currentGapSize > maxGapSize) {
                    maxGapSize = currentGapSize;
                }
                currentGapSize = 0;
            }
            System.out.println("Char " + i + " = " + binaryString.charAt(i)  +"; currentGap: " + currentGapSize + "; current max gap: " + maxGapSize);
        }

        return maxGapSize;
    }
}
