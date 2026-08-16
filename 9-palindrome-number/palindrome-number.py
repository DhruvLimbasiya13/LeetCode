class Solution:
    def isPalindrome(self, x: int) -> bool:
        temp = x
        ans= rev =0
        while(temp>0):
            r=(temp%10)
            rev = rev*10 + r
            temp//=10
        if x == rev:
            return True
        else:
            return False
        