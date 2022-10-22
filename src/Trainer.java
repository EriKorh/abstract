public class Trainer extends TeamMember {
    
    private String education;

    public Trainer(String name, String education) {
        super(name);
        this.education = education;
    }

    public String GetMemberInfo() {
        return ("Name: " + super.getName() + ", Education: " + this.education);
    }

    public String getEducation() {
        return this.education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    
}
