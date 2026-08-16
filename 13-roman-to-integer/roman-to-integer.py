class Solution:
    def romanToInt(self, s: str) -> int:
        res = 0 
        roman_map = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
        }

        for i in range(len(s)-1):
            current = roman_map[s[i]]
            next = roman_map[s[i+1]]

            if current < next:
                res -= current
            else :
                res += current

        res += roman_map[s[-1]]

        return res