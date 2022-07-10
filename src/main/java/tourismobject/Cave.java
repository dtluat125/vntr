package tourismobject;

import org.apache.commons.lang3.tuple.Triple;
import org.apache.jena.rdf.model.Model;
import sparql.ExecQuery;

import java.util.ArrayList;

public class Cave extends Natural implements Queryable {
    protected String discovery;
    protected String entranceCount;
    private String location;
    private String depth;
    private String length;
    private String geology;

    @Override
    public Model queryModel(ExecQuery execQuery) {
        selector.add(SetTriple(Queryable.object, "dct:subject", "dbc:Caves_of_Vietnam"));

        return execQuery.execConstruct(this, selector);
    }
}