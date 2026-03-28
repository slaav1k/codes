class Solution {
    public String maskPII(String s) {
        if (s.contains("@")) {
            return maskEmail(s);
        } else {
            return maskPhone(s);
        }
    }

    private String maskEmail(String email) {
        String[] parts = email.split("@");
        String name = parts[0].toLowerCase();
        String domain = parts[1].toLowerCase();

        String maskedName = name.charAt(0) + "*****" + name.charAt(name.length() - 1);

        return maskedName + "@" + domain;
    }

    private String maskPhone(String phone) {
        String digits = phone.replaceAll("[^0-9]", "");

        String localNumber = digits.substring(digits.length() - 10);
        String last4Digits = localNumber.substring(6);

        int countryCodeLength = digits.length() - 10;

        return switch (countryCodeLength) {
            case 0 -> "***-***-" + last4Digits;
            case 1 -> "+*-***-***-" + last4Digits;
            case 2 -> "+**-***-***-" + last4Digits;
            case 3 -> "+***-***-***-" + last4Digits;
            default -> "";
        };
    }
}