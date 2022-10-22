public class Coach extends TeamMember {
    
    private int experience;

    public Coach(String name, int experience) {
        super(name);
        this.experience = experience;
    }

    public String GetMemberInfo() {
        return ("Name: " + super.getName() + ", Experience: " + this.experience);
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
