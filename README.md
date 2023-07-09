## Local deployment
<ul>

#### <li> Step 1: Install [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Docker-Desktop](https://www.docker.com/) in your computer if not installed. </li>

#### <li>Step 2: Open the project in IntelliJ IDEA. </li>

#### <li>Step 3: Add <em>docker-compose.yml</em> file in the root directory. (Skip: if postgres already installed)
``` yml
version: '3.1'

services:
  db:
    container_name: pg_container
    image: postgres
    restart: always
    environment:
      POSTGRES_USER: root
      POSTGRES_PASSWORD: password
      POSTGRES_DB: test_db
    ports:
      - "5432:5432"

# PGAdmin is a web-based Graphical User Interface (GUI) management application used to communicate
# with Postgres and derivative relational databases on both local and remote servers.
  pgadmin:
    container_name: pgadmin4_container
    image: dpage/pgadmin4
    restart: always
    environment:
      PGADMIN_DEFAULT_EMAIL: admin@admin.com
      PGADMIN_DEFAULT_PASSWORD: root
    ports:
      - "5050:80"
```
</li>

#### <li>Step 4: Changes below fields in <em>application.properties</em>. 
``` properties
spring.datasource.url=jdbc:postgresql://localhost:5432/test_db
spring.datasource.username=root
spring.datasource.password=password
```
<strong>Note:</strong> Please add your own credentials if you have skiped step 1 and 2.
</li>

#### <li>Step 5: Run the <em>docker-compose.yml</em> file.</li>

#### <li>Step 6: Run the SpringBoot application by running <em>DemoDeploymentApplication.java</em> class.</li>
</ul>
