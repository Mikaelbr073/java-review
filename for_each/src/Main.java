public class Main {
    public static void main(String[] args){

        String[] people = new String[]{"mikael", "pedro", "luis"};

        for(int i = 0; i < people.length; i++){
            System.out.println(people[i]);
        }

        for(String obj: people){
            System.out.println(obj);
        }

        System.out.println();
    }
}
