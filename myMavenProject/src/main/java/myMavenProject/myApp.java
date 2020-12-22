package myMavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {
 		public static void main(String[] args) {
 			
 			ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
 			Fruit f1 = appContext.getBean("first", Fruit.class);
 			
 		
 			
 			System.out.println(f1.hello());
 		
 			
 		}
 		



}
