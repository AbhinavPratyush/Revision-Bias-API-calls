package AnythingForTest.LetsRevise.EmailMech.ServiceLayer;

import AnythingForTest.LetsRevise.EmailMech.RepoLayer.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailServiceImpl implements EmailService{

    @Autowired
    public JavaMailSender javaMailSender;

    @Value("${spring.mail.sender}")
    private String sender;

    @Override
    public String SendMailWithoutAttachment(EmailDetails e) {
try{
    SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
    simpleMailMessage.setTo(e.Recipent);
    simpleMailMessage.setSubject(e.subject);
    simpleMailMessage.setText(e.body);
//    simpleMailMessage.setSentDate(); //work in delay
simpleMailMessage.setFrom(sender);

javaMailSender.send(simpleMailMessage);

}
catch (Exception exp){

}

        return "";
    }

    @Override
    public String SendMailWithAttachment(EmailDetails emailDetails) {
        return "Attachment will be checked later";
    }
}
