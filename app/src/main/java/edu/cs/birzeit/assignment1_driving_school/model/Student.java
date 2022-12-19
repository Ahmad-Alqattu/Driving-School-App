package edu.cs.birzeit.assignment1_driving_school.model;



    public class Student {
        private String name;
        private String idNumber;
        private String phoneNumber;
        private String sex;
        private String sessionType;
        private int sessionNumber;
        private String status;
        private int Paid;




        public Student(String name, String idNumber, String phoneNumber, String sex, String sessionType) {
            this.name = name;
            this.idNumber = idNumber;
            this.phoneNumber = phoneNumber;
            this.sex = sex;
            this.sessionType = sessionType;
            this.sessionNumber = 0;
            this.status="in training";
            this.Paid=0;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(String idNumber) {
            this.idNumber = idNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSessionType() {
            return sessionType;
        }

        public void setSessionType(String sessionType) {
            this.sessionType = sessionType;
        }


        public int getSessionNumber() {
            return sessionNumber;
        }

        public void setSessionNumber(int sessionNumber) {
            this.sessionNumber = sessionNumber;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getPaid() {
            return Paid;
        }

        public void setPaid(int paid) {
            Paid = paid;
        }
    }

