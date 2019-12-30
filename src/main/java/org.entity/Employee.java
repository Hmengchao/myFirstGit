package org.entity;

import java.util.Date;

public class Employee {
    private  int Emp_ID;
    private String  Emp_Name;
    private String Emp_Sex;
    private int Emp_Age;
    private Date Emp_Date;
    private String Emp_Address;
    private String Emp_Tel;
    private String Dep_ID;

    public int getEmp_ID() {
        return Emp_ID;
    }

    public void setEmp_ID(int emp_ID) {
        Emp_ID = emp_ID;
    }

    public String getEmp_Name() {
        return Emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        Emp_Name = emp_Name;
    }

    public String getEmp_Sex() {
        return Emp_Sex;
    }

    public void setEmp_Sex(String emp_Sex) {
        Emp_Sex = emp_Sex;
    }

    public int getEmp_Age() {
        return Emp_Age;
    }

    public void setEmp_Age(int emp_Age) {
        Emp_Age = emp_Age;
    }

    public Date getEmp_Date() {
        return Emp_Date;
    }

    public void setEmp_Date(Date emp_Date) {
        Emp_Date = emp_Date;
    }

    public String getEmp_Address() {
        return Emp_Address;
    }

    public void setEmp_Address(String emp_Address) {
        Emp_Address = emp_Address;
    }

    public String getEmp_Tel() {
        return Emp_Tel;
    }

    public void setEmp_Tel(String emp_Tel) {
        Emp_Tel = emp_Tel;
    }

    public String getDep_ID() {
        return Dep_ID;
    }

    public void setDep_ID(String dep_ID) {
        Dep_ID = dep_ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Emp_ID=" + Emp_ID +
                ", Emp_Name='" + Emp_Name + '\'' +
                ", Emp_Sex='" + Emp_Sex + '\'' +
                ", Emp_Age=" + Emp_Age +
                ", Emp_Date=" + Emp_Date +
                ", Emp_Address='" + Emp_Address + '\'' +
                ", Emp_Tel='" + Emp_Tel + '\'' +
                ", Dep_ID='" + Dep_ID + '\'' +
                '}';
    }
}
