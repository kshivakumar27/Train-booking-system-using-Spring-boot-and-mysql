package net.javaguides.springbootcrudrestfulwebservices.controller;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springbootcrudrestfulwebservices.dto.InfoResponse;
import net.javaguides.springbootcrudrestfulwebservices.entity.Admin;
import net.javaguides.springbootcrudrestfulwebservices.entity.User;
import net.javaguides.springbootcrudrestfulwebservices.repository.AdminRepository;
import net.javaguides.springbootcrudrestfulwebservices.repository.UserRepository;

import net.javaguides.springbootcrudrestfulwebservices.dto.InfoRequest;

@RestController
public class militarycontroller {
	
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/placeOrder")
    public User placeOrder(@RequestBody InfoRequest request){
       return userRepository.saveAll((S) request.getUser());
    }

    @GetMapping("/findAllOrders")
    public List<User> findAllOrders(){
        return userRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<InfoResponse> getJoinInformation(){
        return userRepository.getJoinInformation();
    }
	
	
	
	
	
	
	

}
