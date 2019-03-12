package br.com.dynamus.api.user;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.dynamus.api.member.pojos.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Builder.Default;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of={"id"}, callSuper=false)
@ToString(of={"id"})

@javax.persistence.Entity
@Table(name = "[user]")
public class UserEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;

	@Embedded
	private Name name;

	@NotNull
	@Size(min=1,max=50)
	@Column(length=50, unique=true)
	private String mail;

	@NotNull
	@Size(min=1,max=150)
	@Column(length=150, nullable=false)
	private String password;

	private Boolean active = true;
}
