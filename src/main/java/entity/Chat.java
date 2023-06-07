/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @author L E N O V O
 */

@Entity
@Table(name="Chat")
public class Chat {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Idchat;
    private  String description;
    private Integer userid;
    private LocalDateTime datetime;
    private Boolean state;
    
    void prePersisten(){
        datetime=LocalDateTime.now();
    }
    

    
    
}
