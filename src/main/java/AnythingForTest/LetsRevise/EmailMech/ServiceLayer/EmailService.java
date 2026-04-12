package AnythingForTest.LetsRevise.EmailMech.ServiceLayer;

import AnythingForTest.LetsRevise.EmailMech.RepoLayer.EmailDetails;

public interface EmailService {

    public void SendMailWithoutAttachment(EmailDetails emailDetails);

    public String SendMailWithAttachment(EmailDetails emailDetails);
}
