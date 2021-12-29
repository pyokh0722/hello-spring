package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    // 필드 주입
//    @Autowired
//    private MemberService memberService;

//    private MemberService memberService;
//
    // setter 주입 (퍼블릭하게 노출이 된다)
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }

    private final MemberService memberService;
    // 생성자 주입
    // 의존관계가 실행중에 동적으로 변하는 경우가 거의 없으므로 생성자 주입을 권장한다.
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    // 브렌치 추가
    // test 1 2
}
