package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String nameString;
        String employerString;
        String locationString;
        String positionTypeString;
        String coreCompetencyString;

        if (name == null || name == "") {
            nameString = "Data not available";
        }else {
            nameString = name;
        }

        if (employer == null || Objects.equals(employer.getValue(), "")){
            employerString = "Data not available";
        }else{
            employerString = employer.getValue();
        }

        if (location == null || Objects.equals(location.getValue(), "")){
            locationString = "Data not available";
        }else{
            locationString = location.getValue();
        }

        if (positionType == null || Objects.equals(positionType.getValue(), "")){
            positionTypeString = "Data not available";
        }else{
            positionTypeString = positionType.getValue();
        }
        if (coreCompetency == null || Objects.equals(coreCompetency.getValue(), "")){
            coreCompetencyString = "Data not available";
        }else{
            coreCompetencyString = coreCompetency.getValue();
        }

        return System.lineSeparator() +
                "ID: " + id + System.lineSeparator() +
                "Name: " + nameString + System.lineSeparator() +
                "Employer: " + employerString + System.lineSeparator() +
                "Location: " + locationString + System.lineSeparator() +
                "Position Type: " + positionTypeString + System.lineSeparator() +
                "Core Competency: " + coreCompetencyString + System.lineSeparator();
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
