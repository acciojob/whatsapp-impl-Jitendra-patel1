package com.driver;

import java.util.Date;
import java.util.List;

public class WhatsappService {
    WhatsappRepository whatsappRepository = new WhatsappRepository();

    public String createUser(String name, String mobile) {             //1
      User user = new User(name,mobile);
     String create= whatsappRepository.createUser(user);
     return create;
    }

    public Group createGroup(List<User> users) {                         //2

      return whatsappRepository.createGroup(users);
    }

    public int createMessage(String content) {                          //3
        int ans=whatsappRepository.createMessage(content);

        return ans;
    }

    public int sendMessage(Message message, User sender, Group group) {   //4
        int ans=whatsappRepository.sendMessage(message,sender,group);
        return ans;
    }

    public String changeAdmin(User approver, User user, Group group) {   //5
        String ans=whatsappRepository.changeAdmin(approver,user,group);
        return ans;
    }

    public int removeUser(User user) {         //6
       int ans=whatsappRepository.removeUser(user);

        return ans;
    }

    public String findMessage(Date start, Date end, int k) {
         return whatsappRepository.findMessage(start,end,k);
    }
}
