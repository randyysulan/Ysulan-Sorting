package sorting;

public class Sort {
    
    protected int[] numbers;
    
    public Sort(int[] numbers){
        this.numbers = numbers;
    }
    
    public void swap(int x , int y){
        int tmp = this.numbers[x];
        this.numbers[x] = this.numbers[y];
        this.numbers[y] = tmp;
    }
    
    public int compare(int indexA, int indexB){
        if(this.numbers[indexA] > this.numbers[indexB]){
            return indexA;
        }else if(this.numbers[indexA] < this.numbers[indexB]){
            return indexB;
        }else{
            return -1;
        }
    }
    
    public void displayArray(){
        for(int a = 0; a < this.numbers.length; a++){
            System.out.print(this.numbers[a] + " ");
        }
    }
    
    public int getValue(int x){
        return this.numbers[x];
    }
}
