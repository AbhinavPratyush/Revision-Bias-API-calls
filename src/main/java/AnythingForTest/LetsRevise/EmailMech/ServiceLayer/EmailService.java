package AnythingForTest.LetsRevise.EmailMech.ServiceLayer;

import AnythingForTest.LetsRevise.EmailMech.RepoLayer.EmailDetails;

public interface EmailService {

    public String SendMailWithoutAttachment(EmailDetails emailDetails);

    public String SendMailWithAttachment(EmailDetails emailDetails);
}
