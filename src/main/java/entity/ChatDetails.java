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
public class ChatDetails {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Idchatdetail;
    private  String mensaje;
    private Integer userid;
    private Integer chatid;
    private Boolean isAgente;
    private LocalDateTime datetime;
    private Boolean state;
    
    
}
