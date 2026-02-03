package com.email.assnt.app;


import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
