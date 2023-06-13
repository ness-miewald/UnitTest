public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {

        return myString;
    }

    @Override
    public void setString(String string) {

        myString = string;
    }

    @Override
        public boolean detectCapitalUse() {
            if (myString == null) {
                return false;
            }

            int capitalCount = 0;
            boolean firstCapital = false;

            for (int i = 0; i < myString.length(); i++) {
                char ch = myString.charAt(i);

                if (Character.isUpperCase(ch)) {
                    capitalCount++;

                    if (i == 0) {
                        firstCapital = true;
                    }
                }
            }

            if (capitalCount == 0 || capitalCount == myString.length() || (capitalCount == 1 && firstCapital)) {
                return true;
            }

            return false;
        }
}



