package entities;

public class HospitalBed {

    String hospitalName;
    String phoneNo;
    String totalAvailability;
    String vacant;
    String address;
    String lastUpdateTime;
    String normalBed;
    String oxygenBed;
    String contactPerson;
    String foundUseful;
    String notes;
    String comments;
    String upVotes;

    public String getNormalBed() {
        return normalBed;
    }

    public String getOxygenBed() {
        return oxygenBed;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getFoundUseful() {
        return foundUseful;
    }

    public String getNotes() {
        return notes;
    }

    public String getComments() {
        return comments;
    }

    public String getUpVotes() {
        return upVotes;
    }

    public HospitalBed(String hospitalName, String phoneNo, String totalAvailability, String vacant){
        this.hospitalName = hospitalName;
        this.phoneNo = phoneNo;
        this.totalAvailability = totalAvailability;
        this.vacant = vacant;

    }

    public HospitalBed(String hospitalName, String address, String phoneNo, String totalAvailability, String vacant, String lastUpdateTime){
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNo = phoneNo;
        this.totalAvailability = totalAvailability;
        this.vacant = vacant;
        this.lastUpdateTime = lastUpdateTime;

    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getTotalAvailability() {
        return totalAvailability;
    }

    public String getVacant() {
        return vacant;
    }

    public String getAddress() {
        return address;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }
}
