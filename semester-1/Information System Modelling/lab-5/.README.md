# Laboratory 5

The purpose of this lab is to learn about semantic web technologies, in particular: RDF and RDFS.

As a first step, RDF schema is designed:

I have 2 main classes, `Product` and `Service`.

I wrote `ComputerPart` and `Cleaning` as subclasses of mentioned classes.

`PSU`, `CPU`, `Motherboard` are subclasses of `ComputerPart`
`HouseCleaning` and `CarCleaning` are subclasses of `Cleaning`

```
<rdf:RDF xml:lang="en" xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#" xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#">

<rdf:Description ID="Product" rdf:about="http://example.org/Product">
 <rdf:type resource="http://www.w3.org/2000/01/rdf-schema#Class"/>
 <rdfs:subClassOf
  rdf:resource="http://www.w3.org/2000/01/rdf-schema#Resource"/>
</rdf:Description>

<rdf:Description ID="Service" rdf:about="http://example.org/Service">
 <rdf:type resource="http://www.w3.org/2000/01/rdf-schema#Class"/>
 <rdfs:subClassOf
  rdf:resource="http://www.w3.org/2000/01/rdf-schema#Resource"/>
</rdf:Description>

<rdf:Description ID="ComputerPart" rdf:about="http://example.org/ComputerPart">
 <rdf:type resource="http://www.w3.org/2000/01/rdf-schema#Class"/>
 <rdfs:subClassOf rdf:resource="#Product"/>
</rdf:Description>

<rdf:Description ID="PSU" rdf:about="http://example.org/PSU">
 <rdf:type resource="http://www.w3.org/2000/01/rdf-schema#Class"/>
 <rdfs:subClassOf rdf:resource="#ComputerPart"/>
</rdf:Description>

<rdf:Description ID="Motherboard" rdf:about="http://example.org/Motherboard">
 <rdf:type resource="http://www.w3.org/2000/01/rdf-schema#Class"/>
 <rdfs:subClassOf rdf:resource="#ComputerPart"/>
</rdf:Description>

<rdf:Description ID="CPU" rdf:about="http://example.org/CPU">
 <rdf:type resource="http://www.w3.org/2000/01/rdf-schema#Class"/>
 <rdfs:subClassOf rdf:resource="#ComputerPart"/>
</rdf:Description>

<rdf:Description ID="Cleaning" rdf:about="http://example.org/Cleaning">
 <rdf:type resource="http://www.w3.org/2000/01/rdf-schema#Class"/>
 <rdfs:subClassOf rdf:resource="#Service"/>
</rdf:Description>

<rdf:Description ID="HouseCleaning" rdf:about="http://example.org/HouseCleaning">
 <rdf:type resource="http://www.w3.org/2000/01/rdf-schema#Class"/>
 <rdfs:subClassOf rdf:resource="#Cleaning"/>
</rdf:Description>

<rdf:Description ID="CarCleaning" rdf:about="http://example.org/CarCleaning">
 <rdf:type resource="http://www.w3.org/2000/01/rdf-schema#Class"/>
 <rdfs:subClassOf rdf:resource="#Cleaning"/>
</rdf:Description>
</rdf:RDF>
```

To convevrt rdf to `Turtle Terse`, I used `easyrdf.org/converter`

```
@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .

<http://example.org/Product>
  a rdfs:Class ;
  rdfs:subClassOf rdfs:Resource .

<http://example.org/Service>
  a rdfs:Class ;
  rdfs:subClassOf rdfs:Resource .

<http://example.org/ComputerPart>
  a rdfs:Class ;
  rdfs:subClassOf <http://njh.me/#Product> .

<http://example.org/PSU>
  a rdfs:Class ;
  rdfs:subClassOf <http://njh.me/#ComputerPart> .

<http://example.org/Motherboard>
  a rdfs:Class ;
  rdfs:subClassOf <http://njh.me/#ComputerPart> .

<http://example.org/CPU>
  a rdfs:Class ;
  rdfs:subClassOf <http://njh.me/#ComputerPart> .

<http://example.org/Cleaning>
  a rdfs:Class ;
  rdfs:subClassOf <http://njh.me/#Service> .

<http://example.org/HouseCleaning>
  a rdfs:Class ;
  rdfs:subClassOf <http://njh.me/#Cleaning> .

<http://example.org/CarCleaning>
  a rdfs:Class ;
  rdfs:subClassOf <http://njh.me/#Cleaning> .
```

I wrote 3 different queries to get data from triple store

```
    String queryString = "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +"SELECT ?class ?type ?parent  WHERE { ?class ?type ?parent .}  ";
    String queryString1 = "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +"SELECT ?class  ?parent  WHERE { ?class <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?parent .}  ";
    String queryString2 = "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +"SELECT ?class ?type   WHERE { ?class ?type <http://njh.me/#Cleaning> .}  ";

```