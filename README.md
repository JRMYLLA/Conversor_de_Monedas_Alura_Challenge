# Conversor_de_Monedas_Alura_Challenge
# 💰 Conversor de Monedas

Una aplicación Java que permite convertir entre diferentes monedas utilizando tasas de cambio en tiempo real.

## 🌟 Características

- ✅ Conversión entre múltiples monedas
- 🌐 Tasas de cambio en tiempo real
- 💱 Soporte para monedas principales de América Latina y Europa
- 🎯 Interfaz de consola fácil de usar
- 📊 Muestra la tasa de cambio actual

## 🔧 Tecnologías Utilizadas

- **Java 11+** - Lenguaje de programación
- **Gson** - Para el manejo de JSON
- **Exchange Rate API** - Para obtener las tasas de cambio
- **Maven** - Gestión de dependencias

## 💱 Monedas Soportadas

| Moneda | Código | País/Región |
|--------|--------|-------------|
| Dólar Estadounidense | USD | Estados Unidos |
| Sol Peruano | PEN | Perú |
| Peso Argentino | ARS | Argentina |
| Real Brasileño | BRL | Brasil |
| Euro | EUR | Unión Europea |

## 🚀 Instalación y Uso

### Prerrequisitos

- Java 11 o superior
- Maven 3.6+

### Clonar el repositorio

```bash
git clone https://github.com/JRMYLLA/conversor-monedas.git
cd conversor-monedas
```

### Compilar y ejecutar

```bash
# Compilar el proyecto
mvn compile

# Ejecutar la aplicación
mvn exec:java -Dexec.mainClass="lad.com.alura.conversormoneda.App"
```

## 📋 Conversiones Disponibles

1. **USD → PEN** - Dólar a Sol Peruano
2. **PEN → USD** - Sol Peruano a Dólar
3. **USD → ARS** - Dólar a Peso Argentino
4. **ARS → USD** - Peso Argentino a Dólar
5. **USD → BRL** - Dólar a Real Brasileño
6. **BRL → USD** - Real Brasileño a Dólar
7. **PEN → ARS** - Sol Peruano a Peso Argentino
8. **PEN → BRL** - Sol Peruano a Real Brasileño
9. **EUR → PEN** - Euro a Sol Peruano
10. **PEN → EUR** - Sol Peruano a Euro

## 🎮 Ejemplo de Uso

```
*************************************************
Bienvenido/a al Conversor de Monedas =)
*************************************************

1) Dólar =>> Sol peruano
2) Sol peruano =>> Dólar
...
Elija una opción válida: 1

Ingrese el valor que deseas convertir: 100
El valor 100.00 [Dólar estadounidense] corresponde al valor final de =>>> 371.50 [Sol peruano]
Tasa de cambio actual: 1 USD = 3.7150 PEN
```

## 🏗️ Estructura del Proyecto

```
conversor-monedas/
├── src/
│   └── main/
│       └── java/
│           └── lad/com/alura/conversormoneda/
│               ├── App.java
│               ├── Conversor.java
│               └── ConversorException.java
├── pom.xml
└── README.md
```

## 📦 Dependencias

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version>
</dependency>
```

## 🔑 API Key

Este proyecto utiliza [Exchange Rate API](https://www.exchangerate-api.com/) para obtener las tasas de cambio. La API key está incluida en el código para fines de demostración.

**Nota:** Para uso en producción, se recomienda obtener tu propia API key gratuita.

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Para contribuir:

1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## 📝 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

## 👨‍💻 Autor


- GitHub: https://github.com/JRMYLLA

## 🙏 Agradecimientos

- Alura
- Oracle

---

⭐ ¡Si te gustó este proyecto, dale una estrella en GitHub!
