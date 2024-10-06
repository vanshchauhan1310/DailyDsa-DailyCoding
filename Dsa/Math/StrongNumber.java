//User function Template for Java
class Solution {
    public int is_StrongNumber(int n) {
        // Code here
        int originalNum = n;  // Store original number for comparison
        int lastdigit;
        int sum = 0;
        
        while (n > 0) {
            lastdigit = n % 10;
            n = n / 10;
            sum += factorial(lastdigit);
        }
        
        if (sum == originalNum) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public int factorial(int lastdigit) {
        if (lastdigit == 0 || lastdigit == 1) {  // Fix 1: Handle 0 factorial
            return 1;
        }
        return lastdigit * factorial(lastdigit - 1);
    }
}