class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def move(self, ox, oy):
        self.x += ox
        self.y += oy
    
    def length(self, p):
        result = ((p.x - self.x) ** 2 + (p.y - self.y) ** 2) ** 0.5
        return round(result, 2)


class PatchedPoint(Point):
    def __init__(self, *args):
        match len(args):
            case 0:
                super().__init__(0, 0)
            case 1:
                super().__init__(*args[0])
            case 2:
                super().__init__(*args)
    
    def __str__(self):
        return f"({self.x}, {self.y})"

    def __repr__(self):
        return f"PatchedPoint({self.x}, {self.y})"
    
    def __add__(self, other):
        return PatchedPoint(self.x + other[0], self.y + other[1])

    def __iadd__(self, other):
        super.move(other[0], other[1])
        return self
    
    
first_point = second_point = PatchedPoint((2, -7))
first_point += (7, 3)
print(first_point, second_point, first_point is second_point)