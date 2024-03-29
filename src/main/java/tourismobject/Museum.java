package tourismobject;


import sparql.ExecQuery;
import org.apache.commons.lang3.tuple.Triple;
import org.apache.jena.rdf.model.Model;

import java.util.ArrayList;

public class Museum extends Building implements Queryable {

    @Override
    public Model queryModel(ExecQuery execQuery) {
        selector.add(SetTriple(Queryable.object, "dct:subject", "dbc:Museums_in_Vietnam"));

        return execQuery.execConstruct(this, selector);
    }
}
