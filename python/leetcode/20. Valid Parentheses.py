def isValid(s: str) -> bool:
    skobki = []
    for i in s:
        if i == '(':
            skobki.append('(')
        elif i == ')':
            if not skobki:
                return False
            elif skobki[-1] == '(':
                skobki.pop()
            else:
                return False
        elif i == '[':
            skobki.append('[')
        elif i == ']':
            if not skobki:
                return False
            elif skobki[-1] == '[':
                skobki.pop()
            else:
                return False
        elif i == '{':
            skobki.append('{')
        elif i == '}':
            if not skobki:
                return False
            elif skobki[-1] == '{':
                skobki.pop()
            else:
                return False
    if skobki:
        return False
    return True
