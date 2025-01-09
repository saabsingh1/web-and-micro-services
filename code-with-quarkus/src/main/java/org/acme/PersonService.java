package org.acme;

public class PersonService {

    Person person = new Person("Susan", "USA");

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) throws PersonException{
        if (person.address().equals("-none-")){
            throw new PersonException("-none- not allowed as address");
        }
        this.person = person;
    }
}
