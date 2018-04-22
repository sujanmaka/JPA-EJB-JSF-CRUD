package EntityTry;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Players.class)
public abstract class Players_ {

	public static volatile SingularAttribute<Players, String> surname;
	public static volatile SingularAttribute<Players, String> name;
	public static volatile SingularAttribute<Players, Date> birth;
	public static volatile SingularAttribute<Players, Integer> id;
	public static volatile CollectionAttribute<Players, Photos> photos;
	public static volatile SingularAttribute<Players, Integer> age;

}

