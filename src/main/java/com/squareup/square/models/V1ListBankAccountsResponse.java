package com.squareup.square.models;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;


/**
 * This is a model class for V1ListBankAccountsResponse type.
 */
public class V1ListBankAccountsResponse {

    /**
     * Initialization constructor.
     * @param items
     */
    @JsonCreator
    public V1ListBankAccountsResponse(
            @JsonProperty("items") List<V1BankAccount> items) {
        this.items = items;
    }

    private final List<V1BankAccount> items;
    /**
     * Getter for Items.
     */
    @JsonGetter("items")
    public List<V1BankAccount> getItems() {
        return this.items;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof V1ListBankAccountsResponse)) {
            return false;
        }
        V1ListBankAccountsResponse v1ListBankAccountsResponse = (V1ListBankAccountsResponse) obj;
        return Objects.equals(items, v1ListBankAccountsResponse.items);
    }

    /**
     * Builds a new {@link V1ListBankAccountsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V1ListBankAccountsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .items(getItems());
            return builder;
    }

    /**
     * Class to build instances of {@link V1ListBankAccountsResponse}
     */
    public static class Builder {
        private List<V1BankAccount> items;

        /**
         * Initialization constructor
         */
        public Builder() {
           
        }

        /**
         * Setter for items
         * @param items
         * @return Builder
         */
        public Builder items(List<V1BankAccount> items) {
            this.items = items;
            return this;
        }

        /**
         * Builds a new {@link V1ListBankAccountsResponse} object using the set fields.
         * @return {@link V1ListBankAccountsResponse}
         */
        public V1ListBankAccountsResponse build() {
            return new V1ListBankAccountsResponse(items);
        }
    }
}
