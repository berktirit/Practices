package FifthWeek;

// Outer Class: EmployeeProfile
public class EmployeeProfile {
    private String firstName;
    private String lastName;

    // Constructor
    public EmployeeProfile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Inner Class: ContactInfo
    public class ContactInfo {
        private String phoneNumber;
        private String email;

        // Constructor
        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // İletişim bilgilerini yazdırma metodu
        public void displayContactInfo() {
            System.out.println("Name and Surname: " + firstName + " " + lastName);
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Email: " + email);
        }
    }

    public static void main(String[] args) {
        // Çalışan oluşturma
        EmployeeProfile emp = new EmployeeProfile("Berk", "Tiritoğlu");

        // İletişim bilgilerini iç sınıf ile oluşturma
        EmployeeProfile.ContactInfo contact = emp.new ContactInfo("0555 555 55 55", "tiritberk@gmail.com");

        // Bilgileri gösterme
        contact.displayContactInfo();
    }
}