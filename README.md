# 🏆 CR7 API - Títulos Ganados por Cristiano Ronaldo

API REST desarrollada con Spring Boot que permite gestionar los títulos ganados por Cristiano Ronaldo a lo largo de su carrera. Esta API forma parte de la práctica complementaria a una web estática desarrollada previamente.

---

## 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot 3
- Maven
- Postman (para pruebas)
- IntelliJ IDEA

---

## 🎯 Funcionalidades del API

La API permite realizar operaciones **CRUD** (Crear, Leer, Actualizar y Borrar) sobre un listado de títulos.

Cada título contiene:
```json
{
  "id": 1,
  "nombre": "Champions League",
  "año": 2018,
  "club": "Real Madrid"
}
```

## 📌 Endpoints del API

| Método | Ruta              | Descripción                       | Cuerpo requerido | Posibles respuestas |
|--------|-------------------|-----------------------------------|------------------|----------------------|
| GET    | `/titulos`        | Obtener todos los títulos         | No               | 200 OK               |
| GET    | `/titulos/{id}`   | Obtener un título por ID          | No               | 200 OK / 404 Not Found |
| POST   | `/titulos`        | Crear un nuevo título             | ✅ JSON          | 200 OK               |
| PUT    | `/titulos/{id}`   | Actualizar un título existente    | ✅ JSON          | 200 OK / 404 Not Found |
| DELETE | `/titulos/{id}`   | Eliminar un título por su ID      | No               | 204 No Content / 404 Not Found |


## ⚙️ Cómo ejecutar el proyecto

1. Clona el repositorio: git clone https://github.com/borja12/p4.git

2. Ábrelo con IntelliJ IDEA

3. Ejecuta la clase: Cr7ApiApplication.java

4. Accede al backend desde: http://localhost:8080


## 🌐 Integración con Web (Frontend)

Este backend está conectado a una página web creada previamente con HTML, CSS y JavaScript.  
La web usa `fetch()` para comunicarse con esta API REST y mostrar los títulos en tiempo real.

📍 **Nota importante:**  
Para que la funcionalidad de edición de títulos en la web funcione correctamente, es necesario tener el backend ejecutándose localmente en `http://localhost:8080`.