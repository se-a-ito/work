package Kadai208_01;


public class Number {
    private int num1;
    private int num2;
    private static final String regex_AlphaNum = "^[0-9]*$" ;

    public int getNum1()  {
        return num1;
    }

    public void setNum1(String num1) throws NotHankakuException, NotNumberException {
        try{
            if (!num1.matches(regex_AlphaNum)) {
                throw new NotHankakuException();
            }
            this.num1 = Integer.parseInt(num1);
        }catch (NumberFormatException e) {
           throw new NotNumberException(e);
        }
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(String num2) throws NotHankakuException, NotNumberException {
        try {
            if (!num2.matches(regex_AlphaNum)) {
                throw new NotHankakuException();
            }
            this.num2 = Integer.parseInt(num2);
        } catch (NumberFormatException e) {
            throw new NotNumberException(e);
        }
    }

    public int addNum(int num1 ,int num2) {
        return num1 + num2;
    }
}
