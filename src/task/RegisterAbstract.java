package task;

public abstract class RegisterAbstract {
  public abstract void studentRegistration(String fullName, String identitas);

  public void regisSuccess(String identitas) {
    System.out.println("Regis success");
  }
}
