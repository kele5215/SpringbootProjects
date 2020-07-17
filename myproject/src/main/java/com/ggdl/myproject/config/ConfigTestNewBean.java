package com.ggdl.myproject.config;


import java.util.List;
import com.ggdl.myproject.domain.PostInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "com.ggdl")
@PropertySource("classpath:config/testnew.properties")
@Data
public class ConfigTestNewBean {

    private String foo;
    private List<String> post;
    private List<PostInfo> posts;

    @Autowired
    private Environment environment;

    public void setProperties() {
        Binder binder = Binder.get(environment); //绑定简单配置
        this.foo = binder.bind("foo", Bindable.of(String.class)).get();

        // 绑定List配置
        List<String> post = binder.bind("post", Bindable.listOf(String.class)).get();
        this.post = post;
        System.out.println(post);

        List<PostInfo> posts = binder.bind("posts", Bindable.listOf(PostInfo.class)).get();
        this.posts = posts;
        System.out.println(posts);
    }

}