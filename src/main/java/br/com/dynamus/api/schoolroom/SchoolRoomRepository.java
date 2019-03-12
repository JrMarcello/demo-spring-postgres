package br.com.dynamus.api.schoolroom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="member", path="member")
public interface SchoolRoomRepository extends JpaRepository<SchoolRoomEntity, Long> {
//	List<ClassEntity> findByName(@Param("name") String name);

//      Exemplo de chamada com query explicita (ideal seria criar um arquivo de sql)
//		@Query("SELECT * FROM class c where c.name = :name") 
//		Entity findByName(@Param("name") String name);
}
