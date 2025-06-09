class Ministerio:
    def __init__(self, nombre, direccion, nroEmpleados_inicial=0):
        self.nombre = nombre
        self.direccion = direccion
        self.nroEmpleados = nroEmpleados_inicial
        self.empleados = []  
        self.edades = []
        self.sueldos = []

    def agregar_empleado(self, nombre, edad, sueldo):
        if self.nroEmpleados < 100:
            self.empleados.append({'nombre': nombre, 'edad': edad, 'sueldo': sueldo})
            self.edades.append(edad)
            self.sueldos.append(sueldo)
            self.nroEmpleados += 1
        else:
            print(f"No se pueden agregar más empleados al ministerio '{self.nombre}'.")

    def eliminar_empleado_por_edad(self, edad_eliminar):
        empleados_filtrados = [empleado for empleado in self.empleados if empleado['edad'] != edad_eliminar]
        edades_filtradas = [edad for edad in self.edades if edad != edad_eliminar]
        sueldos_filtrados = [empleado['sueldo'] for empleado in self.empleados if empleado['edad'] != edad_eliminar]

        empleados_eliminados = self.nroEmpleados - len(empleados_filtrados)
        self.empleados = empleados_filtrados
        self.edades = edades_filtradas
        self.sueldos = sueldos_filtrados
        self.nroEmpleados = len(self.empleados)

        print(f"Se eliminaron {empleados_eliminados} empleados con edad {edad_eliminar} del ministerio '{self.nombre}'.")

    def transferir_empleado(self, otro_ministerio, nombre_empleado):
        empleado_transferir = None
        indice_transferir = -1
        for i, empleado in enumerate(self.empleados):
            if empleado['nombre'] == nombre_empleado:
                empleado_transferir = empleado
                indice_transferir = i
                break

        if empleado_transferir:
            otro_ministerio.agregar_empleado(
                empleado_transferir['nombre'],
                empleado_transferir['edad'],
                empleado_transferir['sueldo']
            )
            del self.empleados[indice_transferir]
            del self.edades[indice_transferir]
            del self.sueldos[indice_transferir]
            self.nroEmpleados -= 1
            print(f"Se transfirió al empleado '{nombre_empleado}' del ministerio '{self.nombre}' al ministerio '{otro_ministerio.nombre}'.")
        else:
            print(f"No se encontró al empleado '{nombre_empleado}' en el ministerio '{self.nombre}'.")

    def mostrar_empleados_menor_edad(self):
        if not self.empleados:
            print(f"No hay empleados en el ministerio '{self.nombre}'.")
            return

        edad_minima = min(self.edades)
        empleados_menor_edad = [empleado for empleado in self.empleados if empleado['edad'] == edad_minima]
        print(f"\nEmpleados con la menor edad ({edad_minima}) en el ministerio '{self.nombre}':")
        for empleado in empleados_menor_edad:
            print(f"- Nombre: {empleado['nombre']}, Edad: {empleado['edad']}, Sueldo: {empleado['sueldo']}")

    def mostrar_empleados_menor_sueldo(self):
        if not self.empleados:
            print(f"No hay empleados en el ministerio '{self.nombre}'.")
            return

        sueldo_minimo = min(self.sueldos)
        empleados_menor_sueldo = [empleado for empleado in self.empleados if empleado['sueldo'] == sueldo_minimo]
        print(f"\nEmpleados con el menor sueldo ({sueldo_minimo}) en el ministerio '{self.nombre}':")
        for empleado in empleados_menor_sueldo:
            print(f"- Nombre: {empleado['nombre']}, Edad: {empleado['edad']}, Sueldo: {empleado['sueldo']}")

ministerio_salud = Ministerio("Ministerio de Salud", "Av. Arce Nro. 1234")
ministerio_educacion = Ministerio("Ministerio de Educación", "Calle Bolivar esq. Sucre", 5) 

ministerio_salud.agregar_empleado("Pedro Rojas", 35, 2500)
ministerio_salud.agregar_empleado("Lucy Sosa", 43, 3250)
ministerio_salud.agregar_empleado("Ana Perez", 26, 2700)
ministerio_salud.agregar_empleado("Saul Arce", 29, 2500)
ministerio_educacion.agregar_empleado("Carla Mendez", 30, 2800)
ministerio_educacion.agregar_empleado("Jorge Vargas", 40, 3500)
ministerio_educacion.agregar_empleado("Maria Flores", 22, 2600)

print("\n--- Estado inicial de los ministerios ---")
print(f"Ministerio: {ministerio_salud.nombre}, Dirección: {ministerio_salud.direccion}, Nro. Empleados: {ministerio_salud.nroEmpleados}")
for empleado in ministerio_salud.empleados:
    print(f"- Nombre: {empleado['nombre']}, Edad: {empleado['edad']}, Sueldo: {empleado['sueldo']}")

print(f"\nMinisterio: {ministerio_educacion.nombre}, Dirección: {ministerio_educacion.direccion}, Nro. Empleados: {ministerio_educacion.nroEmpleados}")
for empleado in ministerio_educacion.empleados:
    print(f"- Nombre: {empleado['nombre']}, Edad: {empleado['edad']}, Sueldo: {empleado['sueldo']}")

edad_a_eliminar_salud = 29
ministerio_salud.eliminar_empleado_por_edad(edad_a_eliminar_salud)
edad_a_eliminar_educacion = 40
ministerio_educacion.eliminar_empleado_por_edad(edad_a_eliminar_educacion)

print("\n--- Estado de los ministerios después de eliminar empleados por edad ---")
print(f"Ministerio: {ministerio_salud.nombre}, Nro. Empleados: {ministerio_salud.nroEmpleados}, Empleados: {ministerio_salud.empleados}")
print(f"Ministerio: {ministerio_educacion.nombre}, Nro. Empleados: {ministerio_educacion.nroEmpleados}, Empleados: {ministerio_educacion.empleados}")

empleado_a_transferir = "Maria Flores"
ministerio_educacion.transferir_empleado(ministerio_salud, empleado_a_transferir)

print("\n--- Estado de los ministerios después de la transferencia ---")
print(f"Ministerio: {ministerio_salud.nombre}, Nro. Empleados: {ministerio_salud.nroEmpleados}, Empleados: {ministerio_salud.empleados}")
print(f"Ministerio: {ministerio_educacion.nombre}, Nro. Empleados: {ministerio_educacion.nroEmpleados}, Empleados: {ministerio_educacion.empleados}")
ministerio_salud.mostrar_empleados_menor_edad()
ministerio_salud.mostrar_empleados_menor_sueldo()

ministerio_educacion.mostrar_empleados_menor_edad()
ministerio_educacion.mostrar_empleados_menor_sueldo()