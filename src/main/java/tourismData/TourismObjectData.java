package tourismData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TourismObjectData {
    protected String label;

    protected double lat;

    protected double long_;

    protected String abstract_;

    public TourismObjectData(String label, double lat, double long_, String abstract_) {
        this.label = label;
        this.lat = lat;
        this.long_ = long_;
        this.abstract_ = abstract_;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLong_() {
        return long_;
    }

    public void setLong_(double long_) {
        this.long_ = long_;
    }

    public String getAbstract_() {
        return abstract_;
    }

    public void setAbstract_(String abstract_) {
        this.abstract_ = abstract_;
    }

}
