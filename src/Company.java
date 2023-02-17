public class Company {
    private String Address;
    private Java java;
    private Android android;
    private Go go;
    private String ownerName;
    public Company (){

    }

    public Company(String address, Java java, Android android, Go go, String ownerName) {
        Address = address;
        this.java = java;
        this.android = android;
        this.go = go;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Java getJava() {
        return java;
    }

    public void setJava(Java java) {
        this.java = java;
    }

    public Android getAndroid() {
        return android;
    }

    public void setAndroid(Android android) {
        this.android = android;
    }

    public Go getGo() {
        return go;
    }

    public void setGo(Go go) {
        this.go = go;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "Address='" + Address + '\'' +
                ", java=" + java +
                ", android=" + android +
                ", go=" + go +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
