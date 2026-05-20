package testing.collection;

public class Student {

    int studId;
    String name;
    String city;

    String dept;

    Integer marks;


    public Student(int studId,String name, String city,String dept,Integer marks){
        this.studId=studId;
        this.name=name;
        this.city=city;
        this.dept=dept;
        this.marks=marks;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return studId+", "+name+", "+city+", "+dept+", "+marks;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Student student)) return false;

        return studId == student.studId;
    }

    @Override
    public int hashCode() {
        return studId;
    }


}
