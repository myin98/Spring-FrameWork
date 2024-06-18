package app.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null; //외부 설정 내용 등록 (mybatis)
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {SpringConfig.class}; //스프링 관련 설정 내용 등록
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"}; //URL 패턴 등록
	}

}
