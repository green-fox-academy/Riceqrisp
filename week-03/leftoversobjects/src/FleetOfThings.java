import java.util.Collections;

public class FleetOfThings  {

    public static void main(String[] args) {

        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        Thing milk = new Thing("Get milk");

        fleet.add(milk);
        fleet.add(new Thing ("poklop"));

        // This shortcut for Thing thing = new Thing()
        Thing stand = new Thing("Stand up");
        stand.complete();
        fleet.add(stand);
        Thing eat = new Thing ("Eat lunch");
        eat.complete();
        fleet.add(eat);

        Collections.sort(fleet);

        System.out.println(fleet);
    }


}