public class Details {


    public Details() {
    }

    public Details(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public Details(String name, int id, String role, int phn, String mail) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.phn = phn;
        this.mail = mail;
    }


    private String name;
    private int id;

    private String role;
    private int phn;
    private String mail;
    public void  showEmployeeDetails(){
        System.out.println(" Id :" + id);
        System.out.println("Name : "+ name);
        System.out.println("Role :" + role);
        System.out.println("phn: " + phn);
        System.out.println("mail:" + mail);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPhn() {
        return phn;
    }

    public void setPhn(int phn) {
        this.phn = phn;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
