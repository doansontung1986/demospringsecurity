package com.example.demospringsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true
)
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // Cấu hình đường dẫn truy cập
        String[] resourcesPublic = new String[]{
                "/phim-le", "/phim-bo", "/phim-chieu-rap", "tin-tuc/**"
        };

        String[] apiResources = new String[]{
                "/dashboard",
                "/article", "/create-article", "/update-article", "/delete-article",
                "/brand", "/create-brand", "/update-brand", "/delete-brand",
                "/category", "/create-category", "/update-category", "/delete-category",
                "/order", "/create-order", "/update-order", "/delete-order",
                "/product", "/create-product", "/update-product", "/delete-product",
                "/user", "/create-user", "/update-user", "/delete-user"
        };

        http.authorizeHttpRequests(authorizeRequests -> authorizeRequests.anyRequest().permitAll());
//                authorizeRequests
//                .requestMatchers("/").permitAll()
//                .requestMatchers("/admin").hasRole("ADMIN")
//                .requestMatchers("/css/**", "/js/**", "/image/**").permitAll()
//                .requestMatchers(resourcesPublic).permitAll()
//                .requestMatchers("/author").hasAnyRole("ADMIN", "AUTHOR")
//                .requestMatchers("GET", "/aa/**", "/bb/**").hasRole("ADMIN")
//                .requestMatchers("/abc", "/bcd").hasAuthority("ROLE_USER")
//                .requestMatchers("/xxx", "/yyy").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN")
//                .requestMatchers("/dashboard").hasAnyRole("ADMIN", "SALE")
//                .requestMatchers("/user", "/create-user", "/update-user", "/delete-user").hasRole("ADMIN")
//                .requestMatchers("/category", "/create-category", "/update-category", "/delete-category").hasAnyRole("ADMIN", "SALE")
//                .requestMatchers("/product", "/create-product", "/update-product", "/delete-product").hasAnyRole("ADMIN", "SALE")
//                .requestMatchers("/brand", "/create-brand", "/update-brand", "/delete-brand").hasAnyRole("ADMIN", "SALE")
//                .requestMatchers("/order", "/create-order", "/update-order", "/delete-order").hasAnyRole("ADMIN", "SALE")
//                .requestMatchers("/article", "/create-article", "/update-article", "/delete-article").hasAnyRole("ADMIN", "SALE", "AUTHOR")
//                .requestMatchers("/personal", "/update-personal").hasRole("USER")
//                .anyRequest().authenticated());

        // Cấu hình form login
        http.formLogin(formLogin -> {
            formLogin.loginPage("/login"); // Đường dẫn đến trang login
            formLogin.loginProcessingUrl("/login-handle"); // Đường dẫn submit form login
            formLogin.usernameParameter("name");
            formLogin.passwordParameter("pass");
            formLogin.defaultSuccessUrl("/", true); // nếu đăng nhập thành công thì chuyển hướng về trang login
            formLogin.permitAll(); // tất cả đều được truy cập vào trang login
        });

        // Cấu hih logout
        http.logout(logout -> {
            logout.logoutSuccessUrl("/"); // nếu logout thành công thì chuyển hướng về trang login
            logout.deleteCookies("JSESSIONID"); // xóa cookie
            logout.invalidateHttpSession(true); // hủy session
            logout.clearAuthentication(true); // xóa thng tin đăng nhập
            logout.permitAll(); // tất cả đều được truy cập mà ko cần xác thực
        });

        return http.build();
    }


}
