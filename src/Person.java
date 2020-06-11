public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person (boolean man, String name){
        this.name = name;
        this.man = man;
    }

    public boolean marry(Person person) {
        if (this.man != person.man){
            if (this.spouse != null) {
                this.spouse.divorce();
                divorce();
            }
            if (person.spouse != null){
                person.spouse.divorce();
                person.divorce();
            }
            spouse = person;
            person.spouse = this;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean divorce() {
        if (spouse != null){
            spouse = null;
            return true;
        }
        return false;
    }
}
