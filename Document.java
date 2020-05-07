public class Document {
   private String text;
   //Constructors
   
   // no-arg constructor that sets the field text to  "This space intentionally left blank.". 
   public Document() {
      String placeholderText = "This space intentionally left blank.";
      text = placeholderText;  
   }
   //A constructor that takes a parameter of type String and assigns that value to the field text.
   public Document(String textValue) {
      text = textValue;
   }
   //Methods
   
   //Method returns the value of text. 
   public String getText() {
      return text;
   }
   //Method sets the value of text to that of str.
   public void setText(String str) {
      text = str;
   }
   
   //Method returns the number of characters in the field text
   public int size() {
      return this.text.length(); 
   }
   
   //Method returns a String representing the document.
   public String toString() {
      return text;
   }

}