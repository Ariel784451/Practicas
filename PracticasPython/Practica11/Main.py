from Artista import Artista
from Artista import Anuncio
from Artista import Pintura

artista1 = Artista("Juan", "123", 5)
artista2 = Artista("Maria", "456", 10)

anuncio1 = Anuncio(1, 1000)
anuncio2 = Anuncio(2, 1500)

pintura1 = Pintura("El Sol", "óleo", artista1, artista2, "paisaje", anuncio1)
pintura2 = Pintura("La Luna", "acrílico", artista1, artista2, "abstracto")

def artista_con_mas_experiencia(p1, p2):
    artistas = [p1.artista1, p1.artista2, p2.artista1, p2.artista2]
    return max(artistas, key=lambda a: a.anios_experiencia)

pintura2.anuncio = anuncio2

def monto_total(p1, p2):
    total = 0
    if p1.anuncio:
        total += p1.anuncio.precio
    if p2.anuncio:
        total += p2.anuncio.precio
    return total

artista_exp = artista_con_mas_experiencia(pintura1, pintura2).nombre
total_venta = monto_total(pintura1, pintura2)

print("Artista con más experiencia:", artista_exp)
print("Monto total de venta:", total_venta)
