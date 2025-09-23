# Java Calculator with Automated Testing

![CI/CD Pipeline](https://github.com/yourusername/your-repo-name/workflows/CI/CD%20Pipeline/badge.svg)

A simple Java calculator application with comprehensive unit tests and automated CI/CD pipeline using GitHub Actions.

## Features

- Basic arithmetic operations (add, subtract, multiply, divide)
- Advanced operations (power, square root, percentage)
- Error handling for edge cases (division by zero, square root of negative numbers)
- Comprehensive unit tests
- Automated testing pipeline with GitHub Actions

## Project Structure

```
.
├── Calculator.java           # Main calculator class
├── CalculatorTest.java      # Unit tests
├── .github/
│   └── workflows/
│       └── ci.yml          # GitHub Actions workflow
└── README.md               # This file
```

## Running Locally

### Prerequisites

- Java 11 or higher installed
- Git (for cloning the repository)

### Steps

1. Clone the repository:
```bash
git clone https://github.com/yourusername/your-repo-name.git
cd your-repo-name
```

2. Compile the Java files:
```bash
javac *.java
```

3. Run the tests:
```bash
java CalculatorTest
```

4. Clean up compiled files:
```bash
rm *.class  # On Unix/Linux/macOS
del *.class # On Windows
```

## Calculator Operations

The `Calculator` class supports the following operations:

| Method | Description | Example |
|--------|-------------|---------|
| `add(a, b)` | Addition | `add(5, 3)` → `8` |
| `subtract(a, b)` | Subtraction | `subtract(10, 4)` → `6` |
| `multiply(a, b)` | Multiplication | `multiply(6, 7)` → `42` |
| `divide(a, b)` | Division | `divide(15, 3)` → `5` |
| `power(base, exp)` | Exponentiation | `power(2, 3)` → `8` |
| `sqrt(number)` | Square root | `sqrt(16)` → `4` |
| `percentage(num, percent)` | Percentage calculation | `percentage(200, 15)` → `30` |

## Testing

The project includes comprehensive unit tests that cover:

- ✅ Basic arithmetic operations
- ✅ Edge cases (division by zero, negative square root)
- ✅ Exception handling
- ✅ Boundary conditions

### Test Coverage

- **Addition**: Tests positive numbers
- **Subtraction**: Tests basic subtraction
- **Multiplication**: Tests multiplication
- **Division**: Tests normal division and division by zero
- **Power**: Tests exponentiation
- **Square Root**: Tests positive numbers and negative number handling
- **Percentage**: Tests percentage calculations

## GitHub Actions CI/CD Pipeline

The automated pipeline runs on every push and pull request to the main branch.

### Pipeline Features

- **Multi-OS Testing**: Tests run on Ubuntu, Windows, and macOS
- **Multi-Java Version**: Tests against Java 11, 17, and 21
- **Automatic Compilation**: Compiles Java files
- **Test Execution**: Runs all unit tests
- **Clean Up**: Removes compiled files after testing

### Workflow Triggers

- Push to `main` or `master` branch
- Pull requests to `main` or `master` branch

### Pipeline Steps

1. **Checkout Code**: Downloads the repository code
2. **Setup Java**: Installs the specified JDK version
3. **Compile**: Compiles all Java files using `javac`
4. **Test**: Runs the test suite using `java CalculatorTest`
5. **Clean Up**: Removes compiled `.class` files

## Setting Up in Your Repository

1. **Create a new repository** on GitHub

2. **Add the files** to your repository:
   - Copy `Calculator.java` to the root of your repo
   - Copy `CalculatorTest.java` to the root of your repo
   - Create `.github/workflows/` directory
   - Copy `ci.yml` to `.github/workflows/ci.yml`

3. **Update the README** badge URL:
   Replace `yourusername/your-repo-name` with your actual GitHub username and repository name in the badge URL.

4. **Commit and push** your files:
```bash
git add .
git commit -m "Add calculator with automated testing"
git push origin main
```

5. **Check the Actions tab** in your GitHub repository to see the pipeline running.

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Make your changes
4. Run tests locally to ensure they pass
5. Commit your changes (`git commit -am 'Add new feature'`)
6. Push to the branch (`git push origin feature/new-feature`)
7. Create a Pull Request

The automated pipeline will run tests on your PR to ensure code quality.

## License

This project is open source and available under the [MIT License](LICENSE).

---

**Note**: This is a simple educational project demonstrating automated testing with GitHub Actions. For production applications, consider using build tools like Maven or Gradle, and testing frameworks like JUnit.
