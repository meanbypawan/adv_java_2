import java.util.Scanner;
// 
class ErrorMessage{
  private boolean status;
  private String message;
  public ErrorMessage(boolean status, String message){
    this.status = status;
    this.message = message;
  }
  public boolean getStatus(){
    return status;
  }
  public String getMessage(){
    return message;
  }
}
class ValidateData{
    public static boolean isValidName(String data){
      for(int i=0; i<data.length();i++){
         char ch = data.charAt(i);
         if(!(Character.isAlphabetic(ch) || Character.isSpace(ch)))
             return false;
      }
      return true;
    }
    public static ErrorMessage isValidMobileNumber(String data){
        try{
          Long.parseLong(data);
          if(data.length()!=10)
            return new ErrorMessage(false,"Mobile number must have 10 digit");
          return new ErrorMessage(true,"Valid mobile number");  
        }
        catch(Exception e){
           return new ErrorMessage(false,"Only Digits Are Allowed");
        }
    }
}
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Mobile Number");
       String mobile = sc.nextLine();
       ErrorMessage em  = ValidateData.isValidMobileNumber(mobile);
       if(em.getStatus())
         System.out.println(em.getMessage());
       else
          System.err.println("Error : "+em.getMessage());
       
    }
}