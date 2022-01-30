package hello.core.scan;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import hello.core.AutoAppConfig;
import hello.core.member.MemberService;

public class AutoAppConfigTest {
	
	@Test
	void basicScan() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
		
		MemberService memberService = ac.getBean(MemberService.class);
		
		assertThat(memberService).isInstanceOf(MemberService.class);
		
		((AbstractApplicationContext) ac).close();
	}
	
}
