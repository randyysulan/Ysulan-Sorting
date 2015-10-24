package sorting;

public class BubbleSort extends Sort {

    public BubbleSort(int numbers[]) {
        super(numbers);
    }
    
    public void sortAscending(){
        for(int a = 0; a < this.numbers.length; a++){
            for(int b = 0; b < this.numbers.length - 1; b++){
                if(this.compare(b, b + 1) == b){
                    this.swap(b, b + 1);
                }
            }
        }
    }
    
    public void sortDescending(){
        for(int a = 0; a < this.numbers.length; a++){
            for(int b = 0; b < this.numbers.length - 1; b++){
                if(this.compare(b, b + 1) == b+1){
                    this.swap(b, b + 1);
                }
            }
        }
    }
}
