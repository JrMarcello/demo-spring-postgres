package br.com.dynamus.api.member.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {
	@Size(min=1,max=150)
	@Column(length=150)
	private String street;

	@Size(min=1,max=10)
	@Column(length=10)
	private String number;

	@Size(min=1,max=15)
	@Column(length=15)
	private String complement;

	@Size(min=1,max=9)
	@Column(length=9)
	private String cep;

	@Size(min=1,max=15)
	@Column(length=15)
	private String neighborhood;

	@Size(min=1,max=15)
	@Column(length=15)
	private String city;

	@Size(min=1,max=15)
	@Column(length=15)
	private String country;
}
