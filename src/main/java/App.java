import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanHW =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.equals(beanHW));

        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.getName());

        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.equals(beanCat2));
    }
}