# ORM: Простой ORM для Java с использованием Reflections API

ORM - это простой объектно-реляционный отображатель (ORM), написанный на Java, который использует Reflections API для автоматического преобразования Java-объектов в SQL-запросы и обратно. Этот проект предназначен для небольших приложений, где не требуется полноценный ORM-фреймворк, таких как Hibernate.

## Функции

- Преобразование Java-объектов в SQL-запросы (INSERT, UPDATE, DELETE).
- Генерация SQL-запросов для создания таблиц на основе классов Java.
- Использование Reflections API для динамического анализа классов и полей.

## Предварительные требования

- Java 8 или более позднюю версию.
- Maven для сборки проекта.
- PostgreSQL database for data storage.

## Database Setup

1. Install PostgreSQL on your local machine or server.
2. Configure the database connection in your `database.properties` file 
   with the following settings: