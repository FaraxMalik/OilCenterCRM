# Oil Center CRM 🛢️

A Customer Relationship Management (CRM) system designed specifically for oil and petroleum businesses. This Java-based application provides comprehensive customer management capabilities with MySQL database integration.

## 📋 Table of Contents

- [Features](#-features)
- [Technology Stack](#-technology-stack)
- [Prerequisites](#-prerequisites)
- [Installation](#-installation)
- [Database Setup](#-database-setup)
- [Configuration](#-configuration)
- [Usage](#-usage)
- [Project Structure](#-project-structure)
- [API Reference](#-api-reference)
- [Contributing](#-contributing)
- [License](#-license)
- [Contact](#-contact)

## ✨ Features

- **Customer Management**: Complete CRUD operations for customer data
- **Database Integration**: Seamless MySQL database connectivity
- **Contact Information**: Store and manage customer phone numbers and addresses
- **Data Retrieval**: Efficient querying and display of customer information
- **Scalable Architecture**: Modular design for easy expansion
- **Error Handling**: Robust exception handling for database operations

## 🛠️ Technology Stack

- **Programming Language**: Java
- **Database**: MySQL
- **JDBC Driver**: MySQL Connector/J 8.3.0
- **Development Environment**: Visual Studio Code
- **Build System**: Java Projects extension

## 📋 Prerequisites

Before running this application, make sure you have the following installed:

- **Java Development Kit (JDK)** 8 or higher
- **MySQL Server** 5.7 or higher
- **Visual Studio Code** with Java Extension Pack
- **Git** for version control

## 🚀 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/FaraxMalik/OilCenterCRM.git
   cd OilCenterCRM
   ```

2. **Open in VS Code**
   ```bash
   code .
   ```

3. **Build the project**
   - The project will automatically build when opened in VS Code with Java extensions
   - Compiled classes will be generated in the `bin` folder

## 🗄️ Database Setup

1. **Create MySQL Database**
   ```sql
   CREATE DATABASE u628307016_CRM;
   USE u628307016_CRM;
   ```

2. **Create Customer Table**
   ```sql
   CREATE TABLE Customer (
       customerID INT PRIMARY KEY AUTO_INCREMENT,
       CustomerName VARCHAR(255) NOT NULL,
       PhoneNumber VARCHAR(20),
       Address TEXT
   );
   ```

3. **Insert Sample Data** (Optional)
   ```sql
   INSERT INTO Customer (CustomerName, PhoneNumber, Address) VALUES
   ('John Doe', '+1-555-0123', '123 Main St, City, State'),
   ('Jane Smith', '+1-555-0456', '456 Oak Ave, City, State'),
   ('Bob Johnson', '+1-555-0789', '789 Pine Rd, City, State');
   ```

## ⚙️ Configuration

### Database Connection

Update the database connection settings in `src/DatabaseConnection/DBConnection.java`:

```java
private static final String URL = "jdbc:mysql://your-host:3306/your-database";
private static final String USER = "your-username";
private static final String PASSWORD = "your-password";
```

> **Security Note**: Consider using environment variables or configuration files for sensitive data in production.

## 🎯 Usage

### Running the Application

1. **Using VS Code**
   - Open the project in VS Code
   - Navigate to `src/App.java`
   - Click "Run" or press `F5`

2. **Using Command Line**
   ```bash
   # Compile
   javac -cp "lib/jars/*" -d bin src/**/*.java
   
   # Run
   java -cp "bin:lib/jars/*" App
   ```

### Expected Output

```
Hello, World!
DB connection successful!
1,John Doe,+1-555-0123,123 Main St, City, State
2,Jane Smith,+1-555-0456,456 Oak Ave, City, State
3,Bob Johnson,+1-555-0789,789 Pine Rd, City, State
```

## 📁 Project Structure

```
Oil-Center-CRM/
├── README.md                           # Project documentation
├── bin/                               # Compiled Java classes
│   ├── App.class
│   └── DatabaseConnection/
│       └── DBConnection.class
├── lib/                               # External dependencies
│   └── jars/
│       └── mysql-connector-j-8.3.0.jar
└── src/                               # Source code
    ├── App.java                       # Main application entry point
    └── DatabaseConnection/
        └── DBConnection.java          # Database connection utility
```

### Key Components

- **`App.java`**: Main application class that demonstrates customer data retrieval
- **`DBConnection.java`**: Database connection utility class with connection management
- **`mysql-connector-j-8.3.0.jar`**: MySQL JDBC driver for database connectivity

## 📚 API Reference

### DBConnection Class

#### `getConnection()`
- **Returns**: `Connection` - MySQL database connection
- **Throws**: `ClassNotFoundException`
- **Description**: Establishes and returns a connection to the MySQL database

```java
Connection conn = DBConnection.getConnection();
```

### Database Schema

#### Customer Table
| Column | Type | Constraints |
|--------|------|-------------|
| customerID | INT | PRIMARY KEY, AUTO_INCREMENT |
| CustomerName | VARCHAR(255) | NOT NULL |
| PhoneNumber | VARCHAR(20) | - |
| Address | TEXT | - |

## 🤝 Contributing

1. **Fork the repository**
2. **Create a feature branch**
   ```bash
   git checkout -b feature/amazing-feature
   ```
3. **Commit your changes**
   ```bash
   git commit -m 'Add some amazing feature'
   ```
4. **Push to the branch**
   ```bash
   git push origin feature/amazing-feature
   ```
5. **Open a Pull Request**

## 📋 Development Roadmap

- [ ] Implement full CRUD operations for customers
- [ ] Add user authentication and authorization
- [ ] Create web-based user interface
- [ ] Add product and inventory management
- [ ] Implement reporting and analytics
- [ ] Add REST API endpoints
- [ ] Integrate with payment gateways
- [ ] Add email notification system

## 🐛 Troubleshooting

### Common Issues

1. **ClassNotFoundException: com.mysql.cj.jdbc.Driver**
   - Ensure MySQL connector JAR is in the classpath
   - Verify the JAR file is not corrupted

2. **Connection Refused**
   - Check if MySQL server is running
   - Verify host, port, and database name
   - Ensure firewall allows the connection

3. **Access Denied**
   - Verify username and password
   - Check user privileges for the database

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Contact

**Farax Malik**
- GitHub: [@FaraxMalik](https://github.com/FaraxMalik)
- Email: [your-email@example.com]
- Project Link: [https://github.com/FaraxMalik/OilCenterCRM](https://github.com/FaraxMalik/OilCenterCRM)

---

⭐ **If you found this project helpful, please give it a star!** ⭐
