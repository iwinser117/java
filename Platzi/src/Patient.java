public class Patient {
    int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    Patient (String name, String email){
        this.name = name;
        this.email = email;
    }

    public void setWeight (double weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + " Kg.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 8){
            System.out.println("El numero de telefono no debe ser mayor a 8 caracteres");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + "Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
