public class Email {
  private String message;
  private boolean state;
  public Email (String message, boolean state) {

  }
  public void se (String message, boolean state) {
    this.message = message;
    this.state = state;
    if (state == true) {/*send seen email*/}
    if(state == false){/*send condirmation email*/}
  }
}
