package br.com.dynamus.api.member;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.dynamus.api.member.pojos.Address;
import br.com.dynamus.api.member.pojos.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of={"id"}, callSuper=false)
@ToString(of={"id"})

@javax.persistence.Entity
@Table(name = "member")
public class MemberEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;

	@Embedded
	private Name name;

	@NotNull
	@Size(min=1,max=11)
	@Column(length=11, unique=true)
	private String cpf;

	@Size(min=1,max=50)
	@Column(length=50, unique=true)
	private String mail;

	@Embedded
	private Address address;
}
