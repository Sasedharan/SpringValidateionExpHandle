package com.em.SBValidateExpHandling.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Customer")
public class UserInformation {
    @Id
    @GeneratedValue
    private int userID;
    @NotBlank(message = "Name should not be Empty")
    private String Name;
    @Size(max = 10,min = 10,message = "Invalid Phone no")
    private String mobileNo;
    @Email (message = "Invalid id")
    private String mailID;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;

}
