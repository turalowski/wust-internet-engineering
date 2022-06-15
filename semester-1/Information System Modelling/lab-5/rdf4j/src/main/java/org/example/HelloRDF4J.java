package org.example;

import org.eclipse.rdf4j.model.*;
import org.eclipse.rdf4j.model.util.Values;
import org.eclipse.rdf4j.model.vocabulary.FOAF;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.model.vocabulary.RDFS;
import org.eclipse.rdf4j.query.*;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryResult;
import org.eclipse.rdf4j.repository.sail.SailRepository;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;
import org.eclipse.rdf4j.sail.memory.MemoryStore;

import java.io.File;
import java.io.IOException;

public class HelloRDF4J {
    public static void main(String[] args) {
        Repository rep = new SailRepository(new MemoryStore());
        Namespace ex = Values.namespace("ex", "http://example.org/");
        IRI product = Values.iri(ex, "product");
        IRI service = Values.iri(ex, "service");


        try (RepositoryConnection conn = rep.getConnection()) {

            // You can upload triples from a file to the repository
            File file = new File("instances.ttl");
            String baseURI = "http://example.org/ontologies/";
            conn.add(file, baseURI, RDFFormat.TURTLE);

            RepositoryResult<Statement> statements = conn.getStatements(null, null, null);
            Model model = QueryResults.asModel(statements);



            model.setNamespace(RDF.NS);
            model.setNamespace(RDFS.NS);
            model.setNamespace(FOAF.NS);
            model.setNamespace(ex);

            String queryString = "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +"SELECT ?class ?type ?parent  WHERE { ?class ?type ?parent .}  ";
            String queryString1 = "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +"SELECT ?class  ?parent  WHERE { ?class <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?parent .}  ";
            String queryString2 = "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +"SELECT ?class ?type   WHERE { ?class ?type <http://njh.me/#Cleaning> .}  ";

            TupleQuery tupleQuery = conn.prepareTupleQuery(QueryLanguage.SPARQL, queryString);

            try (TupleQueryResult result = tupleQuery.evaluate()) {
                    System.out.println("Queries 1:");
                while (result.hasNext()) { // iterate over the result
                    BindingSet bindingSet = result.next();
                    Value valueOfClass = bindingSet.getValue("class");
                    Value valueOfType = bindingSet.getValue("type");
                    Value valueOfParent = bindingSet.getValue("parent");

                    System.out.println(valueOfClass + " " + valueOfType + " " + valueOfParent);
                }
            }

            Rio.write(model, System.out, RDFFormat.TURTLE);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
