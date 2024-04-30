import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryDatabase {
    private List<Record> records;

    public InMemoryDatabase() {
        this.records = new ArrayList<>();
    }

    public static class Record {
        private int account;
        private String name;
        private double value;

        public Record(int account, String name, double value) {
            this.account = account;
            this.name = name;
            this.value = value;
        }

        public int getAccount() {
            return account;
        }

        public String getName() {
            return name;
        }

        public double getValue() {
            return value;
        }
    }

    public void addRecord(Record record) {
        records.add(record);
    }

    public List<Record> getRecordsByName(String name) {
        return records.stream()
                .filter(record -> record.getName().equals(name))
                .collect(Collectors.toList());
    }

    public void deleteRecord(int account) {
        records.removeIf(record -> record.getAccount() == account);
    }

    public void updateRecord(int account, double newValue) {
        records.stream()
                .filter(record -> record.getAccount() == account)
                .findFirst()
                .ifPresent(record -> record.value = newValue);
    }
}









