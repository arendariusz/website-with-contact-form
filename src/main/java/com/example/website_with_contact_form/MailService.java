package com.example.website_with_contact_form;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.beans.JavaBean;

@Service
public class MailService {

    private static final Logger logger = LoggerFactory.getLogger(MailService.class);

    private JavaMailSender javaMailSender;

    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail(String senderName, String senderMail, String text) {
        final String receiver = "arendariusztest@onet.pl";
        String sender = senderName + " napisał/a: ";

        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
            helper.setFrom(receiver);
            helper.setReplyTo(senderMail);
            helper.setTo(receiver);
            helper.setText(sender + text);

            javaMailSender.send(mimeMessage);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
