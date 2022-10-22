public class Player extends TeamMember {
    
    private String position;

    public Player(String name, String position) {
        super(name);
        this.position = position;
    }

    public String GetMemberInfo() {
        return ("Name: " + this.getName() + ", Position: " + this.position);
    }


    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}
