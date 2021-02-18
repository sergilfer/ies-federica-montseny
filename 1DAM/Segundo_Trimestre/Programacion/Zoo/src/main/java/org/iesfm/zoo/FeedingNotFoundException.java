package org.iesfm.zoo;

public class FeedingNotFoundException extends Exception{
    private String feeding;

    public FeedingNotFoundException(String feeding) {
        this.feeding = feeding;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        FeedingNotFoundException that = (FeedingNotFoundException) object;
        return java.util.Objects.equals(feeding, that.feeding);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), feeding);
    }
}
