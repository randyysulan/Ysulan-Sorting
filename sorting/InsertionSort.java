package sorting;

public class InsertionSort extends Sort {
    
    public InsertionSort(int[] numbers){
        super(numbers);
    }
    
    public void sortAscending(){
        int a, b, tmp, c;
        for(a = 0; a < this.numbers.length - 1; a++){
            b = a + 1;
            c = b;
            tmp = this.numbers[b];
            while(b > 0 && this.numbers[b - 1] > this.numbers[b]){
                    this.numbers[b] = this.numbers[b - 1];
                    b--;
                    this.numbers[b] = tmp;
            }
        }
    }
    
    public void sortDescending(){
        int a, b, tmp;
        for(a = 0; a < this.numbers.length - 1; a++){
            b = a + 1;
            while(b > 0 && this.numbers[b - 1] < this.numbers[b]){
                tmp = this.numbers[b - 1];
                this.numbers[b - 1] = this.numbers[b];
                b--;
                this.numbers[b + 1] = tmp;
            }
        }
    }
}
