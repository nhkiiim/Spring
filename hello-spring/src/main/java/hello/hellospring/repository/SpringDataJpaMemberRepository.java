package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // JPA가 구현체(bean)을 만들어서 자동으로 등록해주기 때문에 그대로 가져다 쓰면 OK

    // select m from Member m where m.name = ? (JPQL)
    @Override
    Optional<Member> findByName(String name);

}
