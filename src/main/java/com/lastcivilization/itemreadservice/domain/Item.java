package com.lastcivilization.itemreadservice.domain;

public class Item {

    private Long id;
    private String name;
    private Details details;
    private Type type;

    public Item(Long id, String name, Details details, Type type) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public static final class Builder {

        private Long id;
        private String name;
        private Details details = Details.Builder.aDetails().build();
        private Type type;

        private Builder() {
        }

        public static Builder anItem() {
            return new Builder();
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder details(Details details) {
            this.details = details;
            return this;
        }

        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        public Item build() {
            return new Item(id, name, details, type);
        }
    }
}
