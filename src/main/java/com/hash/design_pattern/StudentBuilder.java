package com.hash.design_pattern;

public class StudentBuilder {

    private int rollNo;
    private String name;
    private boolean isCurrentStudent;
    private String hobby;

    private StudentBuilder(StudentBuilderObject builder) {
        this.rollNo = builder.rollNo;
        this.name = builder.name;
        this.isCurrentStudent = builder.isCurrentStudent;
        this.hobby = builder.hobby;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public boolean isCurrentStudent() {
        return isCurrentStudent;
    }

    public String getHobby() {
        return hobby;
    }

    public static class StudentBuilderObject{
        private int rollNo;
        private String name;
        private boolean isCurrentStudent;
        private String hobby;

        public StudentBuilderObject(int rollNo, String name){
            this.rollNo = rollNo;
            this.name = name;
        }

        public StudentBuilderObject setCurrentStudent(boolean isCurrentStudent){
            this.isCurrentStudent = isCurrentStudent;
            return this;
        }

        public StudentBuilderObject setHobby(String hobby){
            this.hobby = hobby;
            return this;
        }

        public StudentBuilder build(){
            return new StudentBuilder(this);
        }
    }

}
