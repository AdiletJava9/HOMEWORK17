public class Main {
    public static void main(String[] args) {
        Java java = new Java("Adilet", 22, "M", "@islambekowch");
        Java java1 = new Java("Manas", 27, "M", "@ManasKg");
        Java java2 = new Java("Ruslan", 22, "M", "@RUS_02");
        Java java3 = new Java("Davran", 18, "M", "@Dawran");
        Java java4 = new Java("Matmusa", 21, "M", "@Matmusa");

        Android android = new Android("Sanjar", 18, "M", "@Sancho");
        Android android1 = new Android("Temirlan", 21, "M", "@theTemirlan");
        Android android2 = new Android("Kanykei", 16, "F", "@Kanykei");
        Android android3 = new Android("Aikejan", 18, "F", "@AIKA");

        Go go = new Go("Baktiar", 20, "M", "@Bahti");
        Go go1 = new Go("Mirbek", 16, "M", "@Mirbek");
        Go go2 = new Go("Erjigit", 19, "M", "@Mirba");
        Go go3 = new Go("Aizat", 20, "F", "@Aika02");

        Company company = new Company();
        company.setAddress("Vostok5");
        company.setOwnerName("Esen Niazov");
        company.setJava(java);
        company.setJava(java1);
        company.setJava(java2);
        company.setJava(java3);
        company.setJava(java4);
        company.setAndroid(android);
        company.setAndroid(android1);
        company.setAndroid(android2);
        company.setGo(go);
        company.setGo(go1);
        System.out.println(company);

        Company company1 = new Company();
        company1.setAddress("USA");
        company1.setOwnerName("Elon Musk");
        company1.setJava(java3);
        company1.setJava(java4);
        company1.setAndroid(android2);
        company1.setGo(go3);
        System.out.println(company1);
    }
}