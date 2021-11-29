import java.util.Scanner;

public class Phone {

    private String owner;
    private String ownerTelephoneNumber;



    public Phone(String owner, String ownerTelephoneNumber )
    {
        this.owner = owner;
        this.ownerTelephoneNumber = ownerTelephoneNumber;
    }




    public void dialAnyNumber(String number)
    {
        System.out.println("You are dialing " + number);
    }

    public void speedDial(String contact)
    {
        String[] contacts = new String[] {"Dad", "Mom", "Grandma", "Grandpa", "Sister"};
        if ("Dad".equals(contacts)) {
            System.out.println("You have speed dialed " + contacts[0]);
        } else if ("Mom".equals(contacts)) {
            System.out.println("You have speed dialed " + contacts[1]);
        } else if ("Grandma".equals(contacts)) {
            System.out.println("You have speed dialed " + contacts[2]);
        } else if ("Grandpa".equals(contacts)) {
            System.out.println("You have speed dialed " + contacts[3]);
        } else if ("Sister".equals(contacts)) {
            System.out.println("You have speed dialed " + contacts[4]);
        } else {
            System.out.println("You have not entered any valid contacts for a speed dial.");
        }
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerTelephoneNumber() {
        return ownerTelephoneNumber;
    }

    public void setOwnerTelephoneNumber(String ownerTelephoneNumber) {
        this.ownerTelephoneNumber = ownerTelephoneNumber;
    }




}
