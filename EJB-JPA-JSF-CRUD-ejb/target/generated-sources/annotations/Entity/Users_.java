package Entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Users.class)
public abstract class Users_ {

	public static volatile SingularAttribute<Users, String> mobile;
	public static volatile SingularAttribute<Users, Long> id;
	public static volatile SingularAttribute<Users, String> userName;
	public static volatile SetAttribute<Users, UsersFaculties> faculties;
	public static volatile SingularAttribute<Users, String> email;
	public static volatile SingularAttribute<Users, String> faculty;

}

