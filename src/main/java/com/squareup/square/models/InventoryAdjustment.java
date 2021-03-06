package com.squareup.square.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;


/**
 * This is a model class for InventoryAdjustment type.
 */
public class InventoryAdjustment {

    /**
     * Initialization constructor.
     * @param id
     * @param referenceId
     * @param fromState
     * @param toState
     * @param locationId
     * @param catalogObjectId
     * @param catalogObjectType
     * @param quantity
     * @param totalPriceMoney
     * @param occurredAt
     * @param createdAt
     * @param source
     * @param employeeId
     * @param transactionId
     * @param refundId
     * @param purchaseOrderId
     * @param goodsReceiptId
     */
    @JsonCreator
    public InventoryAdjustment(
            @JsonProperty("id") String id,
            @JsonProperty("reference_id") String referenceId,
            @JsonProperty("from_state") String fromState,
            @JsonProperty("to_state") String toState,
            @JsonProperty("location_id") String locationId,
            @JsonProperty("catalog_object_id") String catalogObjectId,
            @JsonProperty("catalog_object_type") String catalogObjectType,
            @JsonProperty("quantity") String quantity,
            @JsonProperty("total_price_money") Money totalPriceMoney,
            @JsonProperty("occurred_at") String occurredAt,
            @JsonProperty("created_at") String createdAt,
            @JsonProperty("source") SourceApplication source,
            @JsonProperty("employee_id") String employeeId,
            @JsonProperty("transaction_id") String transactionId,
            @JsonProperty("refund_id") String refundId,
            @JsonProperty("purchase_order_id") String purchaseOrderId,
            @JsonProperty("goods_receipt_id") String goodsReceiptId) {
        this.id = id;
        this.referenceId = referenceId;
        this.fromState = fromState;
        this.toState = toState;
        this.locationId = locationId;
        this.catalogObjectId = catalogObjectId;
        this.catalogObjectType = catalogObjectType;
        this.quantity = quantity;
        this.totalPriceMoney = totalPriceMoney;
        this.occurredAt = occurredAt;
        this.createdAt = createdAt;
        this.source = source;
        this.employeeId = employeeId;
        this.transactionId = transactionId;
        this.refundId = refundId;
        this.purchaseOrderId = purchaseOrderId;
        this.goodsReceiptId = goodsReceiptId;
    }

    private final String id;
    private final String referenceId;
    private final String fromState;
    private final String toState;
    private final String locationId;
    private final String catalogObjectId;
    private final String catalogObjectType;
    private final String quantity;
    private final Money totalPriceMoney;
    private final String occurredAt;
    private final String createdAt;
    private final SourceApplication source;
    private final String employeeId;
    private final String transactionId;
    private final String refundId;
    private final String purchaseOrderId;
    private final String goodsReceiptId;
    /**
     * Getter for Id.
     * A unique ID generated by Square for the
     * `InventoryAdjustment`.
     */
    @JsonGetter("id")
    public String getId() {
        return this.id;
    }

    /**
     * Getter for ReferenceId.
     * An optional ID provided by the application to tie the
     * `InventoryAdjustment` to an external
     * system.
     */
    @JsonGetter("reference_id")
    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * Getter for FromState.
     * Indicates the state of a tracked item quantity in the lifecycle of goods.
     */
    @JsonGetter("from_state")
    public String getFromState() {
        return this.fromState;
    }

    /**
     * Getter for ToState.
     * Indicates the state of a tracked item quantity in the lifecycle of goods.
     */
    @JsonGetter("to_state")
    public String getToState() {
        return this.toState;
    }

    /**
     * Getter for LocationId.
     * The Square ID of the [Location](#type-location) where the related
     * quantity of items are being tracked.
     */
    @JsonGetter("location_id")
    public String getLocationId() {
        return this.locationId;
    }

    /**
     * Getter for CatalogObjectId.
     * The Square generated ID of the
     * `CatalogObject` being tracked.
     */
    @JsonGetter("catalog_object_id")
    public String getCatalogObjectId() {
        return this.catalogObjectId;
    }

    /**
     * Getter for CatalogObjectType.
     * The `CatalogObjectType` of the
     * `CatalogObject` being tracked. Tracking is only
     * supported for the `ITEM_VARIATION` type.
     */
    @JsonGetter("catalog_object_type")
    public String getCatalogObjectType() {
        return this.catalogObjectType;
    }

    /**
     * Getter for Quantity.
     * The number of items affected by the adjustment as a decimal string.
     * Can support up to 5 digits after the decimal point.
     * _Important_: The Point of Sale app and Dashboard do not currently support
     * decimal quantities. If a Point of Sale app or Dashboard attempts to read a
     * decimal quantity on inventory counts or adjustments, the quantity will be rounded
     * down to the nearest integer. For example, `2.5` will become `2`, and `-2.5`
     * will become `-3`.
     * Read [Decimal Quantities (BETA)](https://developer.squareup.com/docs/inventory-api/what-it-does#decimal-quantities-beta) for more information.
     */
    @JsonGetter("quantity")
    public String getQuantity() {
        return this.quantity;
    }

    /**
     * Getter for TotalPriceMoney.
     * Represents an amount of money. `Money` fields can be signed or unsigned.
     * Fields that do not explicitly define whether they are signed or unsigned are
     * considered unsigned and can only hold positive amounts. For signed fields, the
     * sign of the value indicates the purpose of the money transfer. See
     * [Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts)
     * for more information.
     */
    @JsonGetter("total_price_money")
    public Money getTotalPriceMoney() {
        return this.totalPriceMoney;
    }

    /**
     * Getter for OccurredAt.
     * A client-generated timestamp in RFC 3339 format that indicates when
     * the adjustment took place. For write actions, the `occurred_at`
     * timestamp cannot be older than 24 hours or in the future relative to the
     * time of the request.
     */
    @JsonGetter("occurred_at")
    public String getOccurredAt() {
        return this.occurredAt;
    }

    /**
     * Getter for CreatedAt.
     * A read-only timestamp in RFC 3339 format that indicates when Square
     * received the adjustment.
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Getter for Source.
     * Provides information about the application used to generate an inventory
     * change.
     */
    @JsonGetter("source")
    public SourceApplication getSource() {
        return this.source;
    }

    /**
     * Getter for EmployeeId.
     * The Square ID of the [Employee](#type-employee) responsible for the
     * inventory adjustment.
     */
    @JsonGetter("employee_id")
    public String getEmployeeId() {
        return this.employeeId;
    }

    /**
     * Getter for TransactionId.
     * The read-only Square ID of the [Transaction][#type-transaction] that
     * caused the adjustment. Only relevant for payment-related state
     * transitions.
     */
    @JsonGetter("transaction_id")
    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * Getter for RefundId.
     * The read-only Square ID of the [Refund][#type-refund] that
     * caused the adjustment. Only relevant for refund-related state
     * transitions.
     */
    @JsonGetter("refund_id")
    public String getRefundId() {
        return this.refundId;
    }

    /**
     * Getter for PurchaseOrderId.
     * The read-only Square ID of the purchase order that caused the
     * adjustment. Only relevant for state transitions from the Square for Retail
     * app.
     */
    @JsonGetter("purchase_order_id")
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    /**
     * Getter for GoodsReceiptId.
     * The read-only Square ID of the Square goods receipt that caused the
     * adjustment. Only relevant for state transitions from the Square for Retail
     * app.
     */
    @JsonGetter("goods_receipt_id")
    public String getGoodsReceiptId() {
        return this.goodsReceiptId;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(id, referenceId, fromState, toState, locationId, catalogObjectId,
            catalogObjectType, quantity, totalPriceMoney, occurredAt, createdAt, source, employeeId,
            transactionId, refundId, purchaseOrderId, goodsReceiptId);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof InventoryAdjustment)) {
            return false;
        }
        InventoryAdjustment inventoryAdjustment = (InventoryAdjustment) obj;
        return Objects.equals(id, inventoryAdjustment.id) &&
            Objects.equals(referenceId, inventoryAdjustment.referenceId) &&
            Objects.equals(fromState, inventoryAdjustment.fromState) &&
            Objects.equals(toState, inventoryAdjustment.toState) &&
            Objects.equals(locationId, inventoryAdjustment.locationId) &&
            Objects.equals(catalogObjectId, inventoryAdjustment.catalogObjectId) &&
            Objects.equals(catalogObjectType, inventoryAdjustment.catalogObjectType) &&
            Objects.equals(quantity, inventoryAdjustment.quantity) &&
            Objects.equals(totalPriceMoney, inventoryAdjustment.totalPriceMoney) &&
            Objects.equals(occurredAt, inventoryAdjustment.occurredAt) &&
            Objects.equals(createdAt, inventoryAdjustment.createdAt) &&
            Objects.equals(source, inventoryAdjustment.source) &&
            Objects.equals(employeeId, inventoryAdjustment.employeeId) &&
            Objects.equals(transactionId, inventoryAdjustment.transactionId) &&
            Objects.equals(refundId, inventoryAdjustment.refundId) &&
            Objects.equals(purchaseOrderId, inventoryAdjustment.purchaseOrderId) &&
            Objects.equals(goodsReceiptId, inventoryAdjustment.goodsReceiptId);
    }

    /**
     * Builds a new {@link InventoryAdjustment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InventoryAdjustment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .id(getId())
            .referenceId(getReferenceId())
            .fromState(getFromState())
            .toState(getToState())
            .locationId(getLocationId())
            .catalogObjectId(getCatalogObjectId())
            .catalogObjectType(getCatalogObjectType())
            .quantity(getQuantity())
            .totalPriceMoney(getTotalPriceMoney())
            .occurredAt(getOccurredAt())
            .createdAt(getCreatedAt())
            .source(getSource())
            .employeeId(getEmployeeId())
            .transactionId(getTransactionId())
            .refundId(getRefundId())
            .purchaseOrderId(getPurchaseOrderId())
            .goodsReceiptId(getGoodsReceiptId());
            return builder;
    }

    /**
     * Class to build instances of {@link InventoryAdjustment}
     */
    public static class Builder {
        private String id;
        private String referenceId;
        private String fromState;
        private String toState;
        private String locationId;
        private String catalogObjectId;
        private String catalogObjectType;
        private String quantity;
        private Money totalPriceMoney;
        private String occurredAt;
        private String createdAt;
        private SourceApplication source;
        private String employeeId;
        private String transactionId;
        private String refundId;
        private String purchaseOrderId;
        private String goodsReceiptId;

        /**
         * Initialization constructor
         */
        public Builder() {
           
        }

        /**
         * Setter for id
         * @param id
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }
        /**
         * Setter for referenceId
         * @param referenceId
         * @return Builder
         */
        public Builder referenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        /**
         * Setter for fromState
         * @param fromState
         * @return Builder
         */
        public Builder fromState(String fromState) {
            this.fromState = fromState;
            return this;
        }
        /**
         * Setter for toState
         * @param toState
         * @return Builder
         */
        public Builder toState(String toState) {
            this.toState = toState;
            return this;
        }
        /**
         * Setter for locationId
         * @param locationId
         * @return Builder
         */
        public Builder locationId(String locationId) {
            this.locationId = locationId;
            return this;
        }
        /**
         * Setter for catalogObjectId
         * @param catalogObjectId
         * @return Builder
         */
        public Builder catalogObjectId(String catalogObjectId) {
            this.catalogObjectId = catalogObjectId;
            return this;
        }
        /**
         * Setter for catalogObjectType
         * @param catalogObjectType
         * @return Builder
         */
        public Builder catalogObjectType(String catalogObjectType) {
            this.catalogObjectType = catalogObjectType;
            return this;
        }
        /**
         * Setter for quantity
         * @param quantity
         * @return Builder
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        /**
         * Setter for totalPriceMoney
         * @param totalPriceMoney
         * @return Builder
         */
        public Builder totalPriceMoney(Money totalPriceMoney) {
            this.totalPriceMoney = totalPriceMoney;
            return this;
        }
        /**
         * Setter for occurredAt
         * @param occurredAt
         * @return Builder
         */
        public Builder occurredAt(String occurredAt) {
            this.occurredAt = occurredAt;
            return this;
        }
        /**
         * Setter for createdAt
         * @param createdAt
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        /**
         * Setter for source
         * @param source
         * @return Builder
         */
        public Builder source(SourceApplication source) {
            this.source = source;
            return this;
        }
        /**
         * Setter for employeeId
         * @param employeeId
         * @return Builder
         */
        public Builder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }
        /**
         * Setter for transactionId
         * @param transactionId
         * @return Builder
         */
        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        /**
         * Setter for refundId
         * @param refundId
         * @return Builder
         */
        public Builder refundId(String refundId) {
            this.refundId = refundId;
            return this;
        }
        /**
         * Setter for purchaseOrderId
         * @param purchaseOrderId
         * @return Builder
         */
        public Builder purchaseOrderId(String purchaseOrderId) {
            this.purchaseOrderId = purchaseOrderId;
            return this;
        }
        /**
         * Setter for goodsReceiptId
         * @param goodsReceiptId
         * @return Builder
         */
        public Builder goodsReceiptId(String goodsReceiptId) {
            this.goodsReceiptId = goodsReceiptId;
            return this;
        }

        /**
         * Builds a new {@link InventoryAdjustment} object using the set fields.
         * @return {@link InventoryAdjustment}
         */
        public InventoryAdjustment build() {
            return new InventoryAdjustment(id,
                referenceId,
                fromState,
                toState,
                locationId,
                catalogObjectId,
                catalogObjectType,
                quantity,
                totalPriceMoney,
                occurredAt,
                createdAt,
                source,
                employeeId,
                transactionId,
                refundId,
                purchaseOrderId,
                goodsReceiptId);
        }
    }
}
