package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {
//done
    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotNull(message = "Location is required.")
    @NotBlank(message = "Location is required.")
    private String location;

    @AssertTrue()
    private boolean registration;

    @Positive(message = "Attendees must be greater than 0.")
    private int attendees;

    @Pattern(regexp = "happy", message = "Incorrect password. Try again")
    private String password;

    public Event(String name, String description, String contactEmail, String location, boolean registration,
                 int attendees, String password) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registration= registration;
        this.attendees = attendees;
        this.password = password;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
