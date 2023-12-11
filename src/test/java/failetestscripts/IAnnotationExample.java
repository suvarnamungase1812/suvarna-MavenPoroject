package failetestscripts;

import org.testng.IAnnotationTransformer;

public class IAnnotationExample implements IAnnotationTransformer {
    @Override
    public void transform(org.testng.annotations.ITestAnnotation annotation, java.lang.Class testClass, java.lang.reflect.Constructor testConstructor, java.lang.reflect.Method testMethod){
        annotation.setRetryAnalyzer(ExecuteFailTestScripts.class);
}
}