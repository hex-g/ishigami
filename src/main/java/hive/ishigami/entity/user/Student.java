package hive.ishigami.entity.user;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@DynamicUpdate
@Entity
@Table(name = "tb_student")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "ra", unique = true)
  private String ra;

  @ManyToOne(cascade = CascadeType.ALL, optional = false)
  @JoinColumn(name = "person_id", unique = true)
  private Person person;

  public Student() {
  }

  public Student(final String ra) {
    this.ra = ra;
  }

  public Integer getId() {
    return id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(final Person person) {
    this.person = person;
  }

  public String getRa() {
    return ra;
  }

  public void setRa(final String ra) {
    this.ra = ra;
  }
}
