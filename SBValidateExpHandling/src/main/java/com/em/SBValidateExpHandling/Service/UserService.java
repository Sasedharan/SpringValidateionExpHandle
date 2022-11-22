package com.em.SBValidateExpHandling.Service;

import com.em.SBValidateExpHandling.Model.UserInformation;

import java.util.List;

public interface UserService{

    public UserInformation saveInfo(UserInformation userInformation);
    public List<UserInformation> displayInfo();
}
