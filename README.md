# Support Ticket Tracker

A Java-based support ticket management application built as part of my backend software engineering learning roadmap.

This project applies core Java programming and object-oriented design concepts to a practical help-desk workflow, including ticket creation, assignment, searching, prioritization, and reporting.

## Project Overview

Support Ticket Tracker models a simple IT support environment where users and support tickets can be organized and monitored.

The application demonstrates how Java classes, objects, collections, enums, control flow, exception handling, and file I/O concepts can work together to implement application logic and summarize support activity.

## Features

### User and Ticket Management

- User management
- Support ticket management
- Ticket assignment and reassignment
- Unassigned ticket handling
- Ticket status management
- Ticket priority management

### Search and Filtering

- Search tickets by title
- Search tickets by description
- Search by status
- Search by priority
- Search by assigned user
- Keyword searching
- Compound ticket searches

### Reporting and Analysis

- Ticket counting and reporting
- Ticket summaries by status and priority
- Highest-priority ticket detection
- Lowest-priority ticket detection
- Active ticket tracking
- Unassigned ticket reporting
- Oldest and most recently created ticket identification

## Java Concepts Demonstrated

This project provides hands-on practice with:

- **Object-oriented programming:** classes, objects, constructors, methods, and encapsulation
- **Data organization:** fields, getters, setters, and enums
- **Collections:** using `ArrayList` to organize and process application data
- **Control flow:** loops, conditional logic, and comparisons
- **Application logic:** searching, filtering, sorting or comparing ticket attributes, and generating summaries
- **Error handling:** exception handling and input validation
- **File I/O:** foundational file input/output concepts
- **Development workflow:** compiling, running, debugging, and verifying a Java application

## Project Structure

```text
SupportTicketTracker/
├── Main.java
├── User.java
├── SupportTicket.java
├── TicketStatus.java
├── TicketPriority.java
├── README.md
└── .gitignore
```

### Main Components

| File | Responsibility |
|---|---|
| `Main.java` | Application entry point and demonstration of ticket-management functionality |
| `User.java` | Represents a user who can be associated with support tickets |
| `SupportTicket.java` | Represents a ticket and its details, status, priority, and assignment |
| `TicketStatus.java` | Defines the available ticket statuses |
| `TicketPriority.java` | Defines ticket priority levels |
| `README.md` | Project documentation |
| `.gitignore` | Specifies files Git should ignore |

## Example Workflow

The application demonstrates how support tickets can be tracked across different users, statuses, and priority levels.

Example records from the project include:

| Ticket ID | Description | Status | Priority | Assigned User |
|---|---|---|---|---|
| `1001` | VPN | `OPEN` | `HIGH` | Chris Edwards |
| `1003` | Email service not working | `IN_PROGRESS` | `HIGH` | Alex Johnson |
| `1004` | Printer | `OPEN` | `LOW` | Alex Johnson |

The application can also summarize ticket activity, count tickets by status and priority, identify unassigned tickets, and determine which ticket has the highest priority.

These examples illustrate the project's data model and reporting logic rather than a separate production service.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 21 or a compatible version
- A Java development environment, such as IntelliJ IDEA or Visual Studio Code

### Compile and Run

The source files are organized as individual Java classes. The exact commands depend on the project's current source layout and the name of its entry-point class.

Open the project in your Java IDE, locate `Main.java`, and run its `main` method. Alternatively, compile the source files together and execute the resulting main class from a terminal.

## Project Goals

This project was created to strengthen foundational Java skills through a practical application.

Key learning goals include:

1. Applying object-oriented programming to model users and support tickets.
2. Using collections and enums to organize application data.
3. Building reusable search, filtering, and reporting logic.
4. Practicing exception handling and input validation.
5. Developing confidence with Java compilation, execution, and debugging.
6. Building a foundation for more advanced backend engineering topics.

## Project Status

**Status:** Completed Java fundamentals learning milestone.

This project is part of my ongoing backend software engineering roadmap, progressing from programming fundamentals toward advanced SQL, REST APIs, databases, and production-oriented backend development.

## Author

**Chris Edwards**

GitHub: [@chrisedwards551](https://github.com/chrisedwards551)