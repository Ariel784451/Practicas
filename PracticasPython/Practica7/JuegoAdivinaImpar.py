from JuegoAdivinaNumero import JuegoAdivinaNumero
class JuegoAdivinaImpar(JuegoAdivinaNumero):
    def __init__(self, numeroDeVidas, record, numeroAAdivinar):
        super().__init__(numeroDeVidas, record, numeroAAdivinar)
    def validaNumero(self, n):
            if 1 <= n <= 10 and n%2 == 1:
                return True
            elif 1 <= n <= 10 and n%2 != 1:
                print("ERROR")
                return False
            else:
                return False