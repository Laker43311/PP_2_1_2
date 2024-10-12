import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean1.getMessage());

        boolean helloWorldComparison = bean1 == bean2;
        System.out.println("Сравнение HelloWorld бинов: " + helloWorldComparison); // true

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        boolean catComparison = cat1 == cat2;
        System.out.println("Сравнение Cat бинов: " + catComparison); // false
    }
}