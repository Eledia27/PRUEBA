/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Chat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.chatrepository;

/**
 *
 * @author L E N O V O
 */
@Service 
public class ChatService {
    @Autowired
    private chatrepository chatrepository;
    
    public Chat Insertar( Chat chat){
    return chatrepository.save(chat);
    }
    
    
    public List<Chat> listar(){
        return chatrepository.findAll();
    }
    
}
