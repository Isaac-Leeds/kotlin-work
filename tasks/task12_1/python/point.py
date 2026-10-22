# Task 12.1: Point class
class Point:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def distance(self) -> float:
        from math import hypot
        return hypot(self.x, self.y)

    def distance_to(self, other: 'Point') -> float:
        from math import hypot
        return hypot(self.x - other.x, self.y - other.y)