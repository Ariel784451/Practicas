from B import B
from A import A
class D(A,B):
    def __init__(self,x,y,z):
        A.__init__(self,x,z)
        B.__init__(self,y,z)
        
    def incrementaXYZ(self):
        self.x = self.x+1
        self.y = self.y+1
        self.z = self.z+1
    def __str__(self):
        return (f"x={self.x}, y={self.y},z={self.z}")
class main():
    c= D(5,10,5)
    print(f"Original: {c}")
    print("Usando los incrementos")
    c.incrementaZ()
    print(f"incrementoZ : {c}")
    c.incrementaXZ()
    print(f"incrementoXZ : {c}")
    c.incrementaYZ()
    print(f"incrementoYZ : {c}")
    c.incrementaXYZ()
    print(f"incrementoXYZ : {c}")