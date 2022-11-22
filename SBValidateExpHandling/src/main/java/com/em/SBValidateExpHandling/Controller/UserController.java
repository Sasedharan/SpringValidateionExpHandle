package com.em.SBValidateExpHandling.Controller;

import com.em.SBValidateExpHandling.Model.UserInformation;
import com.em.SBValidateExpHandling.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/emp")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<UserInformation> save(@Valid @RequestBody UserInformation userInformation) {
        return new ResponseEntity<UserInformation>(userService.saveInfo(userInformation), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<UserInformation> display(){
        return new ResponseEntity(userService.displayInfo(),HttpStatus.FOUND);
    }

}
