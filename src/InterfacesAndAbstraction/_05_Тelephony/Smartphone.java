package InterfacesAndAbstraction._05_Тelephony;


import java.util.List;

public class Smartphone implements Browsable, Callable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder allUrls = new StringBuilder();
        for (String url : urls) {
           boolean isValid=true;
            for (int i = 0; i < url.length(); i++) {
                if (Character.isDigit(url.charAt(i))){
                    allUrls.append("Invalid URL!").append(System.lineSeparator());
                    isValid=false;
                    break;
                }
            }if (isValid){

            allUrls.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            }
        }
        return allUrls.toString();
    }

    @Override
    public String call() {
        StringBuilder allNumber = new StringBuilder();
        for (String number : numbers) {
            boolean isValid=true;
            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))){
                    allNumber.append("Invalid number!").append(System.lineSeparator());
                    isValid=false;
                    break;
                }
            }if (isValid){

                allNumber.append("Calling... ").append(number).append(System.lineSeparator());
            }
        }
        return allNumber.toString();
    }
}
