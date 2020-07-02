package net.sovliv.entity;

/**
 * Объект для преобразования
 */
public class Message {

    private double msisdn;
    private String action;
    private Long timestamp;

    public double getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(double msisdn) {
        this.msisdn = msisdn;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msisdn=" + msisdn +
                ", action='" + action + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
