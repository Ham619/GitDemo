package Projects;


import org.testng.IDataProviderMethod;
import org.testng.IRetryDataProvider;

import java.util.concurrent.atomic.AtomicInteger;

public class RetryDataProvider implements IRetryDataProvider {

    private final AtomicInteger counter = new AtomicInteger(1);

    @Override
    public boolean retry(IDataProviderMethod dataProvider) {
        boolean status = counter.getAndIncrement() <= 2;
        String clazz = dataProvider.getMethod().getDeclaringClass().getName();
        String dataProviderMethodName = dataProvider.getMethod().getName();
        String methodName = clazz + "." + dataProviderMethodName + "()";
        System.err.println("Retry the data provider method " + methodName + " ? " + status);
        return status;
    }
}
