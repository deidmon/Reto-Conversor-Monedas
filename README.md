# Convertidor de Monedas

¡Bienvenido al proyecto **Convertidor de Monedas**! Este programa es una aplicación de consola escrita en Java que permite convertir montos entre diferentes monedas, utilizando tasas de cambio dinámicas obtenidas de una API de tipo de cambio.

---

## 🛠️ Funcionalidades

1. **Conversión entre monedas comunes**:
   - Dólar estadounidense (USD) ↔ Peso argentino (ARS)
   - Dólar estadounidense (USD) ↔ Real brasileño (BRL)
   - Dólar estadounidense (USD) ↔ Sol peruano (PEN)

2. **Obtención de tasas de cambio dinámicas**:
   - Las tasas de cambio se obtienen en tiempo real desde una API externa.

3. **Interfaz intuitiva de consola**:
   - Menú interactivo que permite seleccionar la operación deseada.


---

## 🏗️ Estructura del Proyecto

El proyecto se organiza en varias clases principales:

- **`Principal`**: Contiene el menú principal y la lógica de interacción con el usuario.
- **`MonedasUsuales`**: Un `enum` que enumera las monedas soportadas (USD, ARS, BRL, PEN, etc.).
- **`ConvertirMoneda`**: Clase encargada de manejar la lógica de conversión, incluyendo la obtención de tasas desde la API.
- **`MonedaExch`**: Representa la estructura del JSON obtenido de la API.

---

## 🚀 Requisitos

- **Java 11** o superior
- Conexión a Internet (para obtener tasas de cambio)
- Una API key válida para acceder al servicio de tasas de cambio

---

