import random
from Juego import Juego
class JuegoAdivinaNumero(Juego):
    def __init__(self, numeroDeVidas, record, numeroAAdivinar):
        super().__init__(numeroDeVidas, record)
        self.numeroAAdivinar = numeroAAdivinar
    def Juega(self):
        self.reiniciaPartida()
        print("Adivina el numero entre 1 al 10")
        while self.get_numeroDeVidas() > 0:
            intento = int(input("Ingrese tu intento: "))
            
            if self.validaNumero(intento):
                if intento == self.numeroAAdivinar:
                    print("Acertaste !!")
                    self.actualizaRecord()
                    break
                else:
                    if self.quitaVida():
                        if intento > self.numeroAAdivinar:
                            print("El numero que ingresaste es mayor")
                        elif intento < self.numeroAAdivinar:
                            print("El numero que ingresaste es menor")
                        print(f"Te queda {self.get_numeroDeVidas()} vidas")
                        print("Intenta de nuevo")
                    else:
                        print("Se acabaron tus vidas")
                        break
            else:
                print("Numero no valido")
    def validaNumero(self, n):
        if 1<= n <= 10:
            return True
        else:
            return False