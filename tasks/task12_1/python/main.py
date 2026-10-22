# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!
import point

p = point.Point(1.0, 2.0)
print(f"Point coordinates: ({p.x}, {p.y})")
print(f"Distance from origin: {p.distance()}")
print(f"Distance to point (4.5, 7.0): {p.distance_to(point.Point(4.5, 7.0))}")