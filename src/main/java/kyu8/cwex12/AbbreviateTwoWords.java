package kyu8.cwex12;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {

        StringBuilder abbrev = new StringBuilder();
        String[] twoWords;
        twoWords = name.split(" ");
        abbrev.append(twoWords[0], 0, 1);
        abbrev.append(".");
        abbrev.append(twoWords[1], 0, 1);

        return abbrev.toString().toUpperCase();
    }
}
