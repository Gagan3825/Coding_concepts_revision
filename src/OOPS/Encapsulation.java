package OOPS;

class bank{
  private  long acc_no;
  private String name,email;
  private float ammount;

    public long getAcc_no() {
        return acc_no;
    }
    public float getAmmount() {
        return ammount;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmmount(float ammount) {
        this.ammount = ammount;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        bank obj=new bank();
        obj.setAcc_no(2465499666l);
        obj.setAmmount(100000);
        obj.setName("Gagan");
        obj.setEmail("singhgagandeep2025@gmail.com");

        System.out.println(obj.getAcc_no() + " " + obj.getName() + " " + obj.getAmmount() + " " + obj.getEmail());
    }
}
