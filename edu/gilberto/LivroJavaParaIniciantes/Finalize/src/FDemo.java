class FDemo {
    int x;

    FDemo(int i){
        x = i;
    }

    protected void Finalize(){
        System.out.println("Finalizing " + x);
    }

    void generetor(int i){
        FDemo o = new FDemo(i);
    }
}

class Finalize {
    public static void main(String[] args) throws Exception {
        int count;

        FDemo ob = new FDemo (0);

        for (count = 1; count < 1000000000; count++)
        ob.generetor(count);
    }
}
