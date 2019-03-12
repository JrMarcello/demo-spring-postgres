package br.com.dynamus.api.schoolroom;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@EqualsAndHashCode(of={"id"}, callSuper=false)
@ToString(of={"id"})

@javax.persistence.Entity
@Table(name = "school_room")
public class SchoolRoomEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;

	@NotNull
	@Size(min=1, max=50)
	@Column(length=50, unique=true)
	private String name;

	@Size(min=1,max=150)
	@Column(length=150)
	private String description;
}
