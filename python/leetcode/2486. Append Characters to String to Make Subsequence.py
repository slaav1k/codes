def appendCharacters(s, t):
        k = 0  
        while k < len(t):
            if t[k] in s:
                s = s[s.index(t[k]) + 1:]
                k += 1
            else:
                return len(t) - k
        
        return 0

print(appendCharacters("coaching","codin"))