package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.TipoMantenimiento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T17:41:22")
@StaticMetamodel(SubTipoMantenimiento.class)
public class SubTipoMantenimiento_ { 

    public static volatile SingularAttribute<SubTipoMantenimiento, String> descripcion;
    public static volatile SingularAttribute<SubTipoMantenimiento, Integer> idSubTipoMantenimiento;
    public static volatile SingularAttribute<SubTipoMantenimiento, String> nombre;
    public static volatile CollectionAttribute<SubTipoMantenimiento, TipoMantenimiento> tipoMantenimientoCollection;

}