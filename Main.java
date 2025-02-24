// YOUR NAME: Conal Hamilton
// COLLABORATORS: None
// DATE: 23 February 2025

public class Main
{
    public static void main(String[] args)
    {
        //DECLARATION SECTION
        //complete fields
        String surname, givenName, category, cardNum, birthCountry, termsAndConditions;
        char sex;

        //parts of fields
        String birthMonth;
        int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear,
                validDay, validMonth, validYear, expireMonth, expireDay, expireYear;

        //extra vars to help with formatting of Strings (not raw data like above vars)
        String uscisNum, dateOfBirth, validDate, expireDate;

        //INITIALIZATION SECTION
        //surname = "CHAPETON-LAMAS";
        surname = UtilityBelt.readString("question: surname", 0, 144);
        //givenName = "NERY";
        givenName = UtilityBelt.readString("question: givenName", 0, 144);
        //uscisNum1 = 12;
        uscisNum1 = UtilityBelt.readInt("question: uscisNum1", 0, 1000);
        //uscisNum2 = 4;
        uscisNum2 = UtilityBelt.readInt("question: uscisNum2", 0, 1000);
        //uscisNum3 = 789;
        uscisNum3 = UtilityBelt.readInt("question: uscisNum3", 0, 1000);
        //category = "C09";
        category = UtilityBelt.readString("question: category", 0, 10);
        //cardNum = "SRC9876543210";
        cardNum = UtilityBelt.readString("question: cardNum", 0, 144);
        //birthCountry = "Guatemala";
        birthCountry = UtilityBelt.readString("question: birthCountry", 0, 144);
        //termsAndConditions = "None";
        termsAndConditions = UtilityBelt.readString("question: termsAndConditions", 0, 144);

        //birthDay = 1;
        birthDay = UtilityBelt.readInt("question: birthDay", 1, 31);
        //birthMonth = "JAN";
        birthMonth = UtilityBelt.readString("question: birthMonth", 3, 3);
        //birthYear = 1970;
        birthYear = UtilityBelt.readInt("question: birthYear", 1900, 2020);

        //sex = 'M'; //note single quotes
        sex = UtilityBelt.readChar("question: sex", "MF");

        //validMonth = 2;
        validMonth = UtilityBelt.readInt("question: validMonth", 1, 12);
        //validDay = 2;
        validDay = UtilityBelt.readInt("question: validDay", 1, 31);
        //validYear = 2020;
        validYear = UtilityBelt.readInt("question: validYear", 1900, 2040);

        //expireMonth = 2;
        expireMonth = UtilityBelt.readInt("question: expireMonth", 1, 12);
        //expireDay = 2;
        expireDay = UtilityBelt.readInt("question: expireDay", 1, 31);
        //expireYear = 2022;
        expireYear = UtilityBelt.readInt("question: expireYear", 1900, 2040);

        //Strings to help clean up long printf's below
        uscisNum = String.format("%03d-%03d-%03d", uscisNum1, uscisNum2, uscisNum3);
        dateOfBirth = String.format("%02d %s %d", birthDay, birthMonth, birthYear);
        validDate = Main.formatDate(validMonth, validDay, validYear); //New implementation
        expireDate = Main.formatDate(expireMonth, expireDay, expireYear); //New implementation


        //INPUT + CALCULATION SECTION
        //N/A

        //OUTPUT SECTION
        System.out.print(Main.formatCard(surname, givenName, category, cardNum, birthCountry, termsAndConditions, sex, uscisNum, dateOfBirth, validDate, expireDate));
    }
        //USER MADE METHODS
    public static void formatCardOld(String surname, String givenName,String category, String cardNum, String birthCountry, String termsAndConditions, char sex, String uscisNum, String dateOfBirth, String validDate, String expireDate)
    {
        System.out.printf("╔══════════════════════════════════════════════════════════════════════╗%n");
        System.out.printf("║%35s%35s║%n", Main.titleUSA(), "");
        System.out.printf("║%60s%10s║%n", Main.titleEAC(), "");
        System.out.printf("║%-25s%-45s║%n", "", Main.labelSurname());
        System.out.printf("║%-25s%-45s║%n", "", surname);
        System.out.printf("║%-25s%-45s║%n", Main.asciiArt0(), Main.labelGivenName());
        System.out.printf("║%-25s%-45s║%n", Main.asciiArt1(), givenName);
        System.out.printf("║%-25s%-15s%-15s%-15s║%n", Main.asciiArt2(), Main.labelUSCISNum(), Main.labelCategory(), Main.labelCardNum());
        System.out.printf("║%-25s%-15s%-15s%-15s║%n", Main.asciiArt3(), uscisNum, category, cardNum);
        System.out.printf("║%-25s%-45s║%n", Main.asciiArt4(), Main.labelBirthCountry());
        System.out.printf("║%-25s%-45s║%n", Main.asciiArt5(), birthCountry);
        System.out.printf("║%-25s%-45s║%n", Main.asciiArt6(), Main.labelTermsConditions());
        System.out.printf("║%-25s%-45s║%n", Main.asciiArt7(), termsAndConditions);
        System.out.printf("║%-25s%-15s%-30s║%n", Main.asciiArt8(), Main.labelBirthDate(), Main.labelSex());
        System.out.printf("║%-25s%-15s%-30s║%n", Main.asciiArt9(), dateOfBirth, sex);
        System.out.printf("║%-25s%-15s%-30s║%n", "", Main.labelValidDate(), validDate);
        System.out.printf("║%-25s%-15s%-30s║%n", "", Main.labelExpireDate(), expireDate);
        System.out.printf("║%-25s%-45s║%n", Main.asciiCredit(), Main.labelReEntryDisclaimer());
        System.out.printf("╚══════════════════════════════════════════════════════════════════════╝%n");
        return;
    }
    public static String formatCard(String surname, String givenName,String category, String cardNum, String birthCountry, String termsAndConditions, char sex, String uscisNum, String dateOfBirth, String validDate, String expireDate)
    {
        return String.format("╔══════════════════════════════════════════════════════════════════════╗%n║%35s%35s║%n║%60s%10s║%n║%-25s%-45s║%n║%-25s%-45s║%n║%-25s%-45s║%n║%-25s%-45s║%n║%-25s%-15s%-15s%-15s║%n║%-25s%-15s%-15s%-15s║%n║%-25s%-45s║%n║%-25s%-45s║%n║%-25s%-45s║%n║%-25s%-45s║%n║%-25s%-15s%-30s║%n║%-25s%-15s%-30s║%n║%-25s%-15s%-30s║%n║%-25s%-15s%-30s║%n║%-25s%-45s║%n╚══════════════════════════════════════════════════════════════════════╝%n", Main.titleUSA(), "", Main.titleEAC(), "", "", Main.labelSurname(), "", surname, Main.asciiArt0(), Main.labelGivenName(), Main.asciiArt1(), givenName, Main.asciiArt2(), Main.labelUSCISNum(), Main.labelCategory(), Main.labelCardNum(), Main.asciiArt3(), uscisNum, category, cardNum, Main.asciiArt4(), Main.labelBirthCountry(), Main.asciiArt5(), birthCountry, Main.asciiArt6(), Main.labelTermsConditions(), Main.asciiArt7(), termsAndConditions, Main.asciiArt8(), Main.labelBirthDate(), Main.labelSex(), Main.asciiArt9(), dateOfBirth, sex, "", Main.labelValidDate(), validDate, "", Main.labelExpireDate(), expireDate, Main.asciiCredit(), Main.labelReEntryDisclaimer());
        //Basically as below, for readability:
        //System.out.printf("╔══════════════════════════════════════════════════════════════════════╗%n");
        //System.out.printf("║%35s%35s║%n", Main.titleUSA(), "");
        //System.out.printf("║%60s%10s║%n", Main.titleEAC(), "");
        //System.out.printf("║%-25s%-45s║%n", "", Main.labelSurname());
        //System.out.printf("║%-25s%-45s║%n", "", surname);
        //System.out.printf("║%-25s%-45s║%n", Main.asciiArt0(), Main.labelGivenName());
        //System.out.printf("║%-25s%-45s║%n", Main.asciiArt1(), givenName);
        //System.out.printf("║%-25s%-15s%-15s%-15s║%n", Main.asciiArt2(), Main.labelUSCISNum(), Main.labelCategory(), Main.labelCardNum());
        //System.out.printf("║%-25s%-15s%-15s%-15s║%n", Main.asciiArt3(), uscisNum, category, cardNum);
        //System.out.printf("║%-25s%-45s║%n", Main.asciiArt4(), Main.labelBirthCountry());
        //System.out.printf("║%-25s%-45s║%n", Main.asciiArt5(), birthCountry);
        //System.out.printf("║%-25s%-45s║%n", Main.asciiArt6(), Main.labelTermsConditions());
        //System.out.printf("║%-25s%-45s║%n", Main.asciiArt7(), termsAndConditions);
        //System.out.printf("║%-25s%-15s%-30s║%n", Main.asciiArt8(), Main.labelBirthDate(), Main.labelSex());
        //System.out.printf("║%-25s%-15s%-30s║%n", Main.asciiArt9(), dateOfBirth, sex);
        //System.out.printf("║%-25s%-15s%-30s║%n", "", Main.labelValidDate(), validDate);
        //System.out.printf("║%-25s%-15s%-30s║%n", "", Main.labelExpireDate(), expireDate);
        //System.out.printf("║%-25s%-45s║%n", Main.asciiCredit(), Main.labelReEntryDisclaimer());
        //System.out.printf("╚══════════════════════════════════════════════════════════════════════╝%n");
    }
    public static String asciiArt0()
    {
        return "    .----.    .----.  ";
    }
    public static String asciiArt1()
    {
        return "   (  --  \\\\  /  --  )";
    }
    public static String asciiArt2()
    {
        return "          |  |        ";
    }
    public static String asciiArt3()
    {
        return "         _/  \\_      ";
    }
    public static String asciiArt4()
    {
        return "        (_    _)      ";
    }
    public static String asciiArt5()
    {
        return "     ,    `--`    ,   ";
    }
    public static String asciiArt6()
    {
        return "     \\'-.______.-'/  ";
    }
    public static String asciiArt7()
    {
        return "      \\          /   ";
    }
    public static String asciiArt8()
    {
        return "       '.--..--.'     ";
    }
    public static String asciiArt9()
    {
        return "         `\"\"\"\"\"` ";
    }
    public static String asciiCredit()
    {
        return "   ascii art by: jgs    ";
    }
    public static String titleUSA()
    {
        return "UNITED STATES OF AMERICA";
    }
    public static String titleEAC()
    {
        return "EMPLOYMENT AUTHORIZATION CARD";
    }
    public static String labelSurname()
    {
        return "Surname";
    }
    public static String labelGivenName()
    {
        return "Given Name";
    }
    public static String labelUSCISNum()
    {
        return "USCIS#";
    }
    public static String labelCategory()
    {
        return "Category";
    }
    public static String labelCardNum()
    {
        return "Card#";
    }
    public static String labelBirthCountry()
    {
        return "Country of Birth";
    }
    public static String labelTermsConditions()
    {
        return "Terms and Conditions";
    }
    public static String labelBirthDate()
    {
        return "Date of Birth";
    }
    public static String labelSex()
    {
        return "Sex";
    }
    public static String labelValidDate()
    {
        return "Valid From:";
    }
    public static String labelExpireDate()
    {
        return "Card Expires:";
    }
    public static String labelReEntryDisclaimer()
    {
        return "NOT VALID FOR REENTRY TO U.S.";
    }
    public static String formatDate(int month, int day, int year)
    {
        return String.format("%02d/%02d/%4d", month, day, year);
    }
}
