package lab_6.task_11;

public class Convert implements IConvertable{
    private double C;
    private double F;
    private double K;

    public Convert(){}
    public void convert(double temple, String type){
        if(type == "C") {
            this.C = temple;
            this.F = this.C * 1.8 + 32;
            this.K = this.C + 213.15;
        }
        else if(type == "F"){
            this.F = temple;
            this.C = this.F - 32 * (5/9);
            this.K = this.C + 213.15;
        }
        else{
            this.K = temple;
            this.C = this.K - 213.15;
            this.F = this.C * 1.8 + 32;
        }
    }

    public double getC() {
        return C;
    }

    public double getF() {
        return F;
    }

    public double getK() {
        return K;
    }
}
