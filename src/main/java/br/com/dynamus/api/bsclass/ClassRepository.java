package br.com.dynamus.api.bsclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="class", path="class")
public interface ClassRepository extends JpaRepository<ClassEntity, Long> {}
