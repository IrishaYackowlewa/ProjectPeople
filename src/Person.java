public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person (boolean man, String name){
        this.name = name;
        this.man = man;
    }

    public String getName (){
        return name;
    }

    public String getNameSpouse (){
        return spouse.name;
    }

    public boolean marry(Person person) {
        if (this.man != person.man){
            if (haveSpouse()) {
                this.spouse.divorce();
                divorce();
            }
            if (person.haveSpouse()){
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

    public boolean haveSpouse (){
        return this.spouse != null;
    }

    public boolean divorce() {
        if (this.spouse != null){
            this.spouse = null;
            return true;
        }
        return false;
    }
}
