package br.com.dynamus.api.bsclass;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.dynamus.api.member.MemberEntity;
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
@Table(name = "class")
public class ClassEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;

	@NotNull
	@Size(min=1, max=50)
	@Column(length=50)
	private String name;

    @NotNull
    @Size(min=1, max=50)
	@Column(length=50)
    private String thema;

	@Size(min=1,max=150)
	@Column(length=150)
    private String description;

    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="member_id")
    private MemberEntity teacher;

    @OneToMany
    @JoinTable(
        name="class_member",
        joinColumns={@JoinColumn(name="class_id")},
        inverseJoinColumns={@JoinColumn(name="member_id")}
    )
    private List<MemberEntity> students;

    @Column(columnDefinition="Date default now()")
    private java.sql.Date startDate;
    private java.sql.Date endDate;

    private Boolean active = true;
}
