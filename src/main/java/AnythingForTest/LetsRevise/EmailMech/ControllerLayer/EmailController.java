package AnythingForTest.LetsRevise.EmailMech.ControllerLayer;

import AnythingForTest.LetsRevise.EmailMech.RepoLayer.EmailDetails;
import AnythingForTest.LetsRevise.EmailMech.ServiceLayer.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {

    @Autowired
    public EmailService emailService;

    @PostMapping("/sendEmail")
    public void Send(@RequestBody  EmailDetails e){
        System.out.println(e.toString());
        emailService.SendMailWithoutAttachment(e);

    }

//    @GetMapping("/")
//    public String home(){
//        return "/sendEmail";
//
//    }

}
