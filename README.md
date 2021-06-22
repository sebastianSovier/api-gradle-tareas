## ☝️ Dependencias

* Java 11
* Gradle (Wrapper incluido)

## 🚀 Instalación y ejecución

```bash
 ./gradlew bootRun
```

* Formato Respuesta Salida
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
