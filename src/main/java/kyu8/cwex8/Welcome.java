package kyu8.cwex8;

/*

Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries.
    Marketing thinks it would be great to welcome visitors to the site in their own language. Luckily you already use
    an API that detects the user's location, so this is an easy win.

The Task:
Think of a way to store the languages as a database (eg an object). The languages are listed below so you can
    copy and paste!
Write a 'welcome' function that takes a parameter 'language' (always a string), and returns a greeting - if you have it
    in your database. It should default to English if the language is not in the database, or in the event of
    an invalid input.

The Database:
english: "Welcome",
czech: "Vitejte",
danish: "Velkomst",
dutch: "Welkom",
estonian: "Tere tulemast",
finnish: "Tervetuloa",
flemish: "Welgekomen",
french: "Bienvenue",
german: "Willkommen",
irish: "Failte",
italian: "Benvenuto",
latvian: "Gaidits",
lithuanian: "Laukiamas",
polish: "Witamy",
spanish: "Bienvenido",
swedish: "Valkommen",
welsh: "Croeso"

Possible invalid inputs include:
IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address
IP_ADDRESS_NOT_FOUND - ip address not in the database
IP_ADDRESS_REQUIRED - no ip address was supplied

 */

import java.util.HashMap;

public class Welcome {

    public static String greet(String language) {

        HashMap<String, String> database = new HashMap<>();
        database.put("english", "Welcome");
        database.put("czech", "Vitejte");
        database.put("danish", "Velkomst");
        database.put("dutch", "Welkom");
        database.put("estonian", "Tere tulemast");
        database.put("finnish", "Tervetuloa");
        database.put("flemish", "Welgekomen");
        database.put("french", "Bienvenue");
        database.put("german", "Willkommen");
        database.put("irish", "Failte");
        database.put("italian", "Benvenuto");
        database.put("latvian", "Gaidits");
        database.put("lithuanian", "Laukiamas");
        database.put("polish", "Witamy");
        database.put("spanish", "Bienvenido");
        database.put("swedish", "Valkommen");
        database.put("welsh", "Croeso");

        for (String key : database.keySet()) {
            if(key.equals(language)) {
                return database.get(key);
            }
        }

        return "Welcome";
    }
}
