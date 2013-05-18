package Calculate;

public class Palindromo {
    
    private String number;
    
    public Palindromo(String number){
        this.number = number;
    }
    
    public boolean isPalindromo(){
        if(caseBase()) return true;
        return compareNumber();
    }

    private boolean caseBase() {
        if (number.length()==1) return true;
        return false;
    }

    private boolean compareNumber() {
        for(int i=0, ind=1; i<number.length(); i++, ind++){
            if(number.charAt(i)!=number.charAt(number.length()-ind)) return false;
        }
        return true;
    }
}
