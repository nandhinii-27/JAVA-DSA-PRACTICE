public class Classroom {
    String className;
    String [] arr;
    Classroom(String className,String [] arr){
        this.className = className;
        this.arr = arr;
    }
    void print(){
        System.out.println(className);
        for(int i=0;i<arr.length;i++){
            System.out.println(this.arr[i]);
        }
    }
    public static void main(String [] args){
        String [] arr = {"abc","def","ghi"};
        Classroom c1 = new Classroom("A class",arr);
        c1.print();
    }
}

