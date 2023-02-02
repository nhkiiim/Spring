package hello.hellospring.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Aspect // AOP 사용
@Component // 컴포넌트 스캔보다 빈 등록해서 사용하는 걸 선호 -> AOP를 사용하는구나 인지 가능
public class TimeTraceAop {

    @Around("execution(* hello.hellospring..*(..))") // 어디에 적용할지 정의 : 패키지 하위에 다 적용해
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("START: " + joinPoint.toString());

        try {
            return joinPoint.proceed();
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END: " + joinPoint.toString() + " " + timeMs +"ms");
        }
    }
}
