package zero.programmer.builder;

public class CustomerBuilder {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Customer build() {
        return new Customer(
                this.id,
                this.firstName,
                this.lastName,
                this.email,
                this.phone
        );
    }
}
