package Projects;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RetriableDataProviderSample {

    private boolean throwException = true;

    @Test(dataProvider = "test-data")
    public void sampleTestMethod(int input) {
        System.err.println("Input value = " + input);
    }

    @DataProvider(retryUsing = RetryDataProvider.class, name = "test-data")
    public Object[][] testDataSupplier() {
        if (throwException) {
            throwException = false;
            System.err.println("Simulating a problem when invoking the data provider");
            throw new IllegalStateException("Simulating a failure in data provider");
        }
        return new Object[][]{
                {1}, {2}
        };
    }
}
