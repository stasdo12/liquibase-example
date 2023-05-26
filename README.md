
# Liquibase Example

This is a sample project that demonstrates the usage of Liquibase for managing database schema changes in a Spring Boot application.

## Prerequisites

Before running the application, make sure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- PostgreSQL database server

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/liquibase-example.git
   ```

2. Configure the database connection:

   Open the `src/main/resources/application.yml` file and modify the `spring.datasource` section according to your PostgreSQL database configuration.

3. Run the application:

   ```bash
   ./gradlew bootRun
   ```

   This will start the Spring Boot application and Liquibase will automatically apply the database changes specified in the changelog file.

4. Test the application:

   You can now access the application at [http://localhost:8080](http://localhost:8080) and perform CRUD operations on the `article` table.

## Changelog

The database schema changes are managed using Liquibase. The changelog file is located at `src/main/resources/db/changelog/db.changelog-master.yaml`. It contains the following changesets:

- `dev-1`: Creates the initial `article` table with columns `id`, `url`, `title`, `is_visible`, and `created`.
- `dev-2`: Renames the `title` column to `header` in the `article` table.

## Contributing

If you want to contribute to this project, you can follow these steps:

1. Fork the repository.
2. Create a new branch: `git checkout -b my-feature`.
3. Make your changes and commit them: `git commit -am 'Add new feature'`.
4. Push the branch: `git push origin my-feature`.
5. Submit a pull request.

