public class bySection{
    double func(double x){
        return x*x + 4*x - 4;
    }

    double by_Section(double a, double b){
        double t = 0.00000000001;
        double c = (a+b)/2;
        if(func(a)*func(b)>=0){
            throw new IllegalArgumentException("No root found in the given interval");
        }
        while (Math.abs(func(c))>t){
            if (func(a)*func(c) < 0){
                b = c;
            } 
            else{
                a = c;
            }
            c = (a+b)/2;
        }
        return c;
    }
    public static void main(String[] args) {
        bySection obj = new bySection();
        System.out.println(obj.by_Section(0, 2));
    }
}