package gramacho.example.plus2equals5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.reflect.Field;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
		SpringApplication.run(Application.class, args);

		Class cache = Integer.class.getDeclaredClasses()[0];
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true);
        Integer[] array = (Integer[]) c.get(cache);
        array[132] = array[133];

        System.out.printf("%d",2 + 2);
	}

}
