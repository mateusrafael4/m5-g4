package br.edu.inteli.cc.m5.grupo;
import org.neo4j.driver.*;
import org.neo4j.driver.types.Node;

public class CRUD_Neo4J {
    private Driver driver;
    private Session session;

    public void connect(String uri, String user, String password) {
        this.driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
        this.session = driver.session();
    }

    public void createNode(String label, String propertyKey, Object propertyValue) {
        session.run("CREATE (n:" + label + " {" + propertyKey + ": $value})", Values.parameters("value", propertyValue));
    }

    public Node readNode(String label, String propertyKey, Object propertyValue) {
        Record result = session.run("MATCH (n:" + label + " {" + propertyKey + ": $value}) RETURN n", Values.parameters("value", propertyValue)).single();
        return result.get("n").asNode();
    }

    public void updateNode(String label, String propertyKey, Object propertyValue, String updateKey, Object updateValue) {
        session.run("MATCH (n:" + label + " {" + propertyKey + ": $value}) SET n." + updateKey + " = $newValue", Values.parameters("value", propertyValue, "newValue", updateValue));
    }

    public void deleteNode(String label, String propertyKey, Object propertyValue) {
        session.run("MATCH (n:" + label + " {" + propertyKey + ": $value}) DELETE n", Values.parameters("value", propertyValue));
    }

    public void disconnect() {
        session.close();
        driver.close();
    }

    public static void main(String[] args) {
        CRUD_Neo4J example = new CRUD_Neo4J();
        example.connect("bolt://localhost:7687", "neo4j", "12345678");
        example.createNode("Person", "name", "John");
        Node johnNode = example.readNode("Person", "name", "John");
        System.out.println(johnNode.get("name").asString());
        // example.updateNode("Person", "name", "John", "age", 30);
        // example.deleteNode("Person", "name", "John");
        example.disconnect();
    }
}
