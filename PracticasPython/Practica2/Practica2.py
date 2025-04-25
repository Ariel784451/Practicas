import math
import turtle
class Punto:
    def __init__(self, x, y):
        self.x =x
        self.y=y
    def __str__(self):
        return "({:.2f}, {:.2f})".format(self.x,self.y)
class Linea:
    def __init__(self, p1, p2):
        self.p1= p1
        self.p2 = p2
    def Dibujar_Linea(self):
        turtle.speed(1)
        turtle.penup()
        turtle.goto(self.p1.x, self.p2.y)
        turtle.pendown()
        turtle.goto(self.p2.x, self.p2.y)
        turtle.hideturtle()
    def __str__(self):
        return "{} , {}".format(self.p1, self.p2)
class Circulo:
    def __init__(self, centro,radio):
        self.centro=centro
        self.radio=radio
    def Dibujar_Circulo(self):
        turtle.speed(1)
        turtle.penup()
        turtle.goto(self.centro.x, self.centro.y - self.radio)
        turtle.pendown()
        turtle.circle(self.radio)
        turtle.hideturtle()
    def __str__(self):
        return "Centro: {}, Radio: {:.2f}".format(str(self.centro), self.radio)
p1=Punto(-250,150)
p2=Punto(150,-175)
l1= Linea(p1,p2)
print(l1)
p3=Punto(50,50)
r=100
c1=Circulo(p3,r)
print(c1)
c1.Dibujar_Circulo()
l1.Dibujar_Linea()
turtle.done()