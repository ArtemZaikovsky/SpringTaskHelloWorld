import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld test = (HelloWorld) applicationContext.getBean("helloworld");
        Cat tom = (Cat) applicationContext.getBean("cat");
        Cat barsik = (Cat) applicationContext.getBean("cat");
        System.out.println(bean == test);
        System.out.println(tom == barsik);
    }
}