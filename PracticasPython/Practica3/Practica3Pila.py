class Pila:
    def __init__(self, n):
        self.arreglo = [0] * n
        self.top = -1
    def push(self, e):
        if self.top < len(self.arreglo) - 1:
            self.top += 1
            self.arreglo[self.top] = e
        else:
            print("Pila llena no puedes agregar más elementos")
    def pop(self):
        if self.top == -1:
            print("Pila vacía no puedes ejecutar pop")
            return None
        e = self.arreglo[self.top]
        self.top -= 1
        return e
    def peek(self):
        if self.top == -1:
            print("Pila vacía. No se puede hacer peek.")
            return None
        return self.arreglo[self.top]

    def is_empty(self):
        return self.top == -1

    def is_full(self):
        return self.top == len(self.arreglo) - 1

    def size(self):
        return self.top + 1
pila = Pila(10)
pila.push(10)
pila.push(20)
pila.push(30)
print("pop() =", pila.pop())
print("pop() =", pila.pop())
print("peek() =", pila.peek())
print("is_empty() =", pila.is_empty())
print("is_full() =", pila.is_full())
print("size() =", pila.size())