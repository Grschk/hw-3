public class ATM {
    public int countBanknotes(int sum){
        int [] banknotes = {500,200,100,50,20,10,5,2,1};
        int count=0, i=0;
        while (sum!=0){
            if (sum >= banknotes[i]) {
                count = count + sum / banknotes[i];
                sum = sum - (sum / banknotes[i]) * banknotes[i];
            }
            i++;
        }
        return count;
    } 
}