public class  Singer  extends Person{

private String badName;


    public Singer(String name, String designation, String badName) {
        super(name, designation);
        this.badName = badName;
    }

    public void singing(){
        System.out.println(getName()+ " is singing");
    }
    public void playGuitar(){
        System.out.println(getName()+ " is playing on guitar ");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "badName='" + badName + '\'' +
                "} " + super.toString();
    }
}
