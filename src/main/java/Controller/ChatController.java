/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entity.Chat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ChatService;

/**
 *
 * @author L E N O V O
 */

@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    private ChatService chatservice;
    
    
    @GetMapping("/listar")
    public List <Chat> listar(){
        return chatservice.listar();
    }
    
    @PostMapping("/insertar")
    public Chat insertar(@RequestBody Chat chat){
        return chatservice.Insertar(chat);
    }
    
    
    
}
