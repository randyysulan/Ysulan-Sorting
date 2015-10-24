package sorting;

public class Test {
    public static void main(String[] args){
        // initialize patient
        Patient[] patient = new Patient[6];
        patient[0] = new Patient("Christian", "Calimlim", 13, "apalit");
        patient[1] = new Patient("Corazon", "Calimlim", 19, "apalit");
        patient[2] = new Patient("arcee", "tolentino", 17, "cavite");
        patient[3] = new Patient("randy", "ysulan", 21, "pampanga");
        patient[4] = new Patient("carl", "pablea", 18, "pamapanga");
        patient[5] = new Patient("Charito", "Calimlim", 23, "apalit");
        
        System.out.println("UNSORTED PATIENT");
        for(int cout = 0; cout < patient.length; cout++){
            System.out.println((cout + 1) + ". " + patient[cout]);
        }
        
        
        // Transfer their ages to another array
        int[] ages = new int[patient.length];
        for(int a = 0; a < patient.length; a++){
            ages[a] = patient[a].getAge();
        }
       
        InsertionSort sort = new InsertionSort(ages);
        sort.sortDescending();
        
        // Sorted
        System.out.println("\nSORTED PATIENTS");
        for(int b = 0; b < patient.length; b++){
            for(int c = 0; c < patient.length; c++){
                if(sort.getValue(b) == patient[c].getAge()){
                    System.out.println((b + 1) + ". " + patient[c]);
                }
            }
        } 
    }
}
