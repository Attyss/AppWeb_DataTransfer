package com.amorettyss.controler;


import com.amorettyss.model.User;

import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.List;

public class userService {
    //There simulate an DB
    public List<User> getAll(){
        //items
        User bodoque =new User(1,"Carl","Atty");
        User flaco =new User(2,"Jord", "Atty");
        User gordis =new User(3, "Xil", "Atty");

        //building a list of items
        ArrayList<User> zipotes=new ArrayList<User>() ;
        zipotes.add(bodoque);
        zipotes.add(flaco);
        zipotes.add(gordis);

        return  zipotes;
    }

}
