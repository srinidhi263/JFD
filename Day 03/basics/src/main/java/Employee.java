public class Employee {
    public static void main(String[] args) {
        Details detailsEmpOne = new Details();
        detailsEmpOne.setName("Abcd");
        detailsEmpOne.setId(61);
        detailsEmpOne.setRole("Trainee");
        detailsEmpOne.setPhn(987654321);
        detailsEmpOne.setMail("Abcd@gmail.com");
        detailsEmpOne.showEmployeeDetails();

        Details detailsEmpTwo = new Details();
        detailsEmpTwo.setName("Ajju");
        detailsEmpTwo.setId(62);
        detailsEmpTwo.setRole("Trainee");
        detailsEmpTwo.setPhn(876543219);
        detailsEmpTwo.setMail("ajju153@gmail.com");
        detailsEmpTwo.showEmployeeDetails();

        Details detailsEmpThree = new Details("jeff", 63 , "Trainee", 765432198 , "jeff63@gmail.com" );
        detailsEmpThree.showEmployeeDetails();

        Details detailsEmpFour = new Details( "john", 64 , "Trainee");
        detailsEmpFour.setPhn(789654321);
        detailsEmpFour.setMail("john64@gmail.com");
        detailsEmpFour.showEmployeeDetails();

    }
}
