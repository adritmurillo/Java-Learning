public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i){
                case 1 -> "Mary";
                case 2 -> "John";
                case 3 -> "Jane";
                case 4 -> "Jack";
                case 5 -> "Michael";
                default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java MasterClass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/06/1997",  "Java MasterClass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Joaquin", "28/08/2004", "Java MasterClass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + "was born in " + pojoStudent.getDateOfBirth());
        System.out.println(recordStudent.name() + "was born in " + recordStudent.dateOfBirth());


    }

}
