package kyu8.cwex53;

/*

You're writing code to control your town's traffic lights. You need a function to handle each change from green,
    to yellow, to red, and then to green again.

Complete the function that takes a string as an argument representing the current state of the light and returns
    a string representing the state the light should change to.

For example, update_light('green') should return 'yellow'.

 */

public class TrafficLights {

    public static String updateLight(String current) {

        String[] trafficLights = {"green", "yellow", "red"};

        if (!current.equals(trafficLights[0]) && !current.equals(trafficLights[1])
                && !current.equals(trafficLights[2])) {

            throw new IllegalArgumentException("Please enter a valid input! Options: green, yellow, red.");
        }

        if (current.equals(trafficLights[0])) {
            return trafficLights[1];
        } else if (current.equals(trafficLights[1])) {
            return trafficLights[2];
        }

        return trafficLights[0];
    }
}
