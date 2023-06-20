package com.example.demo.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.demo.model.MailForm;

@Service
public class SendMailService{

    @Autowired
    private JavaMailSender mailSender;

    public void send(MailForm mailForm) throws MessagingException {
    	MimeMessage mimeMsg = mailSender.createMimeMessage();
    	MimeMessageHelper helper = new MimeMessageHelper(mimeMsg,true);
    	
    	String[] to = mailForm.getSendTo().split(",");
    	
    	
    	
        helper.setFrom(mailForm.getFrom());
        helper.setTo(to); 
        helper.setSubject(mailForm.getSubject());
        helper.setText(mailForm.getContent());
        mailSender.send(mimeMsg);
        }
}