@EnableWebSecurity
public class SecurityConfig {

  @Bean
  SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.csrf().disable()
        .authorizeHttpRequests()
        .requestMatchers("/auth/**").permitAll()
        .anyRequest().authenticated()
        .and()
        .addFilterBefore(new JwtFilter(), UsernamePasswordAuthenticationFilter.class);

    return http.build();
  }
}
