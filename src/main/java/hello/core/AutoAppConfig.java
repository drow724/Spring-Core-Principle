package hello.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import hello.core.discount.DiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

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
	
//	@Autowired private MemberRepository memberRepository;
//	@Autowired private DiscountPolicy discountPolicy;
//	
//	@Bean
//	OrderService orderService() {
//		return new OrderServiceImpl(memberRepository, discountPolicy);
//	}
	
	//수동빈이 우선권을 가짐
	//@Bean(name = "memoryMemberRepository")
	//MemberRepository memberRepository () {
	//	return new MemoryMemberRepository();
	//}
	
}