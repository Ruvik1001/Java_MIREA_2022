package lab_7.task_5_6;

public class ProcessStrings implements IString{
    String str;
    ProcessStrings(String str){
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public int length() {
        int length = 0;
        String tmp = "";
        for (int  i = 0; !this.str.equals(tmp) ;i++){
            length++;
            tmp += this.str.charAt(i);
        }

        return length;
    }

    @Override
    public String strOdd() {
        int len = this.length();
        String tmp = "";
        for (int i = 0; i < len; i++){
            if(i%2 != 0)
                tmp += this.str.charAt(i);
        }
        return tmp;
    }

    @Override
    public void reserveString() {
        int len = this.length();
        String tmp = "";
        for (int i = 0; i < len; i++)
            tmp = this.str.charAt(i) + tmp;
        this.str = tmp;
    }
}
