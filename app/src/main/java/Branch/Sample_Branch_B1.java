package Branch;

public class Sample_Branch_B1 {
    String name,id ;
    float cgpa ;
    Sample_Branch_B1(String s,String s1,float f)
    {
        this.name = s;
        this.id = s1;
        this.cgpa = f;
    }
    public String getName()
    {
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public String getId() {
        return id;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public void setId(String id) {
        this.id = id;
    }
}
