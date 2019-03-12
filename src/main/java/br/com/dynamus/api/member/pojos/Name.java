package br.com.dynamus.api.member.pojos;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Name {
	@NotNull
	@Size(min=1,max=15)
	@Column(name="firstname", length=15, nullable=false)
	private String firstName;
	
	@NotNull
	@Size(min=1,max=15)
	@Column(name="lastname", length=50, nullable=false)
	private String lastName;
	
	public String toString() {
		return this.getFirstName().concat(" ").concat(this.getLastName());
	}
}
