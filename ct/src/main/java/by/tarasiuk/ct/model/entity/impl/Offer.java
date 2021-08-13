package by.tarasiuk.ct.model.entity.impl;


import by.tarasiuk.ct.model.entity.Entity;

import java.time.LocalDate;

public class Offer implements Entity {
    private static final long serialVersionUID = 44109233988771624L;

    private long id;
    private long employeeId;
    private String productName;
    private float productWeight;
    private float productVolume;
    private String addressFrom;
    private String addressTo;
    private float freight;
    private LocalDate creationDate;
    private Status status;

    public enum Status {
        OPEN,
        CLOSED
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(float productWeight) {
        this.productWeight = productWeight;
    }

    public float getProductVolume() {
        return productVolume;
    }

    public void setProductVolume(float productVolume) {
        this.productVolume = productVolume;
    }

    public String getAddressFrom() {
        return addressFrom;
    }

    public void setAddressFrom(String addressFrom) {
        this.addressFrom = addressFrom;
    }

    public String getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo;
    }

    public float getFreight() {
        return freight;
    }

    public void setFreight(float freight) {
        this.freight = freight;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Offer)) {
            return false;
        }

        Offer offer = (Offer) obj;

        return id == offer.id && employeeId == offer.employeeId && productName.equals(offer.productName)
                && productWeight == offer.productWeight && productVolume == offer.productVolume
                && addressFrom.equals(offer.addressFrom) && addressTo.equals(offer.addressTo)
                && freight == offer.freight && creationDate.equals(offer.creationDate)
                && status.name().equals(offer.status.name());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + Long.hashCode(id);
        result = 31 * result + Long.hashCode(employeeId);
        result = 31 * result + ((productName != null) ? productName.hashCode() : 0);
        result = 31 * result + Float.hashCode(productWeight);
        result = 31 * result + Float.hashCode(productVolume);
        result = 31 * result + ((addressFrom != null) ? addressFrom.hashCode() : 0);
        result = 31 * result + ((addressTo != null) ? addressTo.hashCode() : 0);
        result = 31 * result + Float.hashCode(freight);
        result = 31 * result + creationDate.hashCode();
        result = 31 * result + ((status != null) ? status.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Offer{");
        sb.append("id=").append(id);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", productName='").append(productName).append('\'');
        sb.append(", productWeight=").append(productWeight);
        sb.append(", productVolume=").append(productVolume);
        sb.append(", addressFrom='").append(addressFrom).append('\'');
        sb.append(", addressTo='").append(addressTo).append('\'');
        sb.append(", freight=").append(freight);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
