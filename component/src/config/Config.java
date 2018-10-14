package config;

import beans.Singer;
import beans.Song;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//通过这种方式生成的的bean的作用域是singleton
public class Config {

    @Bean
    @Scope("prototype")
    public Song song(){
        return new Song();
    }
    @Bean
//    @Scope("prototype")
    public Singer xiaoming(){
        return new Singer("xiaomng",song());//这里song（）和 上面是同一个bean

    }
}
