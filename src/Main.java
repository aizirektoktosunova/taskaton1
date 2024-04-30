
public class Main {
    public static void main(String[] args) {
        InMemoryDatabase database = new InMemoryDatabase();

        database.addRecord(new InMemoryDatabase.Record(1, "Alice", 100.0));
        database.addRecord(new InMemoryDatabase.Record(2, "Bob", 200.0));
        database.addRecord(new InMemoryDatabase.Record(3, "Alice", 150.0));

        System.out.println("Records with name Alice:");
        database.getRecordsByName("Alice").forEach(record -> System.out.println(record.getAccount() + " - " + record.getValue()));

        database.deleteRecord(2);

        System.out.println("\nRecords with name Bob:");
        database.getRecordsByName("Bob").forEach(record -> System.out.println(record.getAccount() + " - " + record.getValue()));

        database.updateRecord(1, 150.0);

        System.out.println("\nRecords with name Alice after update:");
        database.getRecordsByName("Alice").forEach(record -> System.out.println(record.getAccount() + " - " + record.getValue()));

    }
}


