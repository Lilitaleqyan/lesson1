package Dog;

class Dog {
    private String name;
    private String bread;

    Dog(String name, String bread) {
        this.name = name;
        this.bread = bread;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
}
    class DogsType {
    public static void main (String [] args) {
        Dog dog1 = new Dog("Jack", "doberman");
        Dog dog2 = new Dog("Max", "husky");
        dog1.setName("Rocky");
        dog2.setBread("akita");
        System.out.println("name`" + dog1.getName() + " bread`" +
                dog1.getBread());
        System.out.println("name`" + dog2.getName() + " bread`" +
                dog2.getBread());
    }
}

