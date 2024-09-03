public class Easter{
    private int y;

    public Easter(int year){
        y = year;
    }

    public void calculate(){
        int a = y % 19;

        int b = y / 100;
        
        int c = y % 100;

        int d = b / 4;

        int e = b % 4;

        int f = (b + 8) / 100;

        int g = (b-f+1) / 3;

        int h = (19*a+b-d-g+13) % 30;

        int i = c / 4;

        int k = c % 4;

        int r = (32+2*e+2*i-h-k) % 7;

        int m = (a+11*h+22) / 451;

        int n = (h+r-7*m+114) / 31;

        int p = (h+r-7*m+114) % 31;

        p += 1;
        System.out.println(n + "/" + p);
    }
}