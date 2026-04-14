package AnythingForTest.LetsRevise.EmailMech.RepoLayer;

public class EmailDetails {

    public String to;
    public String subject;
    public String attachment;
    public String body;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
    public EmailDetails(){}

    public EmailDetails(String body, String attachment, String subject, String to) {
        this.body = body;
        this.attachment = attachment;
        this.subject = subject;
        this.to = to;
    }

    public EmailDetails(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "EmailDetails{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", attachment='" + attachment + '\'' +
                ", body='" + body + '\'' +
                '}';
    }


}
