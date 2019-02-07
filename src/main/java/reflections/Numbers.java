package reflections;

//import java.lang.reflect.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

@MyAdd
public class Numbers {
    @MyAdd
    int a = 5;
    int b = 3;
    double suma;

    public static void main(String[] args) throws Exception {
        Field[] declaredFields = Test.class.getDeclaredFields();

        for (Field field : declaredFields) {
            System.out.println(field.getName() + " type " + field.getType());
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();

            for (Annotation add : declaredAnnotations) {
                System.out.println(add);
            }
        }

        try {

            Class testClass = Test.class;

            Constructor constructors[] = testClass.getConstructors();

            for (int i = 0; i < constructors.length; i++)

                System.out.println("Panel Construction = " + constructors[i]);
//            constructors.setAccessible(true);
//            Test obj = constructors.getExceptionTypes(testClass.get);
//            System.out.println("Constructors in class " + obj.toString());

        } catch (Exception e) {
            System.out.println("Exeption: " + e);
        }


        Class<Test> clazz = Test.class;
        Constructor<Test> ctor = clazz.getConstructor(String.class, int.class, String.class);
        Object object = ctor.newInstance(new Object[]{"test name", 23, "test sex"});

        System.out.println(((Test) object).name + " " + ((Test) object).age + " " + ((Test) object).sex);

//            try {
//                Constructor field = Test.class.getConstructor(String.class,int.class,String.class);
//                Constructor<Test> constructor = field.getDeclaringClass();
//                System.out.println(fieldClass.getCanonicalName());
//            } catch (NoSuchFieldException e) {
//                e.printStackTrace();
//            }

//        Constructor constructor = Test.class.getConstructor(String.class, int.class, String.class);
//        System.out.println("Constructor class = "+ Arrays.toString(constructor.getParameterTypes()));
//
//        Object myObj = constructor.newInstance("name",23,"test");
//        Method myObjMethod = myObj.getClass().getConstructor();
//        myObjMethod.invoke(myObj,"name",23,"test");

//        Constructor hashMapConstructor = Test.class.getConstructor(null);
//        System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes()));

//        HashMap<String,String> myMap = (HashMap<String, String>) hashMapConstructor.newInstance(null);


        //Get All public constructors

//  "dd",23,"M"  "java.reflections.Test"
//               Constructor<Test> constructors = Test.class.getConstructors(reflections.Test);
        // prints public constructors of ConcreteClass */
//               System.out.println(Arrays.toString(constructors.getParameterTypes()));

//        for (Field field : declaredType) {
//            System.out.println(field.getAnnotationsByType());
//
//        }
//        Test obj = new Test("aa",23,"M");
//
//        Constructor<Test> declaredField = Test.class.getConstructor(String.class, int.class, String.class);
//
//        Class cls = obj.getClass();
//        System.out.println("the name class is " + cls.getName());
//
//  //      Constructor constructor = cls.getConstructor();
//        System.out.println("construktor name " + declaredField.getName());
//
//        Method[] methods = cls.getMethods();
//
//        // Printing method names
//        for (Method method:methods)
//            System.out.println(method.getName());
//
//        Field[] field = cls.getDeclaredFields();
//        System.out.println(field.toString());
    }


    public void add() {
        suma = a + b;
        System.out.println("Wynik c = " + suma);
    }

    public void sub() {
        suma = a - b;
        System.out.println("wynik a-b " + suma);
    }

    public void div() {
        suma = a / b;
        System.out.println("wynik dzielenia a przez b " + suma);
    }

    public void multi() {
        suma = a * b;
        System.out.println("wynik mnożenia " + suma);
    }
}
