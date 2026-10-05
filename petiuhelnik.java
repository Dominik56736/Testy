public class petiuhelnik {
    
    private double stranaA;

    public petiuhelnik (double stranaA) {
        if(stranaA <= 0){
            this.stranaA = 1;
        } else {
            this.stranaA = stranaA;
        }
    }
    public double getStranaA(){
        return stranaA;
    }
    public void setStranaA(double stranaA){
        if(stranaA <= 0){
            this.stranaA = 1;
        } else {
            this.stranaA = stranaA;
        }
    }

    @Override
    public String toString(){
        return "Strana A petiuhelniku je takto dlouha: " + stranaA;
    }
    public float obsah(){
        return (float)((double)(Math.sqrt(25 + 10 * Math.sqrt(5)) / 4 * stranaA * stranaA));
    }
    public float obvod(){
        return (float)((double)(5 * stranaA));
    }
    public float polomerOpsaneKruznice(){
        return (float)((double)(Math.sqrt(50 + 10 * Math.sqrt(5)) / 10 * stranaA));
    }
    public float obsahOpsaneKruznice(){
        return (float)((double)(5 * stranaA * 3.14 * polomerOpsaneKruznice()));
    }

    public static void main(String[] args) {
        petiuhelnik p = new petiuhelnik(12);
        System.out.println(p);

        System.out.println("Obsah petiuhelniku o strane A - " + p.getStranaA() + " je: " + p.obsah());
        System.out.println("Obvod petiuhelniku o strane A - " + p.getStranaA() + " je: " + p.obvod());
        System.out.println("Polomer kruznice opsane petiuhelniku o strane A - " + p.getStranaA() + " je: " + p.polomerOpsaneKruznice());
        System.out.println("Obsah kruznice opsane petiuhelniku o strane A - " + p.getStranaA() + " je: " + p.obsahOpsaneKruznice());

    }
}
