public class newtonsMethod {
    double function(double x0) {
        return x0*x0*x0 - x0*x0 + 2;
    }
    double funcDertvative(double x0){
        return 3*x0*x0 - 2*x0;
    }
    double xnplus1(double x0){
        if(funcDertvative(x0)==0){
            System.out.println("Division By 0 Error");
            return 0;
        }
        return x0-(function(x0)/funcDertvative(x0));
    }

    double findRoot(double prevxnplus1, double x0){
        if(prevxnplus1 == x0)return x0;
        else return findRoot(x0, xnplus1(x0));
    }

    public static void main(String[] args) {
        newtonsMethod x = new newtonsMethod();
        System.out.println(x.findRoot(Double.MIN_VALUE, -20));
    }

}
