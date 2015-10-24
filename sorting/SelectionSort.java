package sorting;

public class SelectionSort extends Sort {
    
    public SelectionSort(int numbers[]){
        super(numbers);
    }
    
    public void sortAscending(){
        for(int a = 0; a < this.numbers.length - 1; a++){
            for(int b = a + 1; b < this.numbers.length; b++){
                if(this.compare(a, b) == a){
                    this.swap(a, b);
                }
            }
        }
    }
    
    public void sortDescending(){
        for(int a = 0; a < this.numbers.length - 1; a++){
            for(int b = a + 1; b < this.numbers.length; b++){
                if(this.compare(a, b) == b){
                    this.swap(a, b);
                }
            }
        }
    }
}
