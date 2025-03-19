class Cola:
    def __init__(self, n):
        self.arreglo = [0] * n
        self.inicio = -1
        self.fin = -1
    def insert(self, e):
        if self.is_full():
            print("Cola llena")
            return
        if self.inicio == -1:
            self.inicio = 0
        self.fin += 1
        self.arreglo[self.fin] = e
    def remove(self):
        if self.is_empty():
            print("Cola vacía")
            return -1
        e = self.arreglo[self.inicio]
        self.inicio += 1
        if self.inicio > self.fin:
            self.inicio = self.fin = -1
        return e
    def is_empty(self):
        return self.inicio == -1
    def is_full(self):
        return self.fin == len(self.arreglo) - 1
    def size(self):
        if self.is_empty():
            return 0
        return self.fin - self.inicio + 1
cola = Cola(10)
cola.insert(10)
cola.insert(20)
cola.insert(30)
cola.insert(40)
cola.insert(50)
print("Tamaño de la cola:", cola.size())
print("remove() =", cola.remove())
print("remove() =", cola.remove())
print("remove() =", cola.remove())
print("remove() =", cola.remove())
print("remove() =", cola.remove())
cola.insert(60)
print("Tamaño de la cola:", cola.size())
print("remove() =", cola.remove())
cola.insert(70)
print("Tamaño de la cola:", cola.size())
print("remove() =", cola.remove())