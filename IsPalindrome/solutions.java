class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;
    
        while(left<right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

            if (!Character.isLetterOrDigit(c1)) {
                left++;
                continue;
            } 
            
            else if (!Character.isLetterOrDigit(c2)) {
                right--;
                continue;
            }

         if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                    System.out.println("deu errado!");
                    return false;
                }

            left++;
            right--;
        }
            System.out.println("Deu certin");
            return true;
    }
 public static void main(String[] args) {
        Solution s = new Solution();
        String name = "Was it a car or a cat I saw?";

        s.isPalindrome(name);

    }

}
