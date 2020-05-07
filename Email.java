public class Email extends Document {
   private String sender;
   private String recipient;
   private String subject;
   
   
   
   // should have a constructor that takes four parameters of type String: one for the text field inherited from Document and one for each of its fields, sender, recipient, subject, and text. 
      public Email (String text, String sender, String recipient, String subject) {
           super(text);
           this.sender = sender;
           this.recipient = recipient;
           this.subject = subject;
         
         }
         //class should have a constructor that takes 3 parameters of type String: one for each of its fields, sender, recipient, and subject. It should set its text field inherited from Document to its default value.
         public Email(String sender, String recipient, String subject) {
             super();
             this.sender = sender;
             this.recipient = recipient;
             this.subject = subject;
         }
   
   
   
      //Its toString method should return a value in this form: 
   //From: a_name_here, To: some_name_here, Subject: some_text_here  Contents: more_text_here 
   //Note that Document has its own toString method which should be used to generate the contents portion of the returned String
   
   public String toString() {
      return  "From: " + this.sender + ","  +  " To: " + this.recipient + "," + " Subject: " + this.subject +  " \nContents: " + this.getText();
   }
}