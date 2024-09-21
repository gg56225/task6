//Interface Segregation Principle Мы потенциально могли бы разделить более крупные интерфейсы, такие как этот и на более мелкие,
// более специфичные интерфейсы для различных функциональных возможностей.

public interface UserController <T extends User> {

    void create(String firstName, String lastName, String middleName);
}

