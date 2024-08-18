class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n = password.length();
        if(n<8){
            return false;
        }
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialChars = "!@#$%^&*()-+";
        for(int i=0; i<n; i++){
            if(Character.isLowerCase(password.charAt(i))) hasLower = true;
            if(Character.isUpperCase(password.charAt(i))) hasUpper = true;
            if(Character.isDigit(password.charAt(i))) hasDigit = true;
            if(specialChars.contains(""+password.charAt(i))) hasSpecial = true;

            if(i>0 && password.charAt(i)==password.charAt(i-1)){
                return false;
            }
        }
        return hasLower && hasUpper && hasDigit && hasSpecial;
        


    }
}
