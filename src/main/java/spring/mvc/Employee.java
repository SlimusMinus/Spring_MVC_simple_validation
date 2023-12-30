package spring.mvc;

import spring.mvc.annotation.CheckEmail;

import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee {
    @Size(min = 2, message = "size name must be min 2 letter")
    private String name;
    @NotEmpty(message = "surname can be hot null")
    @NotBlank(message = "surname can be hot null")
    private String surname;
    @Min(value = 500, message = "salary must be > 500")
    @Max(value = 1001, message = "salary must be < 1001")
    private int salary;
    private String department;
    private HashMap<String, String> departments;
    private String carBrand;
    private Map <String, String> carBrands;
    private String[] languages;
    private Map<String, String> languagesList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail (value = "abc.com", message = "email must be ended abc.com")
    private String email;
    public Employee() {
        departments = new HashMap<>();
        departments.put("Human resources", "HR");
        departments.put("Information techonology", "IT");
        departments.put("Sales", "Sales");
        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes", "Mers");
        languagesList = new HashMap<>();
        languagesList.put("English", "EN");
        languagesList.put("Russian", "RU");
        languagesList.put("French", "FR");

    }

    @Override
    public String toString() {
        return "Employee - " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public HashMap<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(HashMap<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

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


}
