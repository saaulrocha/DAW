public class Bingo {
    private int[] bingo = new int[20];
     

    public int[] getBingo() {
        return bingo;
    }

    public void setBingo(int[] bingo) {
        this.bingo = bingo;
    }
    public Bingo() {
    }
    
    public int[] generarNumerosBingo() {
        for(int i=0;i<bingo.length;i++){
            boolean encontrado = false;
            int numeroAleatorio=(int)(Math.random()*20) + 1;
            for (int j=0;j<i ;j++){
                if(bingo[j]==numeroAleatorio)
                    encontrado=true;
            }
            if(!encontrado)
                bingo[i]=numeroAleatorio;
            else
                i--;
        }
        
        return bingo;
    }
}
