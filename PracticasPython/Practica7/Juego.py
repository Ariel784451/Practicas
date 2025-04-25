import random
class Juego:
    def __init__(self, numeroDeVidas, record):
        self.numeroDeVidas = numeroDeVidas
        self.record = record
    def reiniciaPartida(self):
        self.numeroDeVidas = self.get_numeroDeVidas()
        print(f"Partida reiniciada {self.numeroDeVidas} vidas")
    def actualizaRecord(self):
        self.record = self.record +1 
        print(f"El record ha sido actualizado: {self.record}")
    def quitaVida(self):
        if self.get_numeroDeVidas() > 0:
            self.numeroDeVidas -= 1
            return True
        else:
            return False
    def get_record(self):
        return self.record
    def set_record(self, record):
        self.record = record
    def get_numeroDeVidas(self):
        return self.numeroDeVidas
    def set_numeroDeVidas(self, numeroDeVidas):
        self.numeroDeVidas = numeroDeVidas