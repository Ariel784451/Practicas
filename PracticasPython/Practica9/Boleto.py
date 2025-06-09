import tkinter as tk
from tkinter import ttk
class Boleto:
    def __init__(self, numero):
        self.numero = numero
    def calcular_precio(self):
        return 0.0
    def __str__(self):
        return f"Número: {self.numero}, Precio: {self.calcular_precio():.1f}"

class Palco(Boleto):
    def calcular_precio(self):
        return 100.0

class Platea(Boleto):
    def __init__(self, numero, dias):
        super().__init__(numero)
        self.dias = dias
    def calcular_precio(self):
        return 50.0 if self.dias >= 10 else 45.0

class Galeria(Boleto):
    def __init__(self, numero, dias):
        super()._init_(numero)
        self.dias = dias
    def calcular_precio(self):
        return 25.0 if self.dias >= 10 else 30.0

class Aplicacion:
    def __init__(self, root):
        self.root = root
        self.root.title("Teatro Municipal")
        tk.Label(root, text="Teatro Municipal", font=("Arial", 20)).pack(pady=10)
        frame = tk.LabelFrame(root, text="Datos del Boleto", padx=10, pady=10)
        frame.pack(padx=10, pady=5)
        self.tipo_boleto = tk.StringVar(value="Palco")
        ttk.Radiobutton(frame, text="Palco", variable=self.tipo_boleto, value="Palco").grid(row=0, column=0)
        ttk.Radiobutton(frame, text="Platea", variable=self.tipo_boleto, value="Platea").grid(row=0, column=1)
        ttk.Radiobutton(frame, text="Galería", variable=self.tipo_boleto, value="Galeria").grid(row=0, column=2)
        tk.Label(frame, text="Número:").grid(row=1, column=0, pady=5)
        self.numero_entry = tk.Entry(frame)
        self.numero_entry.grid(row=1, column=1, columnspan=2)
        tk.Label(frame, text="Cant. Días para el Evento:").grid(row=2, column=0, pady=5)
        self.dias_entry = tk.Entry(frame)
        self.dias_entry.grid(row=2, column=1, columnspan=2)
        tk.Button(frame, text="Vende", command=self.vender_boleto).grid(row=3, column=0, pady=10)
        tk.Button(frame, text="Salir", command=root.quit).grid(row=3, column=2)
        self.resultado = tk.Label(root, text="Información", font=("Arial", 12))
        self.resultado.pack(pady=10)

    def vender_boleto(self):
        tipo = self.tipo_boleto.get()
        numero = self.numero_entry.get()
        dias_texto = self.dias_entry.get()
        if not numero:
            self.resultado.config(text="Debe ingresar un número.")
            return
        try:
            dias = int(dias_texto) if tipo != "Palco" else 0
        except ValueError:
            self.resultado.config(text="Días inválidos.")
            return
        if tipo == "Palco":
            boleto = Palco(numero)
        elif tipo == "Platea":
            boleto = Platea(numero, dias)
        else:
            boleto = Galeria(numero, dias)
        self.resultado.config(text=str(boleto))

if __name__ == "__main__":
    root = tk.Tk()
    app = Aplicacion(root)
    root.mainloop()