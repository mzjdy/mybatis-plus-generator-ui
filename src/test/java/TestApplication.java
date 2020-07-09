import com.github.davidfantasy.mybatisplus.generatorui.GeneratorConfig;
import com.github.davidfantasy.mybatisplus.generatorui.MybatisPlusToolsApplication;

public class TestApplication {


    public static void main(String[] args) {
//        GeneratorConfig config = GeneratorConfig.builder().jdbcUrl("jdbc:mysql://192.168.1.211:3306/example")
//                .userName("root")
//                .password("root")
//                .port(8068)
//                .driverClassName("com.mysql.cj.jdbc.Driver")
//                .basePackage("com.github.davidfantasy.mybatisplus.generatorui.example")
//                .build();
//        MybatisPlusToolsApplication.run(config);
        String JDBC = "jdbc:mysql://39.98.60.130:3306/mybatis_plus?characterEncoding=utf8&useSSL=false&&allowPublicKeyRetrieval=true";
        String userName = "123";
        String password = "654";
        GeneratorConfig config = GeneratorConfig.builder()
                .jdbcUrl(JDBC)
                .userName(userName)
                .password(password)
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .basePackage("com.HBC.example")
                .port(8068).build();
        MybatisPlusToolsApplication.run(config);
    }


}
