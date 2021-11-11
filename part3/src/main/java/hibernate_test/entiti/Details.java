//package hibernate_test.entiti;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "details")
//public class Details
//{
//    public Details() {
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int detailsId;
//
//    @Column(name = "city")
//    private String city;
//
//    @Column(name = "phone_number")
//    private int phoneNumber;
//
//    @Column(name = "email")
//    private String email;
//
//    public int getDetailsId() {
//        return detailsId;
//    }
//
//    public void setDetailsId(int detailsId) {
//        this.detailsId = detailsId;
//    }
//
//    @OneToOne(mappedBy = "details", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
//    private Employe emp;
//
//
//    @Override
//    public String toString() {
//        return "Details{" +
//                "city='" + city + '\'' +
//                ", phoneNumber=" + phoneNumber +
//                ", email='" + email + '\'' +
//                '}';
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public int getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Employe getEmp() {
//        return emp;
//    }
//
//    public void setEmp(Employe emp) {
//        this.emp = emp;
//    }
//
//    public Details(String city, int phoneNumber, String email) {
//        this.city = city;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//    }
//}
