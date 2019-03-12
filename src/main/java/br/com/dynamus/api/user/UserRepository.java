package br.com.dynamus.api.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends JpaRepository<UserEntity, Long> {
//	List<UserEntity> findByMail(@Param("mail") String mail);

//      Exemplo de chamada com query explicita (ideal seria criar um arquivo de sql)
//		@Query("SELECT * FROM user c=u where c=u.mail = :mail") 
//		Entity findByMail(@Param("mail") String mail);
}
