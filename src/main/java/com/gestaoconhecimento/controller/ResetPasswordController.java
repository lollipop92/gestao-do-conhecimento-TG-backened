package com.gestaoconhecimento.controller;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gestaoconhecimento.service.UsuarioService;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "resetPassword")
public class ResetPasswordController {

    @Autowired 
    private JavaMailSender mailSender;
    @Autowired 
    private UsuarioService usuarioService;


	@GetMapping(path = "{email}")
	public String getUsuario(@PathVariable("email") String email) {
		try {
	           MimeMessage mail = mailSender.createMimeMessage();
	           
	            MimeMessageHelper helper = new MimeMessageHelper( mail );
	            helper.setTo(email);
	            helper.setSubject( "Recuperação de senha" );
	            helper.setText("<p>Ola, utilize a senha para realizar o login:  " + usuarioService.gerarNovaSenha(email) + " </p>", true);
	            mailSender.send(mail);
			return "Ok";
		}catch(Exception e) {
			return "Erro ao enviar e-mail";
		}
	}
}
