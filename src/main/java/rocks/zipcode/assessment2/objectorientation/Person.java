package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person extends Address {
    private long id;
    private String name;
    private Address address;


    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        id = Long.MIN_VALUE;
        name = "";
        address = new Address();


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        address = getAddress();
    }

    @Override
    public boolean equals(Object o) {
        return (Boolean)null;
    }

    @Override
    public String toString(){
        StringBuilder newPrint = new StringBuilder();
        newPrint.append("Person{id=" +id + ", name='" + name);
        newPrint.append("', address=" + getAddress()+ "}");

        return  newPrint.toString();
    }




}