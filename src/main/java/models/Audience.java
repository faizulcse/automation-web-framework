package models;

public class Audience {
    private String name;
    private String permission_reminder;
    private boolean email_type_option;
    private Contact contact;
    private CampaignDefaults campaign_defaults;

    public void setName(String name) {
        this.name = name;
    }

    public static class Contact {
        String company;
        String address1;
        String city;
        String state;
        String zip;
        String country;
    }

    public static class CampaignDefaults {
        String from_name;
        String from_email;
        String subject;
        String language;
    }
}

