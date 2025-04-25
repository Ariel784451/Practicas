from JuegoAdivinaNumero import JuegoAdivinaNumero  
from JuegoAdivinaImpar import JuegoAdivinaImpar    
from JuegoAdivinaPar import JuegoAdivinaPar        

class Aplicacion:
    @staticmethod
    def main():
        j1 = JuegoAdivinaNumero(1, 0, 3)
        j2 = JuegoAdivinaImpar(2, 0, 5) 
        j3 = JuegoAdivinaPar(2, 0, 2)  
        j1.Juega()
        j2.Juega()
        j3.Juega()
if __name__ == "__main__":
    Aplicacion.main()