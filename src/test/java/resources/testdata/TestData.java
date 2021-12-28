package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "DeleteBasketTest")
    public static Object[][] objectTestData1() {
        return new Object[][]{
                {"Women", "Summer Dresses", "Your shopping cart is empty."}
                };
    }

    @DataProvider(name = "SummerDressesTest")
    public static Object[][] objectTestData2() {
        return new Object[][]{
                {"Women", "Summer Dresses", "SUMMER DRESSES "}
        };
    }
    @DataProvider(name = "Valid details")
    public static Object[][] objectTestData3() {
        return new Object[][]{
                {"James", "Bond", "abc12456", "123 Abc Street", "London", "Florida","12345", "01234567890","MY ACCOUNT", "James Bond"},
        };
    }
    @DataProvider(name = "Invalid details")
    public static Object[][] objectTestData4() {
        return new Object[][]{
                {"James", "DD12**", "abc$%12456", "123 Abc Str%%t", "Lo$%^on", "Florida","123ssa45", "0123abcd67890","There are 5 errors"},
        };
    }

}
