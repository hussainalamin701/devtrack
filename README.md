# DevTrack

A JavaFX desktop application for tracking job applications.

I'm building DevTrack to refresh my Java skills, learn JavaFX, and practise developing a desktop application from initial setup through to a usable release.

## Current Features

- Enter a company name and job title.
- Validate that both fields contain text.
- Remove surrounding whitespace before validation.
- Clear the input fields after a valid submission.

Applications are not stored yet. The current version focuses on the entry form and validation.

## Technologies

- Java 21
- JavaFX with FXML
- Maven

## Running the Application

With JDK 21 and Maven installed, open a terminal in the directory containing `pom.xml` and run:

```bash
mvn javafx:run
```

## Planned Features

- Store and display job applications.
- Edit and delete applications.
- Track application status and dates.
- Search and filter applications.
- Save data locally using SQLite.
- Add automated tests for application logic.

## Development Log

### 28 October 2026

- Built the initial application-entry form.
- Connected FXML controls to the Java controller using `fx:id` and `@FXML`.
- Implemented button event handling and required-field validation.
- Added field clearing after valid submissions.
- Set up Git version control and excluded generated build files.