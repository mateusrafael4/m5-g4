package br.edu.inteli.cc.m5.grupo;

// Abaixo, estão as bibliotecas necessárias para a conexão com o Neo4J
import org.neo4j.driver.*;
import org.neo4j.driver.types.Node;
import org.neo4j.driver.types.Relationship;


import java.util.Scanner;

// Nesta classe, executamos as operações de CRUD no Neo4J, e como exemplo, criamos um nó com o nome "John", e depois imprimimos o nome do nó criado.
public class CRUD_Neo4J {

    private Driver driver;
    private Session session;

    public void connect(String uri, String user, String password) {
        this.driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
        this.session = driver.session();
    }

    public void disconnect() {
        session.close();
        driver.close();
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

    public void createRelationship(String startLabel, String startPropertyKey, Object startPropertyValue, String endLabel, String endPropertyKey, Object endPropertyValue, String relationshipType) {
        session.run("MATCH (a:" + startLabel + " {" + startPropertyKey + ": $startValue}), (b:" + endLabel + " {" + endPropertyKey + ": $endValue}) CREATE (a)-[r:" + relationshipType + "]->(b)", Values.parameters("startValue", startPropertyValue, "endValue", endPropertyValue));
    }

    public Relationship readRelationship(String startLabel, String startPropertyKey, Object startPropertyValue, String endLabel, String endPropertyKey, Object endPropertyValue, String relationshipType) {
        Record result = session.run("MATCH (a:" + startLabel + " {" + startPropertyKey + ": $startValue})-[r:" + relationshipType + "]->(b:" + endLabel + " {" + endPropertyKey + ": $endValue}) RETURN r", Values.parameters("startValue", startPropertyValue, "endValue", endPropertyValue)).single();
        return result.get("r").asRelationship();
    }    

    public void updateRelationship(String startLabel, String startPropertyKey, Object startPropertyValue, String endLabel, String endPropertyKey, Object endPropertyValue, String relationshipType, String updatePropertyKey, Object updatePropertyValue) {
        session.run("MATCH (a:" + startLabel + " {" + startPropertyKey + ": $startValue})-[r:" + relationshipType + "]->(b:" + endLabel + " {" + endPropertyKey + ": $endValue}) SET r." + updatePropertyKey + " = $newValue", Values.parameters("startValue", startPropertyValue, "endValue", endPropertyValue, "newValue", updatePropertyValue));
    }

    public void deleteRelationship(String startLabel, String startPropertyKey, Object startPropertyValue, String endLabel, String endPropertyKey, Object endPropertyValue, String relationshipType) {
    session.run("MATCH (a:" + startLabel + " {" + startPropertyKey + ": $startValue})-[r:" + relationshipType + "]->(b:" + endLabel + " {" + endPropertyKey + ": $endValue}) DELETE r", Values.parameters("startValue", startPropertyValue, "endValue", endPropertyValue));
    }


    /* public static void main(String[] args) {
        CRUD_Neo4J example = new CRUD_Neo4J();
        example.connect("bolt://localhost:7687", "neo4j", "12345678");
        example.createNode("Person", "name", "John");
        example.createNode("Person", "name", "Jane");
        example.createRelationship("Person", "Person", "name", "John", "name", "Jane", "KNOWS");
        Node johnNode = example.readNode("Person", "name", "John");
        System.out.println(johnNode.get("name").asString());
        // example.updateNode("Person", "name", "John", "age", 30);
        // example.deleteNode("Person", "name", "John");
        example.disconnect();
    } */ 

    public static void main(String[] args) {

        CRUD_Neo4J example = new CRUD_Neo4J();

        example.connect("bolt://localhost:7687", "neo4j", "12345678");

        Scanner scanner = new Scanner(System.in);

        int option = 0;

        while (option != 9) {
            System.out.println("Select an option:");
            System.out.println("1. Create new Vertice");
            System.out.println("2. Read Vertice");
            System.out.println("3. Delete Vertice");
            System.out.println("4. Update Vertice");
            System.out.println("5. Create new Relationship");
            System.out.println("6. Read Relationship");
            System.out.println("7. Delete Relationship");
            System.out.println("8. Update Relationship");
            System.out.println("9. Exit");

            option = scanner.nextInt();
            scanner.nextLine(); // consume the newline character after the int input

            switch (option) {

                case 1:

                    System.out.print("Enter label: ");
                    String label = scanner.nextLine();
                    System.out.print("Enter property key: ");
                    String propertyKey = scanner.nextLine();
                    System.out.print("Enter property value: ");
                    Object propertyValue = scanner.nextLine();

                    example.createNode(label, propertyKey, propertyValue);
                    break;

                case 2:

                    System.out.print("Enter label: ");
                    label = scanner.nextLine();
                    System.out.print("Enter property key: ");
                    propertyKey = scanner.nextLine();
                    System.out.print("Enter property value: ");
                    propertyValue = scanner.nextLine();

                    example.readNode(label, propertyKey, propertyValue);
                    break;

                case 3:

                    System.out.print("Enter label: ");
                    label = scanner.nextLine();
                    System.out.print("Enter property key: ");
                    propertyKey = scanner.nextLine();
                    System.out.print("Enter property value: ");
                    propertyValue = scanner.nextLine();

                    example.deleteNode(label, propertyKey, propertyValue);
                    break;

                case 4:

                    System.out.print("Enter label: ");
                    label = scanner.nextLine();
                    System.out.print("Enter property key: ");
                    propertyKey = scanner.nextLine();
                    System.out.print("Enter property value: ");
                    propertyValue = scanner.nextLine();
                    System.out.print("Enter update key: ");
                    String updateKey = scanner.nextLine();
                    System.out.print("Enter update value: ");
                    Object updateValue = scanner.nextLine();

                    example.updateNode(label, propertyKey, propertyValue, updateKey, updateValue);
                    break;

                case 5:

                    System.out.print("Enter start label: ");
                    String startLabel = scanner.nextLine();
                    System.out.print("Enter start property key: ");
                    String startPropertyKey = scanner.nextLine();
                    System.out.print("Enter start property value: ");
                    Object startPropertyValue = scanner.nextLine();
                    System.out.print("Enter end label: ");
                    String endLabel = scanner.nextLine();
                    System.out.print("Enter end property key: ");
                    String endPropertyKey = scanner.nextLine();
                    System.out.print("Enter end property value: ");
                    Object endPropertyValue = scanner.nextLine();
                    System.out.print("Enter relationship type: ");
                    String relationshipType = scanner.nextLine();

                    example.createRelationship(startLabel, startPropertyKey, startPropertyValue, endLabel, endPropertyKey, endPropertyValue, relationshipType);
                    break;
                    
                case 6:
                    
                        System.out.print("Enter start label: ");
                        startLabel = scanner.nextLine();
                        System.out.print("Enter start property key: ");
                        startPropertyKey = scanner.nextLine();
                        System.out.print("Enter start property value: ");
                        startPropertyValue = scanner.nextLine();
                        System.out.print("Enter end label: ");
                        endLabel = scanner.nextLine();
                        System.out.print("Enter end property key: ");
                        endPropertyKey = scanner.nextLine();
                        System.out.print("Enter end property value: ");
                        endPropertyValue = scanner.nextLine();
                        System.out.print("Enter relationship type: ");
                        relationshipType = scanner.nextLine();
    
                        example.readRelationship(startLabel, startPropertyKey, startPropertyValue, endLabel, endPropertyKey, endPropertyValue, relationshipType);
                        break;
                
                case 7:
                            System.out.print("Enter start label: ");
                            startLabel = scanner.nextLine();
                            System.out.print("Enter start property key: ");
                            startPropertyKey = scanner.nextLine();
                            System.out.print("Enter start property value: ");
                            startPropertyValue = scanner.nextLine();
                            System.out.print("Enter end label: ");
                            endLabel = scanner.nextLine();
                            System.out.print("Enter end property key: ");
                            endPropertyKey = scanner.nextLine();
                            System.out.print("Enter end property value: ");
                            endPropertyValue = scanner.nextLine();
                            System.out.print("Enter relationship type: ");
                            relationshipType = scanner.nextLine();
        
                            example.deleteRelationship(startLabel, startPropertyKey, startPropertyValue, endLabel, endPropertyKey, endPropertyValue, relationshipType);
                            break;

                
                case 8:
                            System.out.print("Enter start label: ");
                            startLabel = scanner.nextLine();
                            System.out.print("Enter start property key: ");
                            startPropertyKey = scanner.nextLine();
                            System.out.print("Enter start property value: ");
                            startPropertyValue = scanner.nextLine();
                            System.out.print("Enter end label: ");
                            endLabel = scanner.nextLine();
                            System.out.print("Enter end property key: ");
                            endPropertyKey = scanner.nextLine();
                            System.out.print("Enter end property value: ");
                            endPropertyValue = scanner.nextLine();
                            System.out.print("Enter relationship type: ");
                            relationshipType = scanner.nextLine();
                            System.out.print("Enter update key: ");
                            updateKey = scanner.nextLine();
                            System.out.print("Enter update value: ");
                            updateValue = scanner.nextLine();
        
                            example.updateRelationship(startLabel, startPropertyKey, startPropertyValue, endLabel, endPropertyKey, endPropertyValue, relationshipType, updateKey, updateValue);
                            break;
                case 9:
        
                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid option.");
                    break;
                    
            }
        }

        scanner.close();
        example.disconnect();
    }

}