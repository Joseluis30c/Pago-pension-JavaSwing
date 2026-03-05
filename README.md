# 💰 Pago Pensión – Java Swing

![Java](https://img.shields.io/badge/Java-8+-red)
![Status](https://img.shields.io/badge/Status-En%20desarrollo-green)
![License](https://img.shields.io/badge/License-MIT-yellow)

Sistema de escritorio desarrollado en Java utilizando Java Swing que permite calcular y gestionar el pago de pensiones mediante una interfaz gráfica.

------------------------------------------------------------------------

# 📚 Tabla de Contenido

- Descripción
- Objetivo del proyecto
- Tecnologías utilizadas
- Funcionalidades
- Estructura del proyecto
- Cómo ejecutar el proyecto
- Ejemplo de código
- Mejoras futuras
- Autor
- Apoya el proyecto

------------------------------------------------------------------------

# 📖 Descripción

Este proyecto consiste en una **aplicación de escritorio desarrollada en Java con interfaz gráfica usando Swing** para el cálculo del pago de pensiones.

El sistema permite ingresar datos relacionados con el pago y realizar automáticamente los cálculos necesarios para mostrar el monto final.

Este tipo de aplicación permite practicar:

- Interfaces gráficas en Java
- Programación orientada a objetos
- Manejo de eventos
- Lógica de negocio
------------------------------------------------------------------------

# 🎯 Objetivo del proyecto

El objetivo de este proyecto es:

- Desarrollar una **aplicación de escritorio con interfaz gráfica**
- Aplicar conceptos de **Programación Orientada a Objetos**
- Implementar cálculos automáticos relacionados con pagos
- Practicar el uso de **componentes de Java Swing**
- Crear un proyecto funcional para portafolio
------------------------------------------------------------------------

# 🛠 Tecnologías utilizadas

El proyecto utiliza las siguientes tecnologías:

- Java
- Java Swing
- NetBeans IDE
- JDK 8 o superior
------------------------------------------------------------------------

# ⚙️ Funcionalidades

El sistema incluye funcionalidades básicas como:

- Ingresar datos necesarios para calcular la pensión
- Procesar automáticamente los cálculos
- Mostrar resultados en la interfaz gráfica
- Interactuar con botones y formularios
- Validar información ingresada por el usuario
------------------------------------------------------------------------

# 📂 Estructura del proyecto

    Pago-pension-JavaSwing/
    ├── src/
    |  ├── Vista/
    |  ├── Modelo/
    |  ├── Controlador/
    ├── build/
    ├── dist/
    ├── nbproject/
    └── README.md

------------------------------------------------------------------------

# ▶️ Cómo ejecutar el proyecto

### 1️⃣ Clonar el repositorio

``` bash
git clone https://github.com/Joseluis30c/Pago-pension-JavaSwing.git
```

### 2️⃣ Abrir el proyecto en un IDE

Puedes usar:

-   IntelliJ IDEA
-   Eclipse
-   NetBeans

### 3️⃣ Ejecutar el programa

Presionar:

    Run Project (F6)

------------------------------------------------------------------------

# 💡 Ejemplo de código

Ejemplo simple de una ventana creada con **Java Swing:**:

``` java
import javax.swing.*;

public class VentanaEjemplo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Sistema de Pago de Pensiones");
        JButton boton = new JButton("Calcular");

        boton.setBounds(120, 100, 120, 40);

        frame.add(boton);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```

------------------------------------------------------------------------

# 🚀 Mejoras futuras

Algunas mejoras que podrían agregarse al proyecto:

-   Integración con base de datos
-   Registro histórico de pagos
-   Exportación de reportes
-   Generación de PDF
-   Mejor diseño de interfaz

------------------------------------------------------------------------

# 👨‍💻 Autor

**Jose Luis Chavesta Rivas**

GitHub\
https://github.com/Joseluis30c

------------------------------------------------------------------------

# ⭐ Apoya el proyecto

Si este proyecto te resulta útil o interesante:

⭐ Dale una estrella al repositorio en GitHub.
