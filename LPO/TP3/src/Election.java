public class Election {
    private float a;
    private float b;
    private float c;
    private float d;

    public void initialise (float a, float b, float c, float d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    public String resultCandidat1 () {
        String result;
        if (a > 50) {
           result = "ÉLU";
        } else if (a<12.5) {
            result = "BATTU";
        } else {
            result = "EN BALLOTTAGE";
        }
        return result;
    }
    public void afficheTour2 (){
        int n = 0;
        if (a>50 || b>50 || c>50 || d>50){
            System.out.println("PAS DE DEUXIÈME TOUR");
        }else{
            if(a>12.5)
                n++;
            if(b>12.5)
                n++;
            if(c>12.5)
                n++;
            if(d>12.5)
                n++;
            System.out.println(n+" CANDIDATS AU DEUXIÈME TOUR");
        }
    }
}
