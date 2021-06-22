# ☕️ Schedule Generator (Desafío Banco Internacional)

> ℹ️ Api generadora de tareas (schedule) -> En este repositorio se encuentra un microservicio que generará los datos de entrada para el desafío

## ☝️ Dependencias

* Java 11
* Gradle (Wrapper incluido)

## 🚀 Instalación y ejecución

```bash
 ./gradlew bootRun
```

## 🏁 Objetivo

* Generar un proyecto que exponga un api rest (springboot) que de solución al problema expuesto a continuación
* Generar un proyecto frontend (React) que consuma y muestre los datos generados por el servicio construido

## El problema

En el repositorio actual se encontrará un microservicio que generará un listado de tareas de forma aleatoria, cada tarea tiene un tiempo
de ejecución (en hrs).
El objetivo es generar un api rest que agrupe las tareas de tal manera que retorne la minima cantidad de días en ser
terminadas considerando jornadas de trabajo de 8 horas. En conjunto con una interfaz que muestre de forma clara los datos 
al usuario final.


* Formato Entrada
```
GET http://localhost:8080/generator/schedule/tasks
```

```json
[
    {
    "task_id": "65b902ef-bd60-4a1c-aebb-21f929d57474",
    "task_name": "Task 0",
    "duration": 8
    },
    {
    "task_id": "35951c98-a9c9-45f6-990b-4e746957f156",
    "task_name": "Task 1",
    "duration": 3
    },
    {
    "task_id": "328f5534-aed7-44cd-a75a-d6f367fef51e",
    "task_name": "Task 2",
    "duration": 3
    }
]
```


* Ejemplo de respuesta (No necesariamente debe ser igual, ud puede considerar agregar o quitar información)

```json
{
  "hrs_jornada": 8,
  "dias_termino": 2,
  "jornadas": [
    {
      "id": 1,
      "tareas": [
        "65b902ef-bd60-4a1c-aebb-21f929d57474"
      ]
    },
    {
      "id": 2,
      "tareas": [
        "35951c98-a9c9-45f6-990b-4e746957f156",
        "328f5534-aed7-44cd-a75a-d6f367fef51e"
      ]
    }
  ]
}
```

## ☝️ Puntos a evaluar

* Solución al problema indicado
* Código limpio y ordenado
* Estructura de los proyectos
* Documentación
* Utilización de logs de trazabilidad
* Test

## ⭐️ Entrega desafío técnico

A continuación se encuentran las
[Instrucciones para el envío del desafío técnico](CONTRIBUTING.md)

