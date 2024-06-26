class Fraction:
    def __init__(self, *args) -> None:
        self.num = 0
        self.den = 0
        if isinstance(args[0], str):
            self.num, self.den = map(int, args[0].split("/"))
        else:
            self.num = args[0]
            self.den = args[1]
        self.__nod()
    
    def __nod(self):
        a = self.num
        b = self.den
        while b != 0:
            a, b = b, a % b
        d = abs(a)
        self.num /= d
        self.den /= d
    
    def numerator(self, *args):
        if len(args) == 0:
            return int(self.num)
        elif len(args) == 1:
            self.num = int(args[0])
            self.__nod()
    
    def denominator(self, *args):
        if len(args) == 0:
            return int(self.den)
        elif len(args) == 1:
            self.den = int(args[0])
            self.__nod()
    
    def __str__(self) -> str:
        return f"{int(self.num)}/{int(self.den)}"
    
    def __repr__(self) -> str:
        return f"Fraction({int(self.num)}, {int(self.den)})"


fraction = Fraction(3, 210)
print(fraction, repr(fraction))
fraction.numerator(10)
print(fraction.numerator(), fraction.denominator())
fraction.denominator(2)
print(fraction.numerator(), fraction.denominator())
    
    
    