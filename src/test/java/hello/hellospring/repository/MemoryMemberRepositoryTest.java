package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        member.setName("String");

        Member result1 = repository.save(member);

        Member result2 = repository.findById(member.getId()).get();
        // Assertions.assertEquals(result2, member);
        assertThat(member).isEqualTo(result2);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("String1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("String2");
        repository.save(member2);

        Member result = repository.findByName("String1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("string1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("string2");
        repository.save(member2);

        List<Member> result = repository.findAll();
        for (Member a : result){
            System.out.println(a.getName());
        }
        assertThat(result.get(0)).isEqualTo(member1);

    }
}
