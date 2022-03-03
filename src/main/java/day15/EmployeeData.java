package day15;

import com.github.javafaker.Faker;

public class EmployeeData

{

        private String firstName;
        private String lastName;
        private String gender;
        private String phoneNumber;
        private String email;
        private String address;
        private String joinedDate;
        private String designation;

        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getGender() {
        return gender;
         }
        /*public String setGender(String gender) {
        this.gender = gender;
        }*/
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getJoinedDate() {
            return joinedDate;
        }
        public void setJoinedDate(String joinedDate) {
            this.joinedDate = joinedDate;
        }
        public String getDesignation() {
            return designation;
        }
        public void setDesignation(String designation) {
            this.designation = designation;
        }
    public void generateData(){
        Faker fakeData=new Faker();

        setFirstName(fakeData.name().firstName());
        setLastName(fakeData.name().lastName());
        setPhoneNumber(fakeData.phoneNumber().cellPhone());
        setEmail(fakeData.internet().emailAddress());
        setDesignation(fakeData.job().position());
    }

    }

