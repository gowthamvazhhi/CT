public class CalculatorTest {
    private Calculator calculator;
    private int testsPassed = 0;
    private int totalTests = 0;
    
    public CalculatorTest() {
        calculator = new Calculator();
    }
    
    public void runAllTests() {
        System.out.println("Running Calculator Tests...\n");
        
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testDivisionByZero();
        testPower();
        testSquareRoot();
        testSquareRootOfNegative();
        testPercentage();
        
        printResults();
    }
    
    private void testAddition() {
        totalTests++;
        try {
            double result = calculator.add(5.0, 3.0);
            if (result == 8.0) {
                System.out.println("✓ Addition test passed: 5.0 + 3.0 = " + result);
                testsPassed++;
            } else {
                System.out.println("✗ Addition test failed: Expected 8.0, got " + result);
            }
        } catch (Exception e) {
            System.out.println("✗ Addition test failed with exception: " + e.getMessage());
        }
    }
    
    private void testSubtraction() {
        totalTests++;
        try {
            double result = calculator.subtract(10.0, 4.0);
            if (result == 6.0) {
                System.out.println("✓ Subtraction test passed: 10.0 - 4.0 = " + result);
                testsPassed++;
            } else {
                System.out.println("✗ Subtraction test failed: Expected 6.0, got " + result);
            }
        } catch (Exception e) {
            System.out.println("✗ Subtraction test failed with exception: " + e.getMessage());
        }
    }
    
    private void testMultiplication() {
        totalTests++;
        try {
            double result = calculator.multiply(6.0, 7.0);
            if (result == 42.0) {
                System.out.println("✓ Multiplication test passed: 6.0 * 7.0 = " + result);
                testsPassed++;
            } else {
                System.out.println("✗ Multiplication test failed: Expected 42.0, got " + result);
            }
        } catch (Exception e) {
            System.out.println("✗ Multiplication test failed with exception: " + e.getMessage());
        }
    }
    
    private void testDivision() {
        totalTests++;
        try {
            double result = calculator.divide(15.0, 3.0);
            if (result == 5.0) {
                System.out.println("✓ Division test passed: 15.0 / 3.0 = " + result);
                testsPassed++;
            } else {
                System.out.println("✗ Division test failed: Expected 5.0, got " + result);
            }
        } catch (Exception e) {
            System.out.println("✗ Division test failed with exception: " + e.getMessage());
        }
    }
    
    private void testDivisionByZero() {
        totalTests++;
        try {
            calculator.divide(10.0, 0.0);
            System.out.println("✗ Division by zero test failed: Should have thrown exception");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Division by zero test passed: Correctly threw exception");
            testsPassed++;
        } catch (Exception e) {
            System.out.println("✗ Division by zero test failed: Wrong exception type: " + e.getMessage());
        }
    }
    
    private void testPower() {
        totalTests++;
        try {
            double result = calculator.power(2.0, 3.0);
            if (result == 8.0) {
                System.out.println("✓ Power test passed: 2.0^3.0 = " + result);
                testsPassed++;
            } else {
                System.out.println("✗ Power test failed: Expected 8.0, got " + result);
            }
        } catch (Exception e) {
            System.out.println("✗ Power test failed with exception: " + e.getMessage());
        }
    }
    
    private void testSquareRoot() {
        totalTests++;
        try {
            double result = calculator.sqrt(16.0);
            if (result == 4.0) {
                System.out.println("✓ Square root test passed: sqrt(16.0) = " + result);
                testsPassed++;
            } else {
                System.out.println("✗ Square root test failed: Expected 4.0, got " + result);
            }
        } catch (Exception e) {
            System.out.println("✗ Square root test failed with exception: " + e.getMessage());
        }
    }
    
    private void testSquareRootOfNegative() {
        totalTests++;
        try {
            calculator.sqrt(-4.0);
            System.out.println("✗ Square root of negative test failed: Should have thrown exception");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Square root of negative test passed: Correctly threw exception");
            testsPassed++;
        } catch (Exception e) {
            System.out.println("✗ Square root of negative test failed: Wrong exception type: " + e.getMessage());
        }
    }
    
    private void testPercentage() {
        totalTests++;
        try {
            double result = calculator.percentage(200.0, 15.0);
            if (result == 30.0) {
                System.out.println("✓ Percentage test passed: 15% of 200.0 = " + result);
                testsPassed++;
            } else {
                System.out.println("✗ Percentage test failed: Expected 30.0, got " + result);
            }
        } catch (Exception e) {
            System.out.println("✗ Percentage test failed with exception: " + e.getMessage());
        }
    }
    
    private void printResults() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Test Results: " + testsPassed + "/" + totalTests + " tests passed");
        
        if (testsPassed == totalTests) {
            System.out.println("All tests passed!");
        } else {
            System.out.println("Some tests failed!");
            System.exit(1); // Exit with error code for CI/CD
        }
    }
    
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.runAllTests();
    }
}
