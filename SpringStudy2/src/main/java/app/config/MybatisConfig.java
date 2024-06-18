package app.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MybatisConfig {

	
	@Bean
	public DataSource dataSource() {   // DB JDBC 접속 정보
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
			dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
			dataSource.setUrl("jdbc:mariadb://localhost:23306/edu");
			dataSource.setUsername("root");
			dataSource.setPassword("1234");
		
		return dataSource;
	}
	//Sql factory
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext applicationContext) throws Exception {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/sql/*.xml"));
		return sessionFactoryBean.getObject();
	}
	//Sql section
	@Bean
	public SqlSession sqlSession(SqlSessionFactory sqlSessionFactory) throws Exception {		
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
	
}
