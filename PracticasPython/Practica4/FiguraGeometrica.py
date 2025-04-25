from multipledispatch import dispatch
import math
@dispatch(float)
def calcular_area(radio):
    return math.pi * radio ** 2
@dispatch(float,float)
def calcular_area(base, altura):
    return base*altura
@dispatch(float, float, str)
def calcular_area(base, altura, tipo):
    if tipo == "triangulo":
        return (base*altura)/2
    return "tipo no valido"
@dispatch(float, float, float)
def calcular_area(base_mayor, base_menor, altura, tipo):
    if tipo == "trapecio":
        return ((base_mayor + base_menor)* altura) /2
    return "tipo no valido"
@dispatch(float, float, int)
def calcular_area(lado,apotema,lados):
    if lados == 5:
        perimetro = lado *lados
        return (perimetro * apotema) / 2
    return "no es un pentagono"
print("Área círculo:", calcular_area(5.0))
print("Área rectángulo:", calcular_area(4.0, 6.0))
print("Área triángulo rectángulo:", calcular_area(3.0, 5.0, "triángulo"))
print("Área trapecio:", calcular_area(8.0, 5.0, 4.0, "trapecio"))
print("Área pentágono:", calcular_area(6.0, 4.0, 5))
