package org.entity;

public class Department {
    private String Dep_ID;
    private String Dep_Name;

    public String getDep_ID() {
        return Dep_ID;
    }

    public void setDep_ID(String dep_ID) {
        Dep_ID = dep_ID;
    }

    public String getDep_Name() {
        return Dep_Name;
    }

    public void setDep_Name(String dep_Name) {
        Dep_Name = dep_Name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "Dep_ID='" + Dep_ID + '\'' +
                ", Dep_Name='" + Dep_Name + '\'' +
                '}';
    }
}
