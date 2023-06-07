/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entity.Chat;
import entity.ChatDetails;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ChatDetailService;
import service.ChatService;

/**
 *
 * @author L E N O V O
 */

@RestController
@RequestMapping("/chatdetail")
public class ChatDetailcontroller {
    
     @Autowired
    private ChatDetailService chatdetailservice;
    
    
    @GetMapping("/listar")
    public List <ChatDetails> listar(){
        return chatdetailservice.listar();
    }
    
    @PostMapping("/insertar")
    public ChatDetails insertar(@RequestBody ChatDetails chatdetails){
        return chatdetailservice.Insertar(chatdetails);
    }
    
    
    
    
}
