package Chapter11;

public class ClassesRational {
    public static void main(String args[]){
        ClassesRational	temp1	= new	ClassesRational();
        temp1.setNumerator(17);
        temp1.setDenominator(-12);
        temp1.printRational();
        ClassesRational	temp2	= new	ClassesRational(temp1.getDenominator(),15);
        temp2.negate();
        temp2.invert();
        System.out.println(temp2+" "+temp2.add(temp1)+" "+temp2.toDouble());
    }
    private int	numerator;
    private int	denominator;
    public void	setNumerator(int numerator){
        this.numerator	= numerator;
        this.correct();
    }
    public int getNumerator(){
        return this.numerator;
    }
    public void	setDenominator(int denominator){
        this.denominator = denominator;
        this.correct();
    }
    public int getDenominator(){
        return this.denominator;
    }
    public ClassesRational(){
        this(0,1);
    }
    public ClassesRational(ClassesRational that){
        this(that.numerator,that.denominator);
    }
    public ClassesRational(int numerator, int denominator){
        this.set(numerator,denominator);
    }
    public void	set(ClassesRational that){
        this.set(that.numerator, that.denominator);
    }
    public void	set(int numerator, int denominator){
        this.numerator	= numerator;
        this.denominator = denominator;
        this.correct();
    }
    public void	printRational(){
        System.out.println(this.numerator+"/"+this.denominator);
    }
    public String toString(){
        return this.numerator+"/"+this.denominator;
    }
    public void	negate(){
        this.numerator	= -this.numerator;
    }
    public void	invert(){
        this.numerator+=this.denominator;
        this.denominator=this.numerator-this.denominator;
        this.numerator=this.numerator-this.denominator;
        this.correct();
    }
    public Double toDouble(){
        return (double)this.numerator	/ this.denominator;
    }
    public ClassesRational reduce(){
        int gcd = gcd();
        return new ClassesRational(this.numerator / gcd,	this.denominator / gcd);
    }
    public int gcd(){
        return gcd(this.numerator,	this.denominator);
    }
    private int	gcd(int m,int n){
        if	(m	% n == 0) {
            return n;
        }
        else {
            return gcd(n,m	% n);
        }
    }
    public ClassesRational add(ClassesRational that){
        int newNumerator = this.numerator *	that.denominator + that.numerator *	this.denominator;
        int newDenominator =	this.denominator * that.denominator;
        ClassesRational	result =	new ClassesRational(newNumerator,	newDenominator).reduce();
        result.correct();
        this.set(result);
        return result;
    }
    private void correct(){
        if	(this.denominator	< 0){
            this.negate();
            this.denominator = -this.denominator;
        }
    }
}

