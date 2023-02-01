package hello.hellospring;

import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    // 스프링 데이터 JPA가 등록해준 구현제 DI
    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    /*
    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
*/

/*
    private EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }
*/

/*
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository(em);

    }
*/

}
