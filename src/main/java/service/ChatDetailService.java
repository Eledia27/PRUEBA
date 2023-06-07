/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Chat;
import entity.ChatDetails;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import repository.chatdetailrepository;
import repository.chatrepository;

/**
 *
 * @author L E N O V O
 */
public class ChatDetailService {
    
     @Autowired
    private chatdetailrepository chatdetailrepository;
    
    public ChatDetails Insertar( ChatDetails chatdetail){
    return chatdetailrepository.save(chatdetail);
    }
    
    
    public List<ChatDetails> listar(){
        return chatdetailrepository.findAll();
    }
    
}
