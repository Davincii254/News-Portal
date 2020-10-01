# Organisational API

### Description
This is a REST API that helps retrieve news for an organization. The users should be able to add news, add users and view the same.
- By Victor Kuria

## Installation

* Clone the repo: `https://github.com/Davincii254/kush-news.git`
* Run the command `gradle build`
* Run the tests `gradle test`
* Launch the app `gradle run`.

### HTTP Methods

## End Points

| URL                                   | HTTP Verb     | Description                                        |
|---                                    |---            |---                                                 |
| /department/new                       | POST          | Add a new department                               |
| /departments                          | GET           | Displays all departments                           |
| /departments/:id                      | GET           | Displays department based on the department Id     |
| /users                                | GET           | Display All employees                              |
| /department/:id/users                 | GET           | Displays all employees in a department             |
| /news/new                             | POST          | Add news                                           |
| /                                     | GET           | View All News                                      |

### Prerequisites

- You need Java installed on your pc.
- You will need an IDE, preferably Intellij
- You also need Gradle. Install it using "sdk install gradle"
- You need postgres installed for the database to work.

### Setup.

- Clone the repo to your computer.
- Open the project folder with the IDE of your choice, preferably Intellij

### Database Setup
Launch your terminal, and type in *psql*. Then type the following

- CREATE DATABASE organisational_api;
- \c organisational_api;
- CREATE TABLE users (id serial PRIMARY KEY, name VARCHAR, position VARCHAR, role VARCHAR, departmentid INTEGER);
- CREATE TABLE departments (id serial PRIMARY KEY, name VARCHAR, description VARCHAR, numOfEmployees INTEGER);
- CREATE TABLE news (id serial PRIMARY KEY, title VARCHAR, content VARCHAR, departmentid INTEGER);
- CREATE DATABASE organisational_api_test WITH TEMPLATE organisational_api;
   
### API Documentation
* https://kush-news.herokuapp.com
* https://kush-news.herokuapp.com/users
* https://kush-news.herokuapp.com/departments

   
 - 
### Technologies Used
* Java
* Spark
* Heroku
* Intellij 
* Postgres  
 
 
#### Copyright (c) 2020 Davincii254

#### Licenced under the [MIT License](LICENSE)
