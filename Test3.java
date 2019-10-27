/**
 * Author : Zhang Zhe
 */
import java.util.Arrays;
class  Test3 {
        private int[] elem;
        private int usedSize;
        private final int CAPACITY = 10;

    public Test3() {
            this.elem = new int[CAPACITY];
            this.usedSize = 0;
        }

        //打印
        public void display() {
            for (int i = 0; i < this.usedSize; i++) {
                System.out.print(this.elem[i] + " ");
            }
            System.out.println();
        }

        private boolean isFull() {
            if (this.usedSize == this.elem.length) {
                return true;
            }
            return false;
        }

        //在pos位置新增元素
        public void add(int pos, int date) {
            if (isFull()) {
                //二倍扩容
                this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
            }
            if (pos < 0 || pos > usedSize) {
                System.out.println("不合法");
                return;
            }
            //挪数据
            for (int i = usedSize - 1; i >= pos; i--) {
                this.elem[i + 1] = this.elem[i];
            }
            this.elem[pos] = date;
            usedSize++;
        }
        public boolean contains(int toFind){
            for(int i=0;i<this.usedSize;i++){
                if(this.elem[i]==toFind){
                    return true;
                }
            }
            return false;
        }
        //查找某个元素对应的位置
        public int search (int toFiind){
            for(int i=0;i<this.usedSize;i++){
                if(this.elem[i]==toFiind){
                    return i;
                }
            }
            return  -1;
        }
        //获取pos位置的元素
        public int getPos(int pos){
            if(pos<0||pos>=this.usedSize){
                System.out.println("pos位置不合法");
                return -1;
            }
            return this.elem[pos];
    }
    //删除第一行出现的关键字key
    public void remove(int toRemove){
        int index = search(toRemove);
        if(index==1){
            System.out.println("找不到要删除的数字");
            return;
        }
        for(int i=index;i<this.usedSize;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    //获取顺序表长度
    public int size(){
        return this.usedSize;
    }
    //清空顺序表
    public void clear(){
        this.usedSize=0;
    }
}





