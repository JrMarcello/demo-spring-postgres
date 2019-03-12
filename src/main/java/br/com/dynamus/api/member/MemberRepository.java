package br.com.dynamus.api.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
	//List<MemberEntity> findByCpf(@Param("cpf") String cpf);
	//List<MemberEntity> findByMail(@Param("mail") String mail);

//      Exemplo de chamada com query explicita (ideal seria criar um arquivo de sql)
//		@Query("SELECT * FROM member m where m.cpf = :cpf") 
//		Entity findByCpf(@Param("cpf") String cpf);
}
