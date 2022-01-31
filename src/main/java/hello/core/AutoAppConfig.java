package hello.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

@Configuration
@ComponentScan(
	//basePackages = "hello.core.member",
	//basePackageClasses = AutoAppConfig.class,
	excludeFilters = @Filter(
		type = FilterType.ANNOTATION,
		classes = Configuration.class
	)
)
public class AutoAppConfig {
	
	//수동빈이 우선권을 가짐
	@Bean(name = "memoryMemberRepository")
	MemberRepository memberRepository () {
		return new MemoryMemberRepository();
	}
	
}