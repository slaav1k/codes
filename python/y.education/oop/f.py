class Rectangle:

    def __init__(self, a, b) -> None:
        self.x0 = a[0]
        self.y0 = a[1]
        self.x1 = b[0]
        self.y1 = b[1]
        self.a = abs(self.x0 - self.x1)
        self.b = abs(self.y0 - self.y1)

    def perimeter(self):
        return round(self.a * 2 + self.b * 2, 2)

    def area(self):
        return round(self.a * self.b, 2)

    def get_pos(self):
        return (round(self.x0, 2), round(self.y0, 2))
    
    def get_size(self):
        return (round(self.a, 2), round(self.b, 2))
    
    def move(self, dx, dy):
        self.x0 += dx
        self.y0 += dy
        self.x1 += dx
        self.y1 += dy
    
    def resize(self, width, height):
        self.a = width
        self.b = height
        self.x1 = self.a + self.x0
        self.y1 = self.b + self.y0



rect = Rectangle((3.2, -4.3), (7.52, 3.14))
print(rect.get_pos(), rect.get_size())
rect.move(1.32, -5)
print(rect.get_pos(), rect.get_size())